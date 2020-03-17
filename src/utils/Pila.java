package utils;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 * @param <T>
 */
public class Pila<T> {

	/**
	 * 
	 */
	private final int SIZE = 10;

	/**
	 * 
	 */
	private T[] array;

	/**
	 * 
	 */
	private int top;

	/**
	 * 
	 * @param type
	 */
	public Pila(Class<T> type) {
		array = (T[]) java.lang.reflect.Array.newInstance(type, SIZE);
	}

	/**
	 * 
	 * @param object
	 * @return
	 */
	public boolean push(T object) {

		if (!isFull()) {
			array[top++] = object;
			return true;

		} else
			return false;

	}

	/**
	 * 
	 * @return
	 */
	public boolean isFull() {
		return top == SIZE - 1;
	}

	/**
	 * 
	 * @return
	 */
	public T pop() {
		if (top > 0)
			return array[top--];
		else
			return null;
	}

}
