import java.util.*;
class ChocolateDistribution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int min_diff = Integer.MAX_VALUE;
        Collections.sort(a);
        int i = 0;
        int j = m - 1;
        while(j < n){
            int diff = a.get(j) - a.get(i);
            if(diff < min_diff){
                min_diff = diff;
            }
            i += 1;
            j += 1;
        }
        return min_diff;
    }
}