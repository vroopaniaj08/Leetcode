/*
class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int a = 5;
        while(a <= n){
            ans += n/a;
            a=a*5;
        }
        return ans;
    }
}
 */

package javaPractice;

public class javap02 {
    class sol {
        public int trailingZeroes(int n) {
            int ans = 0;
            int a = 5;
            while(a <= n){
                ans += n/a;
                a=a*5;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        javap02 obj = new javap02();
        sol myobj = obj.new sol();
        int ans = myobj.trailingZeroes(35);
        System.out.println(ans);
    }
}
