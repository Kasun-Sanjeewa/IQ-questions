public class IQ7 {
    public static void main (String[] args){

        String str = "repaper";
        String reverseStr = "";
        int count = 0;

        for (int i =0; i< str.length(); i++){
            reverseStr = str.charAt(i)+reverseStr;
        }

        //System.out.println(reverseStr);

        for (int j=0; j < str.length(); j++){
            if (str.charAt(j) == reverseStr.charAt(j)){
                count+=1;
            }else {
                System.out.println("This is not palindrome");
                break;
            }

            if (str.length()==count){
                System.out.println("This is palindrome");
            }
        }


    }
}
