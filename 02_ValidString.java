// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

package validstring;
import java.util.*;

public class ValidString {
    
    // map the chars
    private TreeMap<Character, Integer> cMap;
    // then map the frequencies
    
    ValidString(String str)
    {
        cMap = new TreeMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            
            char mychar = str.charAt(i);
            
            if (cMap.get(mychar) == null)
                cMap.put(mychar, 1);
            else
            {
                int myint = cMap.get(mychar) + 1;
                cMap.put(mychar, myint);
            }

        }
    }
    
    public String isValid()
    {
        ArrayList<Integer> frqSet = new ArrayList<>();

        for (Map.Entry<Character,Integer> entry : cMap.entrySet())
            frqSet.add(entry.getValue());
        
        if (frqSet.size() == 1) return "YES";
        
        Collections.sort(frqSet);
        
        int start = frqSet.get(0);
        String ans = "YES";
        for (int i = 1; i < frqSet.size(); i++) {
            if (frqSet.get(i) != start) {
                if (Math.abs(frqSet.get(i) - start) >= 2) {
                    ans = "NO";
                    break;
                }
                
                if (frqSet.size() - i >= 2)
                {
                    ans = "NO";
                    break;
                }
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
        ValidString v = new ValidString("aaaabbcc");
        
        System.out.println(v.isValid());
        
    }
    
}
