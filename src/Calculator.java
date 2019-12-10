public class Calculator {
    public static float calculator(float firstOpeand,float secondOperand, char operator) {
        switch(operator) {
            case '+': return firstOpeand + secondOperand;
            case '-': return firstOpeand - secondOperand;
            case '*': return firstOpeand * secondOperand;
            case '/':
                if(secondOperand != 0) {
                    return firstOpeand / secondOperand;
                } else {
                    throw new RuntimeException("Can't divine by zero");
                }
            default: throw new RuntimeException("Invalid operation");
        }
    }
}
