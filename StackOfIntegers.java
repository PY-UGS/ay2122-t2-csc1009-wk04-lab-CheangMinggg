public class StackOfIntegers {

    private int elements[];
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return (this.size > -1) ? false : true;
    }

    public int peek() {
        return this.elements[-1];
    }

    public void push(int value) {
        this.size++;
        this.elements[this.size] = value;
    }

    public int pop() {
        if (!this.empty()) {
            int value = this.elements[this.size];
            this.size--;
            return value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return this.size;
    }

}