import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        int max = 0;

        for(int i = 1; i < arr.length; i++) max = arr[i] > arr[max] ? i : max;
        return arr[max];

    }
}