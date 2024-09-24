class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuffer output = new StringBuffer();
        for(int i = words.length - 1; i>0; i--){
            output.append(words[i]).append(" ");
        }
        output.append(words[0]);
        return output.toString();
    }
}