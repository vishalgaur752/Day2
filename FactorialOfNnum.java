public class FactorialOfNnum {
    public static int findFictorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            if( f >= n) {
                System.out.println(f);
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(findFictorial(n));
    }
}
