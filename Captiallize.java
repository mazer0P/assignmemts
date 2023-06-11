import java.util.Arrays;

public class Captiallize {
    static String[] castUpper(String[] words,int len){
        if(len==0){
            words[len] = words[len].toUpperCase();
            return words;
        }
        words = castUpper(words, len-1);
        words[len] = words[len].toUpperCase();
        return words;
    }
    public static void main(String[] args) {
        String [] s = {"kunal","apple","mango","pie"};
        String[] upper = castUpper(s, s.length-1);
        System.out.println(Arrays.toString(upper));
    }
}
