public class MyStack<T> {
    MyLinkedList<T> list;
    Node<T> top;

    public MyStack() {
        list = new MyLinkedList<>();
        top = list.getHead();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void push(T data) {
        list.addFirst(data);
        top = list.getHead();
    }

    public T pop() {
        if (!isEmpty()) {
            top = list.getHead().getNext();
            return list.delete(0);
        }
        return null;
    }
    public String toString() {
        return list.toString();
    }
    public int getSize() {
        return list.getSize();
    }

}
