import java.util.Scanner;

public class Lab505 {

    public static boolean is_palindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        if (is_palindrome(word)) {
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is NOT Palindrome");
        }

        sc.close();
    }
}

