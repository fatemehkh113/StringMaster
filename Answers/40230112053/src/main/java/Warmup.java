public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        int size=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                size++;
            }
        }
        String[] sen = sentence.split(" ", size+1);
        if (number <= sentence.length()) {
            return sen[number];
        } else {
            return "Number = " + number + " is out Of Bound";
        }
    }


    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int countz=0;
        int countf=0;
        if(searchForEven==true){
            for (int i=0;i<number.length();i++){
                if(number.charAt(i)%2==0){
                    countz++;
                }
            }
            return (countz);
        }
        else{
            for (int i=0;i<number.length();i++){
                if(number.charAt(i)%2!=0){
                    countf++;
                }
            }
            return (countf);
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        String s=" ";
        for (int i = 0; i < wordA.length(); i++) {
            if (wordA.charAt(i) < wordB.charAt(i)) {
                s = wordA;
            } else if (wordA.charAt(i) > wordB.charAt(i)) {
                s = wordB;
            } else
                continue;
        }
        return s;

    }
}
