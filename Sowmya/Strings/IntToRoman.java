import java.util.*;
class IntToRoman {
    public String intToRoman(int num) {
        HashMap<Integer, String> numMap = new HashMap<>();

        numMap.put(1, "I");
        numMap.put(4, "IV");
        numMap.put(5, "V");
        numMap.put(9, "IX");
        numMap.put(10, "X");
        numMap.put(40, "XL");
        numMap.put(50, "L");
        numMap.put(90, "XC");
        numMap.put(100, "C");
        numMap.put(400, "CD");
        numMap.put(500, "D");
        numMap.put(900, "CM");
        numMap.put(1000, "M");

        StringBuffer result = new StringBuffer();
        int[] numList = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for(int n : numList){
            while(n<=num){
                result.append(numMap.get(n));
                num -= n;
            }
        }
        return result.toString();
    }
}