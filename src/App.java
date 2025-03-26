public class App {
    public static void main(String[] args) throws Exception {
        String str = "Hello";
        String reverseStr = "";

        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }

        System.out.println(reverseStr);
    }
}
