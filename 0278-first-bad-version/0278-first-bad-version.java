/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
        return recursiveSearch(1, n);
    }
    
    private int recursiveSearch(int start, int end){
        if(start > end) return end;
        
        int mid = start + (end - start)/2;
        
        if(isBadVersion(mid)){  // true
            if(!isBadVersion(mid-1)){   // mid가 최초의 bad version인 경우
                return mid;
            }
            else {  // 최초는 아닌 경우 -> 왼쪽 범위로 이동
                return recursiveSearch(start, mid-1);
            }
        }
        else {  // false -> bad version을 탐색하러 오른쪽으로 범위 이동
            return recursiveSearch(mid+1, end);
        }
    }
}