package Composite;

public class CompositeOperand implements ArithmeticException{

    ArithmeticException operand1;
    ArithmeticException operand2;
    char sign;

    public CompositeOperand(ArithmeticException operand1, ArithmeticException operand2, char sign) {
        super();
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.sign = sign;
    }

    @Override
    public int getValue() {
        switch (sign){
            case '+' : return operand1.getValue() + operand2.getValue();
            case '-' : return operand1.getValue() - operand2.getValue();
            case '*' : return operand1.getValue() * operand2.getValue();
            case '/' : return operand1.getValue() / operand2.getValue();
            default: throw new RuntimeException("Unknown Sign");
        }
    }
}
