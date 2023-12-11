import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String toBinary(int x)
    {
        Stack<Integer> nums = new Stack<>();
        while(x > 0)
        {
            nums.push(x%2);
            x = x / 2;
        }
        String s="";
        while(nums.size()>0)
        {
            s+=nums.pop();
        }
        return s;
    }

    public static void question10_main()
    {
        Scanner kb = new Scanner(System.in);
        Stack<String> words = new Stack<>();
        String word = "";
        while(!word.equalsIgnoreCase("exit")) {
            System.out.println("Word:");
            word = kb.next();
            if (!word.equalsIgnoreCase("exit"))
                words.push(word);
        }
        while(!words.isEmpty())
        {
            System.out.println(words.pop()+" ");
        }
    }
    public static void main(String[] args) {
        question10_main();
    }

    private static void question11_main() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = kb.nextInt();
        System.out.println(num +" in binary is "
                + toBinary(num));
    }
}