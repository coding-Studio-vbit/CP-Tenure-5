import java.util.*;
class ValidParenthesis {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        else{
            Stack <Character> stack = new Stack<Character>();
            HashMap <Character, Character> hm = new HashMap<Character, Character>();
            hm.put(')','(');
            hm.put(']','[');
            hm.put('}','{');
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                if((ch==hm.get(')')) || (ch==hm.get(']')) || (ch==hm.get('}'))){
                    stack.push(ch);
                }
                else if((ch==')') || (ch==']') || (ch=='}')){
                    if((stack.size()==0) || (stack.pop()!=hm.get(ch))){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
            }
            if(stack.size()>0){
                return false;
            }
            return true;
        }
    }
}