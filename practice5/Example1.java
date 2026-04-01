public class Example1
{
    public static void main(String[] args)
    {
        int denominator, numerator, ratio;

        numerator = 5;
        denominator = 0; // 0

		try {
            ratio = numerator / denominator;
			System.out.println("The answer is: " + ratio); // step 6
        }
        catch (ArithmeticException e) {
			System.out.println("Divide by 0."); //step 7
			e.printStackTrace(); //step 8
        }

        System.out.println("Done.");
    }
}