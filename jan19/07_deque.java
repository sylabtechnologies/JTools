/*
https://www.hackerrank.com/challenges/java-dequeue/problem
https://www.hackerrank.com/challenges/data-structures-quiz-2/problem
*/

package test;

import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> whatsLeft = new ArrayList<>();
        
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            deque.add(num);
        }

        int myMax  = countUnique(deque);
        
        for (int i = 0; i < n - m; i++)
        {
            int num = in.nextInt();
            whatsLeft.add(num);
        }
        
        for (Integer num : whatsLeft)
        {
            deque.addLast(num);
            deque.removeFirst();

            int testMax = countUnique(deque);

            if (myMax < testMax)
                myMax = testMax;
        }

        System.out.println(myMax);
    }

    private static int countUnique(Deque<Integer> deque)
    {
        Set<Integer> myset = new HashSet<>(deque);
        
        return myset.size();
    }


}

 