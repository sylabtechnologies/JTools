/*
  UI = UNDER CONSTRUCTION
*/
package scalcui;
import javax.swing.*;
import java.util.*;

public class SCalcUI {

    public static void main(String[] args) {
        
        String message = String.format( "%s\nCalculate: ", new Date().toString().substring(0, 20));
        String expr = JOptionPane.showInputDialog( message );
        
        String[] tokens = SplitXpr(expr);
        int answer = CalcXpr(tokens);
        
        message = String.format( "%s %s %s = %d", tokens[0], tokens[1], tokens[2], answer);
        JOptionPane.showMessageDialog( null, message );                
                
    }

    private static String[] SplitXpr(String expr) {
        String[] token = {"", "", ""};
        
        expr = expr.replaceAll("\\s", "");
        int i = 0;
        for(char c : expr.toCharArray())
        {
            if (!Character.isDigit(c) && c != ' ')
            {
                token[1] += c;
                break;
            }
            i++;
        }
        
        token[0] = expr.substring(0, i);
        token[2] = expr.substring(i+1);
        
        return token;
    }

    private static int CalcXpr(String[] tokens) {
        int a = Integer.parseInt(tokens[0]);                
        int b = Integer.parseInt(tokens[2]);

        int result = 0;

        switch(tokens[1].charAt(0))
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
                throw new UnsupportedOperationException(tokens[1] + " not supported");
        } 
        
        return result;
    }
    
}
