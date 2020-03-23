package utils;

import java.util.Arrays;

/**
 * 
 * @author Cristian Alejandro Morales Lopez
 *
 * @param <T>
 */
public class Stack<T> {

	/**
	 * 
	 */
	public final int MAX_SIZE = Integer.MAX_VALUE;

	/**
	 * 
	 */
	private int size;

	/**
	 * 
	 */
	private Object[] array;

	/**
	 * 
	 */
	private int top;

	/**
	 * 
	 * @param type
	 */
	public Stack() {
		size = 8;
		array = new Object[size];
	}

	/**
	 * 
	 * @param type
	 */
	public Stack(int size) {
		this.size = size;
		array = new Object[size];
	}

	/**
	 * 
	 * @param object
	 * @return
	 */
	public boolean push(T object) {

		if (!isFull()) {
			array[top] = object;
			top++;
			return true;

		} else {
			if (increase()) {
				array[top] = object;
				top++;
				return true;
			} else
				return false;
		}

	}

	/**
	 * Precondition: size > 0
	 * 
	 * @return
	 */
	private boolean increase() {

		if (size * 2 > 0) {
			size *= 2;
			array = Arrays.copyOf(array, size);
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @return
	 */
	private boolean isFull() {
		return top == size - 1;
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T pop() {
		if (top > 0)
			return (T) array[--top];
		else
			return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return top;
	}

}
