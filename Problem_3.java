/*
Problem:
 Check if string s2 is a rotation of s1.
Example:
 Input: "ABCD", "CDAB"
 Output: true

*/
package twenty_three_jan;

public class Problem_3 {
	static boolean isRotation(String s1, String s2) {
        int n = s1.length();
        if (n != s2.length())
            return false;

        for (int i = 0; i < n; i++) {   
            int count = 0;

            while (count < n &&
                   s1.charAt((i + count) % n) == s2.charAt(count)) {
                count++;
            }

            if (count == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "CDAB"));  


	 
    }

}
