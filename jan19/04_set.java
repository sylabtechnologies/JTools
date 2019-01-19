/*
https://www.hackerrank.com/challenges/java-hashset/problem
*/

package setproblem;
import java.util.*;

public class SetProblem
{
    
    static Set<String> mySet;
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> mySet = new HashSet<>();

        for (int i = 0; i < t; i++)
        {
            String toAdd = null;

            if (pair_left[i].compareTo(pair_right[i]) < 0)
                toAdd = pair_left[i] + " " + pair_right[i];
            else
                toAdd = pair_left[i] + " " + pair_right[i];
            
            mySet.add(toAdd);
            
            System.out.println(mySet.size());

        }

        
        
    }

}
