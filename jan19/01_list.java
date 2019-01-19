/*

https://coderanch.com/t/680162/java/code-skip-scanner-input
https://www.hackerrank.com/challenges/java-list/problem


 */
package listproblem;

import java.util.LinkedList;
import java.util.List;

public class listproblem {

    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int llLength = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < llLength; i++)
            ll.add(sc.nextInt());

        int inpLength = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < inpLength; i++) {
            String query = sc.nextLine();
            String param = sc.nextLine();

            String[] params = param.split(" ");

            if (query.equals("Insert")) {
                ll.add(Integer.parseInt(params[0]), Integer.parseInt(params[1]));
            } else if (query.equals("Delete")) {
                ll.remove(Integer.parseInt(params[0]));
            } else {
                System.err.println("IO error");
                System.exit(1);
            }

        }

        for (Integer i : ll)
        {
            System.out.print(i);
            System.out.print(" ");

        }

        System.out.println("");

    }
    
}

