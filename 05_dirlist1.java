/*
    UNDER CONSTRUCTION    
 */
package dirlist;
import java.util.*;
import java.io.*;

public class Dirlist {
    final public static int colWidth  = 4;
    final public static int rowLength = 19;

    public static void main(String[] args) {
        
        // System.getProperties().list(System.out);
        
        File path = new File("C:\\Users\\Dennis\\Desktop");
        List<String> dirname = new ArrayList<>();
        List<String> lnk = new ArrayList<>();

        
        String[] list = path.list();
        
        for (String x : list)
        {
            File y = new File(path + "\\" + x);
            
            if (y.isDirectory())
                dirname.add(x.toUpperCase());
            else
            {
                int i = x.lastIndexOf('.');
                if (i > 0)
                {
                    if (x.substring(i+1).equals("lnk"))
                        lnk.add(x.substring(0, i));
                }
                    
            }
            
        }
        
        Collections.sort(dirname);
        Collections.sort(lnk);

        printout(dirname);

        /*
        System.out.println("--------");

        int i = 0;
        for (String x : dirname)
        {
            i++;
            System.out.print(i);
            System.out.print('\t');
            System.out.println(x);
        }

        System.out.println("--------");
        
        for (String x : lnk)
            System.out.println(x);
        
        System.out.println("--------");
        */
    }

    public static void printout(List<String> dir) {

        Date nn = new Date();
        System.out.print(" -- ");
        System.out.print(nn.toString().substring(0, 20));
        System.out.println(" -- ");
        System.out.println(" ");
        
        int width = dir.size()/rowLength;
        
        for (int j = 0; j < rowLength; j++) {
            StringBuilder printit = new StringBuilder("    ");
            for (int i = 0; i < width + 1; i++) {
                int myind = i*rowLength + j;
                
                if (myind < dir.size()) {
                    String space = new String(new char[24-dir.get(myind).length()]);
                    space = space.replace('\0', ' ');
                    printit.append(dir.get(myind)).append(space);
                }
            }
            
            System.out.println(printit);
            
        }
        
    }
}
