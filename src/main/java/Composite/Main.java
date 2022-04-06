package Composite;

public class Main {
    public static void main(String[] args) {
        ArithmeticException numericOperand = new NumericOperand(3);
        ArithmeticException compositeOperand =  new CompositeOperand(new NumericOperand(3),numericOperand,'*');
        System.out.println(compositeOperand.getValue());   
    }
}
