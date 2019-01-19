// https://www.hackerrank.com/challenges/java-negative-subarray/problem - start w/ JLT

// ### Under construction: subarray tools, JLT >> make it full

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private static long arraySum(int arr[], int start, int size)
    {
        long ans = 0;

        for (int i = start; i < start + size; i++)
            ans += arr[i];

        return ans;
    }

    // Dec10 uptime JLT:::
    public static void main(String[] args) {

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        int ans = 0; 

        for (int i = 1; i <= size; i++)
            for (int j = 0; j < size - i + 1; j++)      // match to correct size
                if (arraySum(arr, j, i) < 0) ans++;

        System.out.println(ans);

    }
}

