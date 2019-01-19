/*

SIMPLE CALC

 */
package p168;

import java.io.*;
import java.util.*;

public class P168 {

    public static void main(String[] args) {
        Date nn = new Date();
        System.out.println(nn.toString().substring(0, 20));
        
        for (int i = 0; i < 100000; i++) {
            String inputLine = null;
            System.out.print("> ");

            try {
                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
                inputLine = is.readLine();

                inputLine = inputLine.replaceAll("\\s", "");
                if (inputLine.length() == 0) continue;
                
                // find operation token
                i = 0; char opchar = '?';
                for(char c : inputLine.toCharArray())
                {
                    if (!Character.isDigit(c) && c != ' ')
                    {
                        opchar = c;
                        break;
                    }
                    i++;
                }
                
                if (opchar == 'Q' || opchar == 'q')
                    System.exit(0);
                    
                int a = Integer.parseInt(inputLine.substring(0, i));                
                int b = Integer.parseInt(inputLine.substring(i+1));

                int result = 0;
                
                switch(opchar)
                {
                    case '+':
                        result = a + b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        throw new java.lang.Exception("+-*/ only");                        
                }
                
                System.out.print("= ");
                System.out.println(result);

                //if (inputLine.length() != 0 )
                //    System.out.println("> " + inputLine + " = " + Integer.toString(runCalc(inputLine)));
            }
            catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        
    }
    
}
