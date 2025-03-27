import java.util.Arrays;

public class IQ2 {

    public static void main(String[] args) {
        boolean anagram = false;
        String str = "listen";
        String anagramText = "silxnt";

        if (str.length() != anagramText.length()) {
            System.out.println(str + " and " + anagramText + " are not anagram");
            return;
        } else {
            char[] array1 = str.toCharArray();
            char[] array2 = anagramText.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            anagram = Arrays.equals(array1, array2);
        }

        if (anagram == true) {
            System.out.println(str + " and " + anagramText + " are anagram");
        } else {
            System.out.println(str + " and " + anagramText + " are not anagram");
        }
    }

}
