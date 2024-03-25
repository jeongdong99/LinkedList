import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = new Node<>(null);
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head.getNext() == null) {
            head.setNext(newNode);
        } else {
            Node<T> current = head.getNext();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head.getNext());
        head.setNext(newNode);
        size++;
    }

    public T get(int index) {
        if (index < size) {
            Node<T> current = head.getNext();
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        } else throw new IndexOutOfBoundsException();
    }

    public T delete(int index) {
        if (index < size) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            T deleteData = current.getNext().getData();
            current.setNext(current.getNext().getNext());
            size--;
            return deleteData;
        } else throw new IndexOutOfBoundsException();
    }

    public String toString() {
        StringBuilder s = new StringBuilder("{");
        Node<T> current = head.getNext();
        if (current == null) {
            s.append("}");
        } else {
            while (current.getNext() != null) {
                s.append(current.getData());
                s.append("->");
                current = current.getNext();
            }
            s.append(current.getData());
            s.append("}");
        }
        return s.toString();
    }

    public int getSize() {
        return size;
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

}

