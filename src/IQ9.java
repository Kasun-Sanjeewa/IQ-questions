public class IQ9 {
    public static void main (String[] args){
       String str = "AAppassdadadlle";

       for (int i=0; i< str.length(); i++){
           char currentChar = str.charAt(i);

           int count = 0;
           for (int j=0; j< str.length(); j++){
               if (currentChar==str.charAt(j)){
                   count = count+1;
               }
           }

           if (count<2){
               System.out.println(currentChar);
               break;
           }
       }

    }
}
