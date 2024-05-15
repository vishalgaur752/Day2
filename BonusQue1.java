public class BonusQue1 {
    public static int sumOfNnum(int n) {
        if (n == 1) {
            return n;
        }
        int sum = (n * n * n) + sumOfNnum(n-1);
        n = sumOfNnum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNnum(n));
    }
}
