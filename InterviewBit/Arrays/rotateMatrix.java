/*You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is
[
    [1, 2,3,4],
    [5,6,7,8],
	  [9,10,11,12],
	  [13,14,15,16]
]

Then the rotated array becomes:
[
    [13,9,5,1],
    [14,10,6,2],
	  [15,11,7,3],
	  [16,12,8,4]
]
*/

public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for(int level=0;level<n/2;level++) {
            for(int y=level; y< n-level-1;y++) {
                int temp = a.get(level).get(y);
                a.get(level).set(y, a.get(n-1-y).get(level));
                a.get(n-1-y).set(level, a.get(n-1-level).get(n-1-y));
                a.get(n-1-level).set(n-1-y, a.get(y).get(n-1-level));
                a.get(y).set(n-1-level, temp);
            }
        }
    }
}
