import java.util.StringTokenizer;

public class TestTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("5.3+9.2", "+", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}