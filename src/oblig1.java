import java.util.NoSuchElementException;

public class oblig1 {

    public static int maks(int[] a) throws NoSuchElementException {
        for (int i = 1; i <= a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }
        return a[a.length];
    }

    public static int ombyttinger(int[] a) {
        int j = 0;
        for (int i = 1; i <= a.length; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                j++;
            }
        }
        return j;
    }

    public static int antallUlikeSorter(int[] a) throws IllegalStateException {
        int count = 0;
        if (a.length > 0) {
            for (int i = 1; i <= a.length; i++) {
                if (a[i - 1] == a[i]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int antallUlikeUsortert(int[] a) throws IllegalStateException {
        int count = 0;
        for (int i = 0; i <= a.length; i++) {
            for (int j = 1; j <= a.length - 1; i++) {
                if (a[i] == a[j] && j != i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void delsortering(int[] a) {
        int j = 0;
        int k = a.length / 2;
        for (int i = 0; i <= a.length; i++) {
            if (a[i] % 2 != 0) {
                a[j] = a[i];
                j++;
            } else {
                a[k] = a[i];
                k++;
            }
        }
    }

    public static void rotasjon(char[] a, int k) {

        while (k < 0) {
            for (int i = a.length - 1; i <= 1; i--) {
                a[i - 1] = a[i];
                a[a.length] = a[0];
                k++;
            }
        }
        while (k > 0) {
            for (int i = 0; i <= a.length - 1; i++) {
                a[i] = a[i + 1];
                a[0] = a[a.length];
                k--;
            }
        }
    }

    public static String flett(String s, String t) {
        StringBuilder mergedString = new StringBuilder();

        for (int i = 0; i < s.length() || i < t.length(); i++) {

            if (s.length() > 0) {
                mergedString.append(s.charAt(i));
            }

            if (t.length() > 0) {
                mergedString.append(s.charAt(i));
            }
        }
        return mergedString.toString();
    }

    public static String flett(String... s) {
        return null;
    }

    public static int[] indekssortering(int[] a) {
        int k = 0;
        int u = 0;
        int[] indekser = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                    u = indekser[i];
                    indekser[i] = indekser[j];
                    indekser[j] = u;

                }
            }
        }
        return indekser;
    }

    public static int[] tredjeMin(int[] a) {
        return null;
    }

    public static boolean inneholdt(String a, String b){
        return false;
    }
}
