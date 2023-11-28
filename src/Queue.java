public class Queue<T> extends LinkedList<T> {
    public Queue() {
        super();
    }

    // UC3: add enqueue method for queue
    public void enqueue(T data) {
        super.add(data); // using add to last method of linkedlist
    }
}
