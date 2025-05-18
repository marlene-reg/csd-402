public class Loops {
    public static void main(String[] args) {
        int rows = 7;
 
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print("  ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }
            num /= 2;
            for (int j = 1; j < i; j++) {
                num /= 2;
                System.out.print(num + " ");
            }
            for (int j = 35; j > 18; j--) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }
    }
}

