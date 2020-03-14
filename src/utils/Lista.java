package utils;

public class Lista<T> {

	private Node<T> root;

	public class Node<T> {

		private T object;

		protected Node next;

		protected int id;

		public Node(int id, T object) {
			this.id = id;
			this.object = object;
		}

		public void add(T object) {
			if (next != null)
				next.add(object);
			else
				next = new Node<T>(id + 1, object);
		}

		/**
		 * @return the object
		 */
		public T getObject() {
			return object;
		}

		/**
		 * @param object the object to set
		 */
		public void setObject(T object) {
			this.object = object;
		}
	}

	/**
	 * @return the root
	 */
	public Node<T> getRoot() {
		return root;
	}

}
