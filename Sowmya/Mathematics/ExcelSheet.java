class ExcelSheet {
    public String convertToTitle(int columnNumber) {
        StringBuffer result = new StringBuffer();
        while(columnNumber > 26){
            int rem = columnNumber % 26;
            if(rem==0){
                rem += 26;
                columnNumber -= 1;
            }
            result.append((char)(rem + 64));
            columnNumber /= 26;
        }
        result.append((char)(columnNumber + 64));
        result.reverse();
        return result.toString();
    }
}