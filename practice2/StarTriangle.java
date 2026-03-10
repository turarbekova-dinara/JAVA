package practice2;

public class StarTriangle {

    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {

        String result = "";

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result += "[*]";
            }
            result += "\n";
        }

        return result;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> def40efe34b137167dde4a369f7afff656261491
