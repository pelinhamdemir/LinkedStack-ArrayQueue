import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a string:");
        String p = keyboard.nextLine();

        while(!p.matches("[a-zA-Z - , - .]")){// checks whether the string does not consist of char(a,b,c)items
            System.out.println("Invalid input.Enter a valid string: ");
            p=keyboard.nextLine();
        }
        String k= p.toLowerCase();
        System.out.println(palindromeCheck(k));

    }
    public static String palindromeCheck(String given){ // checks whether the given string is palindrome
        LinkedStack palindromes = new LinkedStack();
        ArrayQueue queue=new ArrayQueue(20);
        for(int i=0;i<given.length();i++){// pushs the given string's chars into the queue and stack
            char x=given.charAt(i);
            palindromes.push(x);
            queue.enqueue(x);

        }
        while (!palindromes.isEmpty() && palindromes.count > 0) {// compares each index individually
            char c1 = palindromes.pop();
            char c2=queue.dequeue();

            if (c1!=c2) {
                return "It is not a palindrome string";
            }
        }
        return "It is a palindrome string";
    }
}