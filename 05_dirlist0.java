/*
    Say it is pathlist

 */
package dirlist;
import java.util.*;
import java.io.*;

public class Dirlist {

    public static void main(String[] args) {
        
        // System.getProperties().list(System.out);
        
        File path = new File("C:\\Users\\Dennis\\Desktop");
        ArrayList<String> dirname = new ArrayList<>();
        ArrayList<String> lnk = new ArrayList<>();

        
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

        System.out.println("--------");
        
        for (String x : dirname)
            System.out.println(x);

        System.out.println("--------");
        
        for (String x : lnk)
            System.out.println(x);
        
        System.out.println("--------");
    }
    
}
