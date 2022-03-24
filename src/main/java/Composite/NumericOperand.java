package Composite;

public class NumericOperand implements ArithmeticException {

    private final int value;

    public NumericOperand(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
