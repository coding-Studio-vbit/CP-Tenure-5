class GenParenthesis {
    public List<String> generateParenthesis(int n) {
        ArrayList <String> result = new ArrayList<String>();
        ArrayList <Character> sub = new ArrayList<Character>();
        backtrack(result, sub, n, 0, 0);
        return result;
    }
    public static void backtrack(ArrayList<String> result, ArrayList <Character> sub, int n, int open, int close){
        if(sub.size()==2*n){
            result.add(join(sub));
        }
        else{
            if(open<n){
                sub.add('(');
                backtrack(result, sub, n, open+1, close);
                sub.remove(sub.size() - 1);
            }
            if(close<open){
                sub.add(')');
                backtrack(result, sub, n, open, close+1);
                sub.remove(sub.size() - 1);
            }
        }
    }
    public static String join(ArrayList<Character> sub){
        StringBuffer output = new StringBuffer();
        for(int i = 0; i<sub.size(); i++){
            output.append(sub.get(i));
        }
        return output.toString();
    }
}