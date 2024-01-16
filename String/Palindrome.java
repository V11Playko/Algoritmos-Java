package String;

public class Palindrome {
    public static void main(String[] args) {
        String word = "reconocer";

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' es un palíndromo.");
        } else {
            System.out.println("'" + word + "' no es un palíndromo.");
        }
    }

    static boolean isPalindrome(String str) {
        // Eliminar espacios y convertir a minúsculas
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // No es un palíndromo
            }
            left++;
            right--;
        }

        return true; // Es un palíndromo
    }
}
