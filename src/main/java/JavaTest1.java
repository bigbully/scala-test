import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bigbully on 15/2/5.
 */
public class JavaTest1 {


    public static void main(String[] args) {




        List<String> sentences = new ArrayList<String>();
        sentences.add("This is the first sentence.");
        sentences.add("This is the second sentence.");
        sentences.add("This is the third sentence.");

        Map<String, List<String>> wordMap = makeWordMap(sentences);
        System.out.println(wordMap);
    }


    public static List<String> words(String sentence) {
        List<String> list = new ArrayList<String>();
        for(String word : sentence.split(" ")) {
            list.add(word);
        }
        return list;
    }

    public static Map<String, List<String>> makeWordMap(
            List<String> sentences) {

        Map<String, List<String>> result =
                new HashMap<String, List<String>>();

        for (String sentence: sentences) {
            for (String word: words(sentence)) {
                List<String> sentencesForWord = result.get(word);
                if (sentencesForWord == null) {
                    sentencesForWord = new ArrayList<String>();
                    result.put(word, sentencesForWord);
                }
                sentencesForWord.add(sentence);
            }
        }

        return result;
    }

}
