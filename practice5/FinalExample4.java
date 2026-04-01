import java.util.*;

public class FinalExample4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringTokenizer expressions = new StringTokenizer(input, " ");

        while (expressions.hasMoreTokens()) {

            String expr = expressions.nextToken();
            StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

            try {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand, rightOperand, result = 0;

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException e) {
                    System.out.println("Left operand is not a number: " + leftString);
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException e) {
                    System.out.println("Right operand is not a number: " + rightString);
                    continue;
                }

                if (operator.equals("+"))
                    result = leftOperand + rightOperand;
                else if (operator.equals("-"))
                    result = leftOperand - rightOperand;
                else if (operator.equals("*"))
                    result = leftOperand * rightOperand;
                else if (operator.equals("/"))
                    result = leftOperand / rightOperand;

                System.out.println(expr + " = " + result);
            }
            catch (NoSuchElementException e) {
                System.out.println("Invalid expression: " + expr);
            }
            catch (ArithmeticException e) {
                System.out.println("Divide by zero in: " + expr);
            }
        }
    }
}