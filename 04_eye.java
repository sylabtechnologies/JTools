/*
 */
package eye;

public class Eye {
    public final int[][] x;
    private final int eyeSize;
    
    Eye(int size)
    {
        eyeSize = size;
        
        x = new int[size][size];
        
        for (int i = 0; i < size; i++)
            x[i][i] = 1;
    }
    
    @Override
    public String toString()
    {
        StringBuilder myline = new StringBuilder();

        for (int i = 0; i < eyeSize; i++)
        {
            for (int j = 0; j < eyeSize - 1; j++)
            {
                myline.append(Integer.toString(x[i][j]));
                myline.append(" ");
            }
            
            myline.append(Integer.toString(x[i][eyeSize - 1]));
            myline.append("\n");
        }
        return myline.toString();
    }

    public static void main(String[] args) {
        Eye e = new Eye(10);
        
        System.out.println(e);
    }
    
}
