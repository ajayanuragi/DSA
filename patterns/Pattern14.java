/*
A
A B
A B C
A B C D
A B C D E

*/
public class Pattern14 {

    public static void main(String[] args) {
        int n = 5;
        pattern14(n);
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char x = 'A'; x <= 'A' + i; x++) {
                System.out.print(x + " ");
            }
            System.err.println();
        }
    }
}
