public class IQ8 {

    public  String DuplicateFinder( String duplicateStr ){
        String noDuplicateStr = "";
        for (int i =0; i < duplicateStr.length(); i++){
            char currentChar = duplicateStr.charAt(i);

            if (noDuplicateStr.indexOf(currentChar)== -1){
                noDuplicateStr = noDuplicateStr + currentChar;
            }
        }
        return noDuplicateStr;
    }

    public static void main (String[] args){
        String duplicateStr = "Apppppfhfhfffhhddle";
        IQ8 obj = new IQ8();
        System.out.println(obj.DuplicateFinder(duplicateStr));
    }
}
