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
	private int size;

	/**
	 * 
	 */
	public Cola() {
		size = 0;
	}

	/**
	 * 
	 * @param object
	 */
	public void add(T object) {
		if (root != null) {
			root.add(object);
			size++;
		} else
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
			size--;
		}
		return answer;
	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T get(int i) {

		T object = null;
		if (i >= 0 && i < getSize()) {

			Node<T> copy = root;
			T[] array = (T[]) new Object[getSize()];

			for (int j = 0; j < array.length && copy != null; j++)
				if (j == i)
					object = copy.getObject();
				else
					copy = copy.next;

		}
		return object;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T[] getArray() {
		Node<T> copy = root;
		T[] array = (T[]) new Object[getSize()];
		for (int i = 0; i < array.length; i++) {
			array[i] = copy.getObject();
			copy = copy.next;
		}
		return array;
	}

	/**
	 * 
	 * @author Cristian Alejandro Morales Lopez
	 *
	 * @param <T>
	 */
	@SuppressWarnings("hiding")
	private class Node<T> {

		/**
		 * 
		 */
		private T object;

		/**
		 * 
		 */
		protected Node<T> next;

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
