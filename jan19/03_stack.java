/*

https://www.hackerrank.com/challenges/java-stack/problem

 */
package stacktproblem;

import java.util.*;

public class stacktproblem {
    static Map<Character, Character> bracketPairs;
    public static void main(String[] args)
    {
        bracketPairs = new TreeMap<>();
        bracketPairs.put( ')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');

        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext())
        {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        
    }
    
    private static boolean isBalanced(String s)
    {
        Stack<Character> mystack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (mystack.empty())
            {
                mystack.push(s.charAt(i));
                continue;
            }
            
            Character compare = bracketPairs.get(s.charAt(i));
            
            if (compare == null)
            {
                mystack.push(s.charAt(i));
                continue;
            }
            
            
            Character peek = mystack.peek();
            
            if (Character.compare(peek, compare) == 0)
            {
                mystack.pop();
            }

        }

        if (mystack.empty())
            return true;
        else
            return false;
    }
       
}

