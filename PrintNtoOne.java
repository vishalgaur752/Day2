public class PrintNtoOne {
    public static int printNtoOne(int n) {
        if(n == 1){
            return n;
        }
        System.out.print(n + " ");
        n = printNtoOne(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printNtoOne(n));

    }
}
