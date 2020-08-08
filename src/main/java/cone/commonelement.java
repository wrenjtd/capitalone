package cone;

import java.util.HashMap;
import java.util.Map;


class mCounter{
    int counter, index;

    public mCounter(int index){
        this.counter = 1;
        this.index = index;
        
    }

    public void count(){
        counter++;
    }
}


public class commonelement {

    public static void common(String[] string1, String[] string2){
        HashMap<String, mCounter> hMap = new HashMap<>();
        for(int i = 0; i < string1.length; i++){
            if(hMap.containsKey(string1[i])){
                hMap.get(string1[i]).count();
            }
            else{
                hMap.put(string1[i], new mCounter(i));
            }
        }

        for(int i = 0; i < string2.length; i++){
            if(hMap.containsKey(string2[i])){
                hMap.get(string2[i]).count();
            }
            else{
                hMap.put(string2[i], new mCounter(i));
            }
        }

        for(Map.Entry<String, mCounter> entry: hMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().counter);
        }
    }
    
    
    public static void main(String[] args) {
        
        String[] sent1 = {"what", "are", "we", "doing", "today"};
        String[] sent2 = {"i'm", "buying", "lunch", "what", "do", "you", "want"};

        common(sent1, sent2);

    }
}
