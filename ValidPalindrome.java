public class ValidPalindrome {
    public static boolean validPalindrom(String str) {
        for (int i = 0; i <= str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecarr";
        System.out.println(validPalindrom(str));
    }
}
