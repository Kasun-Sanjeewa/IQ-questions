//How do you calculate the number of vowels and consonants in a String?
public class IQ3 {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;

        String str = "Hello World";

        String x = str.toUpperCase();
        System.out.println(x);

        for (int i = 0; i < str.length(); i++) {
            if (x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I' || x.charAt(i) == 'O'
                    || x.charAt(i) == 'U') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }
}
