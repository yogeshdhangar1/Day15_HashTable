import java.util.HashMap;
import java.util.Set;
public class HashTableBst {
    public void remove(String str ,String word){
        // split The String Using Split () method
        String [] msg = str.split(" ");
        String new_wrd = " ";
        // Iterating By using for each loop
        for(String words:msg){
            if(!words.equals(word)){
                new_wrd += words+" ";

            }
        }
        System.out.println(new_wrd);
    }
    public static void main(String[] args) {
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        // Word Remove From String Word
      String word =  "avoidable";
      // calling Method By passing Both String
        HashTableBst tree = new HashTableBst();
        tree.remove(str,word);
    }
    }

