public class App {
    public static void main(String[] args) throws Exception {

        // creating a stack
        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        // prints the stack horizontally
        // i.e. first element is the bottom-most in stack
        System.out.println(stack);
    }
}