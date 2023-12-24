/*
 * public class Solution {
    public int minOperations(String s) {
        int ans = 0;
        int n = s.length();
        char[] charArray = s.toCharArray();

        for (int i = 1; i < n; i++) {
            if (charArray[i - 1] == charArray[i]) {
                if (charArray[i] == '1') {
                    charArray[i] = '0';
                } else {
                    charArray[i] = '1';
                }
                ans += 1;
            }
        }
        
        return Math.min(ans, n - ans);
    }
} 
 */

package javaPractice;

public class javap01{
        public static int minOperations(String s) {
            int ans = 0;
            int n = s.length();
            char[] charArray = s.toCharArray();
    
            for (int i = 1; i < n; i++) {
                if (charArray[i - 1] == charArray[i]) {
                    if (charArray[i] == '1') {
                        charArray[i] = '0';
                    } else {
                        charArray[i] = '1';
                    }
                    ans += 1;
                }
            }
            
            return Math.min(ans, n - ans);
        }
    public static void main(String []args){
        String s = "10110";
        int an = minOperations(s);
        System.out.println(an);
    }
}