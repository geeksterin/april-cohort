package practice.praticeclass06;

public class Stack<T> {
    T arr[];
    int size;
    Stack(T elements[]) {
        arr = elements;
    }

    public void push(T element) {
        arr[size++] = element;
    }

    public T pop() {
        T element = arr[size--];
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
