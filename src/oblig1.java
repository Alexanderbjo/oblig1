import java.util.NoSuchElementException;

public class oblig1 {

    public static int maks(int[] a) throws NoSuchElementException {
        for(int i=1; i<=a.length; i++){
            if(a[i-1] > a[i]){
               int temp  = a[i-1];
               a[i-1] = a[i];
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

    public  static int antallUlikeSorter(int[] a) throws IllegalStateException {
        int count = 0;
        if(a.length > 0) {
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
        for(int i = 0; i <= a.length; i++) {
            for(int j = 1; j <= a.length-1; i++) {
                if(a[i] == a[j] && j != i){
                    count++;
                }
            }
        }
        return count;
    }

    public static void delsortering (int[] a){
        int j = 0;
        int k = a.length/2;
        for(int i = 0; i<=a.length; i++){
            if(a[i] % 2 != 0){
                a[j] = a[i];
                j++;
            } else{
                a[k] = a[i];
                k++;
            }
        }
    }

    public static void rotasjon(char[] a){
        for(int i = 0; i < a.length-1; i++){
            a[i] = a[i+1];
            a[0] = a[a.length];
        }
    }

}
