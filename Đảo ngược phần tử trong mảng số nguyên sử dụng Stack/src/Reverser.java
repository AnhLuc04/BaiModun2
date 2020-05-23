import java.io.IOException;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        WStack theStack = new WStack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args)
            throws IOException {
        String input = "mWord ";
        String output;
        Reverser theReverser =
                new Reverser(input);
        output = theReverser.doRev();
        System.out.println("Reversed: " + output);
    }

    class WStack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public WStack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
