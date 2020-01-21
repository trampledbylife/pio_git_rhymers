package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countIn() {
        return intArrayStack.countIn();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }
}