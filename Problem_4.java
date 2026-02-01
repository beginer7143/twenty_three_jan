/*
Problem:
 Sort an array containing 0, 1, and 2 without using library sort.
Example:
 Input: [2,0,2,1,1,0]
 Output: [0,0,1,1,2,2]

*/
package twenty_three_jan;

public class Problem_4 {
public static void main(String[] args) {
    int[] arr = {2, 0, 2, 1, 1, 0};

    int count0 = 0, count1 = 0, count2 = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) count0++;
        else if (arr[i] == 1) count1++;
        else count2++;
    }

    int index = 0;

    for (int i = 0; i < count0; i++) arr[index++] = 0;
    for (int i = 0; i < count1; i++) arr[index++] = 1;
    for (int i = 0; i < count2; i++) arr[index++] = 2;

    for (int n : arr) {
        System.out.print(n + " ");
    }
}

}

