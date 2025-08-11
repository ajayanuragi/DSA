/*
1          1
12        21
12       321
1234    4321
12345  54321
123456654321
*/
public class Pattern12 {

    public static void main(String[] args) {
        int n = 6;
        pattern12(n);
    }

    static void pattern12(int n) {
        int spaces = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("");
            spaces -= 2;
        }
    }
}
