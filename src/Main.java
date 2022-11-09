public class Main {
    public static void main(String[] args) {


        System.out.println(stringParse("peanut butter", "butt"));
        //hahahaha butt

    }

    public static boolean stringParse(String phrase, String key){

        //Loop through the letters of phrase
        for (int i = 0; i < phrase.length() ; i++) {

        boolean foundIt = true;
            //Loop through the letters of keyword
            for (int j = 0; j < key.length(); j++) {


                //check if the letters are the same.
                if( phrase.charAt(i+j)  == key.charAt(j) ){

                }
                else{
                    //If they are different, break this loop
                    foundIt = false;
                    break;

                }




                //End loop
            }

            //If the loop finishes without breaking: return true
if(foundIt){
    return true;
}
            //End Loop
        }
        //you didn't find it, return false.
        return false;
    }


}