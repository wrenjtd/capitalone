package cone;

public class charcount {
    
    public static void count(String word, int substring){
        char letter = word.charAt(substring);
        int times = 0;
        for(char i : word.toCharArray()){
            if(letter == i){
                times++;
            }
        }
        System.out.println("There are " + times + " " + letter + "'s' in " + word);
    }



    public static void main(String[] args) {
        String word = "Hippopotamus";
        int substring = 2;

        count(word, substring);
    }
}