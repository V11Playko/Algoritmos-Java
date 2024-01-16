package String;

// Knuth-Morris-Pratt (KMP)

public class KMP {
    public static void main(String[] args) {
        String text = "ababcababcabcabc";
        String pattern = "abcabc";

        int index = searchSubString(text, pattern);

        if (index != -1) {
            System.out.println("La subcadena se encuentra en la posición " + index);
        } else {
            System.out.println("La subcadena no se encuentra en el texto");
        }
    }

    static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    static int searchSubString(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0; // Índice para la cadena de texto
        int j = 0; // Índice para la subcadena

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                return i - j; // Se encontró la subcadena en la posición i-j
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1; // No se encontró la subcadena
    }
}
