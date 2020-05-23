import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[ ] args)
    {
        Scanner input = new Scanner(System.in);
        String inputString;
        System.out.print("Enter Your input string expression : ");
        inputString = input.next( );

        if (isPalindrome( inputString )){
            System.out.println("That is a palindrome.");
        }
        else{
            System.out.println("That is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input)
    {
        Queue<Character> q = new LinkedList<Character>( );
        Stack<Character> s = new Stack<Character>( );
        char letter;
        int i;

        for (i = 0; i < input.length( ); i++)
        {
            letter = input.charAt(i);
            q.add(letter);
            s.push(letter);
        }
        while (!q.isEmpty( ))
        {
            if (q.remove( ) != s.pop( ))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

