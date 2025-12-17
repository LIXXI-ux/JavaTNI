import java.util.Scanner;

public class Lab503 {

    public static int count_vowel(String message, char letter) {
        int count = 0;
        message = message.toUpperCase();
        letter = Character.toUpperCase(letter);

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (char v : vowels) {
            int result = count_vowel(message, v);
            System.out.println(v + " = " + result);
        }

        sc.close();
    }
}


