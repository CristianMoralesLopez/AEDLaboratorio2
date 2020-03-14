package utils;

public class Pila<T> {

	private final int SIZE = Integer.MAX_VALUE;

	private T[] array;

	private int top;

	public Pila(Class<T> type) {
		array = (T[]) java.lang.reflect.Array.newInstance(type, SIZE);
	}

	public boolean push(T object) {

		if (!isFull()) {
			array[top++] = object;
			return true;

		} else
			return false;

	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public T pop() {
		if (top > 0)
			return array[top--];
		else
			return null;
	}

}
