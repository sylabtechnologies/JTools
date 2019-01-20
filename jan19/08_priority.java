package test;
import java.util.*;

class Priorities
{
    PriorityQueue< Student > queue = new PriorityQueue< Student >();

    List<Student> getStudents(List<String> events)
    {
        for (String event : events)
        {
            if (event.substring(0, 5).equals("ENTER"))
            {
                queue.add(new Student(event.substring(6)));
            }
            else if (event.substring(0, 6).equals("SERVED"))
            {
                if (queue.isEmpty()) {
                    throw new IllegalArgumentException("Bad entry " + event);
                }
                
                queue.poll();
            }
            else
                throw new IllegalArgumentException("Bad entry " + event);
            
            // printme();
        }
        
        List<Student> ans = new ArrayList<>();
        
        Iterator itr = queue.iterator();
        while (itr.hasNext())
        {
            ans.add((Student)itr.next());
        }
        
        return ans;
    }

    private void printme()
    {
        Iterator itr = queue.iterator();
        while (itr.hasNext())
        {
            System.out.print( ((Student) itr).getName());
            System.out.print(" ");
            System.out.print(((Student) itr).getCgpa());
            System.out.print(" ");
            System.out.print(((Student) itr).getId());
            System.out.print(" ");
        }

        System.out.println(";");
        
    }
    
}
