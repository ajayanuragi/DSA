public class Pattern17 {

    public static void main(String[] args) {
        int n = 4;
        pattern17(n);
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            //spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }

            //spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
