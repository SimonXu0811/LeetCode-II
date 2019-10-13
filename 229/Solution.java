public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null) {
            return res;
        }
        int n1 = 0, n2 = 0;
        int c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; ++i) {
            int n3 = nums[i];
            if (c1 > 0 && c2 > 0) {
                if (n3 != n1 && n3 != n2) {
                    c1--;
                    c2--;
                } else if (n3 == n1) {
                    c1++;
                } else {
                    c2++;
                }
            } else if (c1 > 0) {
                if (n3 == n1) {
                    c1++;
                } else {
                    n2 = n3;
                    c2++;
                }
            } else if (c2 > 0) {
                if (n3 == n2) {
                    c2++;
                } else {
                    n1 = n3;
                    c1++;
                }
            } else {
                n1 = n3;
                c1++;
            }
        }
        c1 = c2 = 0;
        for (int i = 0; i < nums.length; ++i) { 
            if (nums[i] == n1) {
                c1 ++;
            } else if (nums[i] == n2) {
                c2 ++;
            }
        }
        if (c1 > nums.length/3) {
            res.add(n1);
        }
        if (c2 > nums.length/3) {
            res.add(n2);
        }
        return res;
    }
}
