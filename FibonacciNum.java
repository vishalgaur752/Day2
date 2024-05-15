public class FibonacciNum {
    public static int fibonacciNumber(int n) {
        if(n == 0 || n == 1) {
            return n;
        } 
        int fnm1 = fibonacciNumber(n - 1);
        int fnmt = fibonacciNumber(n - 2);
        int fibonaci = fnm1 + fnmt;
        return fibonaci;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonacciNumber(n));
    }
}
