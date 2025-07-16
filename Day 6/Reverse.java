import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = "";
        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            {
                reversed += chars[i];
            }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        sc.close();
    }
}
