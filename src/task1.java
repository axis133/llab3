import java.util.Scanner;

public class task1 {
    private int x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите x:");
        int x = scanner.nextInt();

        System.out.println("Введите n:");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите a[" + i + "]:");
            a[i] = scanner.nextInt();
        }
        ChainShot cs = new ChainShot(x, a);
        System.out.println(cs.getA());
    }
}
class ChainShot {
    private double A;
        ChainShot(int x, int[] a) {
            double t = a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--)
                t = a[i] + (x / t);
            A = t;
        }

        void add (ChainShot B){
            A+=B.A;
        }
        void sub (ChainShot B){
            A-=B.A;
        }
        void mp (ChainShot B){
            A*=B.A;
        }
        void div (ChainShot B){
            A/=B.A;
        }
        double getA() {
            return A;
    }
}
