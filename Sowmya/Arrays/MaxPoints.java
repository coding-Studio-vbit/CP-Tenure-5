class MaxPoints {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int size = len - k;
        int window = 0;
        int points = 0;
        for(int i = 0; i<len; i++){
            points += cardPoints[i];
        }
        for(int i = 0; i<size; i++){
            window += cardPoints[i];
        }
        int result = points - window;
        int j = 0;
        for(int i = size; i<len; i++){
            window -= cardPoints[j++];
            window += cardPoints[i];
            if((points - window) > result){
                result = points - window;
            }
        }
        return result;
    }
}