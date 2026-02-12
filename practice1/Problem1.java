public class Problem1 {
   public static void main(String[] args) {

       String name = "Dinara";
       int length = name.length();

       System.out.print("+");
       for(int i = 0; i < length + 2; i++) {
           System.out.print("-");
       }
       System.out.println("+");

       System.out.println("| " + name + " |");

       System.out.print("+");
       for(int i = 0; i < length + 2; i++) {
           System.out.print("-");
       }
       System.out.println("+");
   }
}