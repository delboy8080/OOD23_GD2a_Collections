import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoListQuestion12
{

    public static void main(String[] args)
    {
        PriorityQueue<Task> taskList = new PriorityQueue();
        Scanner kb = new Scanner(System.in);
        String command="";
        do {
            System.out.print("Command:");
            command = kb.next();
            if(command.equalsIgnoreCase("add"))   {
                int priority = kb.nextInt();
                String tsk = kb.nextLine();
                taskList.add(new Task(priority,tsk));
            }
            else if(command.equalsIgnoreCase("next")) {
                System.out.println(taskList.poll());
            }
        }while(!command.equalsIgnoreCase("exit"));
    }
}
