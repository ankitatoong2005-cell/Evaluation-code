
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                freq[ch]++;
            }
        }

        System.out.println("\nCharacter Frequencies:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && freq[ch] > 0) {
                System.out.println(ch + " : " + freq[ch]);
                freq[ch] = 0; // Avoid duplicate display
            }
        }

        boolean found = false;

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                count[ch]++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && count[ch] == 1) {
                System.out.println("\nFirst non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAll characters are repeated.");
        }

        sc.close();
    }
}
