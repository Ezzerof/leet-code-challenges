package Easy;
// isBadVersion
public class FirstBadVersion {

    static int firstbadVersion(int n) {
        if (n == 1)
            return 1;

        int start = 1;
        int end = n;
        int min = Integer.MAX_VALUE;

        while(start <= end){
            int mid = (start + end)/2;
            if (isBadVersion(mid)){
                min = Math.min(min, mid);
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return min;
    }

}
