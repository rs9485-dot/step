public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();

            result = result + word;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "hello club";

        System.out.println(reverseEachWord(sentence));
    }
}