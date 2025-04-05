public class App {
    public static void main(String[] args) throws Exception {
        String str = "repaper";
        String reverseStr = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == reverseStr.charAt(j)) {
                count = count + 1;
            } else {
                System.out.println("This is not Palindrome");
                break;
            }

            if (str.length() == count) {
                System.out.println("This is Palindrome");
            }
        }
        // ----------------------------------------------
        // for (int i = 0; i < str.length(); i++) {
        // reverseStr = str.charAt(i) + reverseStr;
        // }

        // if (str.equals(reverseStr)) {
        // System.out.println("THis is Palindrome");
        // } else {
        // System.out.println("THis is not Palindrome");
        // }

    }
}
