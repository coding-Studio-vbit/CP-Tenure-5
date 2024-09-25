import java.util.*;
class GroupAna {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strs){
            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);
            String key = new String(chArray);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}