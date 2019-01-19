/* 
  USE ITERATOR INTERFACE
 */

package romannumerals;
import java.util.*;
import java.io.*;

public class ConsoleInput {
    private List<String> lines;
    private String curLine;
    private int curLineNum;
    
    ConsoleInput(char prompt)
    {
        System.out.println(new Date().toString().substring(0, 20));        
        
        lines = new LinkedList<String>();
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        
        while (true)
        {
            System.out.print(prompt);
            System.out.print(' ');
            
            try 
            {
                curLine = is.readLine();
                if (curLine.length() == 0) continue;
                if (curLine.charAt(0) == 'q' || curLine.charAt(0) == 'Q' ) break;
                lines.add(curLine);
            }
            catch (Exception e) {
                System.out.println("Exception: " + e);
            }            
        }

        System.out.println(".");
        curLineNum = 0;
    }
    
    public void start() { curLineNum = 0; }

    public boolean hasNext() { return curLineNum < lines.size(); }

    public String next()  { 
        if (curLineNum >= lines.size())
        throw new NoSuchElementException();
        return lines.get(curLineNum++);
    }
    
}
