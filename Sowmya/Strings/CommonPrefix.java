import java.util.*;
class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        if(strs.length == 1){
            return strs[0];
        }
        if(strs[0].length()==0){
            return "";
        }
        String output = "";
        String last = strs[strs.length - 1];
        for(int i = 0; i<strs[0].length(); i++){
            if(last.startsWith(output+strs[0].charAt(i))){
                output += strs[0].charAt(i);
                continue;
            }
            break;
        }
        return output;
    }
}