import java.util.Objects;
import java.util.Scanner;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * <p>
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord
     */
    public String wordCensor(String sentence, String word, String newWord) {
        String result_str = sentence.replace(word, newWord);
        result_str = result_str.replaceAll("\\s+", " ");
        return result_str;
    }


    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
                String result= firstName.substring(0, 1).toUpperCase() + firstName.substring( 1).toLowerCase();
                String r=lastName.substring(0, 1).toUpperCase() + lastName.substring( 1).toLowerCase();
                return (result+" "+r);
            }


    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        char[] st=word.toCharArray();
        for(int i=1;i<word.length();i++){
            if(st[i]==st[i-1]){
                st[i]='0';
            }
        }
        String s="";
        for(int i=0;i<word.length();i++){
            if(st[i]!='0'){
                s=s+st[i];
            }
        }
        return s;
    }
    }

