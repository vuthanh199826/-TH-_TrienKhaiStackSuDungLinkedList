public class Client {
    public static void main(String[] args) {
       stackOfStrings();
       stackOfInterger();
    }
    private static void stackOfStrings() {
        MyGenericsTack<String> stack = new MyGenericsTack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.printf(stack.pop());
        }
        System.out.println(stack.size());
    }
    private static void stackOfInterger() {
        MyGenericsTack<Integer> stack = new MyGenericsTack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }
}
