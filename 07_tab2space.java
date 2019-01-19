/*

double spaces, expand braces

*/

package tab2space;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tab2space {

    public static void main(String[] args) {
        
        
        ConsoleInput ii = new ConsoleInput("name>");
        
        // String home = "C:\\Users\\Dennis\\Desktop";
        String home = "C:\\Users\\Dennis\\Desktop\\TIJ4-code\\examples\\net\\mindview\\util";
        File path = new File(home + "\\" + ii.next() + ".java");
        
        try
        {
            Scanner ff = new Scanner(path);

            int i = 1;
            while(ff.hasNext())
            {
                String nl = ff.nextLine();
                
                // count spaces
                int count = 0;
                for (int j = 0; j < nl.length(); j++) {
                    if (nl.charAt(j) == ' ')
                        count++;
                    else
                        break;
                }
                
                String space = new String(new char[count]);
                if (count > 0) space = space.replace('\0', ' ');
                if (count > 0) nl = space + nl;

                int brace = nl.lastIndexOf('{');
                if (brace > 0)
                {
                    nl = nl.substring(0, brace);
                    System.out.println(nl);
                    
                    if (count > 0)
                        nl = space + space + "{";
                    else
                        nl = "{";
                }
                else
                {
                    brace = nl.lastIndexOf('}');
                    if (brace == 4)
                    {
                        System.out.println(nl);
                        nl = "";
                    }
                }
                
                /* print only blanks!
                String nl = ff.nextLine();
                
                nl = nl.replace("\n", "");
                
                if (nl.length() == 0) {
                    System.out.print(i);
                    System.out.print('\t');
                }
                */
                
                System.out.println(nl);
                i++;
            }
                
                
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Type java name");
            System.exit(0);
        }
    }
    
}
