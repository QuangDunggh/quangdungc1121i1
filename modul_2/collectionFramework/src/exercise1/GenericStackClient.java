package exercise1;

public class GenericStackClient {
    private static void StackOfIsString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.print("Element in stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.getElement() + " ");
        }
        System.out.println("\n1.2 Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n1.3. Size of stack after pop operations: " + stack.size());
    }

    private static void StackOfIsInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.print("Element in stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.getElement() + " ");
        }
        System.out.println("\n2.2 Pơp element from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n2.3. Size of stack after pop operations:" + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of Integer: ");
        StackOfIsInteger();
        System.out.println("Stack of String: ");
        StackOfIsString();
    }
}
