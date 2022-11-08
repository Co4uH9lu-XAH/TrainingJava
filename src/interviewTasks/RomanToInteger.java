package interviewTasks;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static Map<Character, Integer> romanMap;

    static {
        romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int convertedInt(String string){
        int result = 0;
        char [] chars = string.toCharArray();
        for(int i = 0; i<chars.length; i++){
           if(i<chars.length-1){
               if (romanMap.get(chars[i])>=romanMap.get(chars[i+1])){
                   result = result+romanMap.get(chars[i]);
               } else if (romanMap.get(chars[i]) < romanMap.get(chars[i+1])){
                   result = result+romanMap.get(chars[i+1])-romanMap.get(chars[i]);
                   i++;
               }
           } else {
               result = result+romanMap.get(chars[i]);
           }
        }
        return result;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(RomanToInteger.convertedInt("CMVII"));
    }
}

