//Find the number of occurrences of a character in a String?
public class IQ1 {
    public static void main(String[] args) {
        String str = "Hello world";
        char search = 'l';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                count++;
            }
        }

        System.out.println(count);
    }
}
