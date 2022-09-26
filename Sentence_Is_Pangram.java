public class Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        //String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
        
    }

    static boolean checkIfPangram(String sentence) {
        
        for(int i = 97; i <= 122; i++)
        if(sentence.indexOf((char)  i) == -1)  //-1 denotes character does not exists
            return false;
        return true;
}
}
