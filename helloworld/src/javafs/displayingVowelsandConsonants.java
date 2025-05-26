package javafs;

public class displayingVowelsandConsonants {

    public static void main(String args[]) {

        String str = "geeks for geeks";
        String cons = "";
        String vowls = "";

        for (Character c : str.toCharArray())
        //
         //for(int i =0 ;i<str.length();i++)
        // {
            // char c=str.charAt();

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vowls += c + " ";
            }
            else if(Character.isLetter(c))
            {
                cons+= c + " ";
            }
        //}

        System.out.println("Vowels :" +vowls);
        System.out.println("Consonants :" +cons);

    }

}