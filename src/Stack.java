public class Stack<T> extends LinkedList<T> {

    public Stack() {
        super();
    }

    // UC1: add push method to stack
    public void push(T data) {
        super.add(data); // using add to last method of linked list
    }
}
