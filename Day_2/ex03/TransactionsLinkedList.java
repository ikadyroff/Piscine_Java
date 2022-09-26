import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {
	private int len = 0;
	private TransactionNode begin = new TransactionNode(null, null, null);
	private TransactionNode	end = new TransactionNode(null, null, null);

	public TransactionsLinkedList() {
		begin.setNext(end);
		end.setPrevious(begin);
	}

	public void addTransaction(Transaction transaction) {
        begin.setNext(new TransactionNode(begin.getNext(), begin, transaction));
        len++;
    }

    public void removeById(UUID uuid) {
        TransactionNode tmp = begin.getNext();
        while (tmp != end) {
            if (tmp.getData().getIdentifier() == uuid) {
                tmp.getPrevious().setNext(tmp.getNext());
                tmp.getNext().setPrevious(tmp.getPrevious());
                tmp.setNext(null);
                tmp.setPrevious(null);
                tmp.setData(null);
                len--;
                return;
            }
            tmp = tmp.getNext();
        }
        throw new TransactionNotFoundException();
    }

	public Transaction[] toArray() {
        Transaction[] tmp = new Transaction[len];
        TransactionNode tmpNode = begin.getNext();

        if (tmpNode.getData() != null) {
            for (int i = 0; i < len; i++) {
                tmp[i] = tmpNode.getData();
                tmpNode = tmpNode.getNext();
            }
        }

        return tmp;
    }

	private static class TransactionNode {

        private TransactionNode	next;
        private TransactionNode	previous;
        private Transaction		data;

        public TransactionNode(TransactionNode next, TransactionNode previous, Transaction data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }

		public TransactionNode getNext() {
			return next;
		}

		public void setNext(TransactionNode next) {
			this.next = next;
		}

		public TransactionNode getPrevious() {
			return previous;
		}

		public void setPrevious(TransactionNode previous) {
			this.previous = previous;
		}

		public Transaction getData() {
			return data;
		}
		
		public void setData(Transaction data) {
			this.data = data;
		}
	}
}
