/*
A B C D E
A B C D
A B C
A B
A

*/
public class Pattern15 {

    public static void main(String[] args) {
        int n = 5;
        pattern15(n);
    }

    static void pattern15(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (char x = 'A'; x <= 'A' + i; x++) {
                System.out.print(x + " ");
            }
            System.err.println();
        }
    }
}
