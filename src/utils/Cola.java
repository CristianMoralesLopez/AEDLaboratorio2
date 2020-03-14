package utils;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 * @param <T>
 */
public class Cola<T> {

	/**
	 * 
	 */
	private Node<T> root;

	/**
	 * 
	 */
	public Cola() {

	}

	/**
	 * 
	 * @param object
	 */
	public void add(T object) {
		if (root != null)
			root.add(object);
		else
			root = new Node<T>(object);
	}

	/**
	 * @return the root
	 */
	public T pop() {
		T answer = null;
		if (root != null) {
			answer = root.object;
			root = root.next;
		}
		return answer;
	}

	/**
	 * 
	 * @author Cristian Alejandro Morales Lopez
	 *
	 * @param <T>
	 */
	public class Node<T> {

		/**
		 * 
		 */
		private T object;

		/**
		 * 
		 */
		protected Node next;

		/**
		 * 
		 * @param id
		 * @param object
		 */
		public Node(T object) {
			this.object = object;
		}

		/**
		 * 
		 * @param object
		 */
		public void add(T object) {
			if (next != null)
				next.add(object);
			else
				next = new Node<T>(object);
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

}
