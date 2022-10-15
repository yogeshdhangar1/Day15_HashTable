import java.util.HashMap;
import java.util.Set;
public class HashTableBst {
    static void sentence(String inputString){
        HashMap<String,Integer> count = new HashMap<>();
        count = new HashMap<>();
        String [] words = inputString.split(" ");
        for(String word: words){
            if(count.containsKey(word)){
                count.put(word, count.get(word)+1);
            }else{
                count.put(word,1);
            }
        }
        Set<String> wordInString = count.keySet();
        System.out.println("Frequency of words in sentence 'To be or not to be' is");
        System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
                + " they are paranoid but because they keep putting themselves deliberately into"
                + " paranoid avoidable situations' is");
               for (String word:wordInString){
            if(count.get(word)>1){
                System.out.println(word+ " :"+count.get(word));
            }
        }
    }

    public static void main(String[] args) {
        sentence("To Be Or Not To Be");
        sentence("Paranoids are not paranoid because they are paranoid but because "
                + "they keep putting themselves deliberately into paranoid avoidable situations");
    }
    }

