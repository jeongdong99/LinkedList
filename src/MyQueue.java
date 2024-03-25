public class MyQueue<T> {
    MyLinkedList<T> list;
    Node<T> head;

    public MyQueue() {
        list = new MyLinkedList<>();
        head = list.getHead();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void offer(T data) {
        list.add(data);
    }

    public T poll() {
        if (!isEmpty()) {
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
