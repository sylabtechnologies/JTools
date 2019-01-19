/*

https://coderanch.com/t/680162/java/code-skip-scanner-input
https://www.hackerrank.com/challenges/phone-book/problem

 */
package maptproblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class listproblem {

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        
        for(int i=0; i < n; i++)
        {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            sc.nextLine();
            
            phoneBook.put(name, phone);
        }
        
        while (sc.hasNext())
        {
            String s = sc.nextLine();
            Integer ans = phoneBook.get(s);

            if (ans != null)
            {
                System.out.print(s);
                System.out.print("=");
                System.out.println(ans);
            }
            else
                System.out.println("Not found");
        }

    }
    
}

