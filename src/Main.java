public class Main {
    public static void main(String[] args) {
        int intOperandA = 33;
        int intOperandB = 2;
        int intSum = 342;
        int intProduct = 393;
        int intDifference = 94;
        int intQuotient = 102;
        int intModulo = 100020;
        double doubleOperandA = 9.3;
        double doubleOperandB = 5.5;
        double doubleSum = 32.3;
        double doubleProduct = 9210.2;
        double doubleDifference = 512.32;
        double doubleQuotient = 1.11111;
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using the ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using the ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of the ints " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of the ints " + intOperandA + " and " + intOperandB + " is " + intModulo);
    }
}