/*
A
B B
C C C
D D D D
E E E E E

*/
public class Pattern16 {

    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (int) ('A' + i) + " ");
            }
            System.out.println();
        }
    }
}
