
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "car";

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);         //a,a,a,g,m,n,r
        Arrays.sort(b);         //a,a,a,g,m,n,r

        if (Arrays.equals(a, b)) {   // array of a(values) = b(values) or not 
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
