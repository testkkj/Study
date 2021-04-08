import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

/**
 * StringBinarySearch
 */
public class StringBinarySearch {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] x = {
            "boolean", "byte" ,"char" ,"double" ,"float"
            ,"int" ,"long" ,"short" ,"void" ,"break"
            ,"case" ,"default" ,"continue" ,"do" ,"else"
            ,"finally" ,"for" ,"goto" ,"if" ,"switch"
            ,"while" ,"abstract" ,"assert" ,"catch" ,"class"
            ,"const" ,"enum" ,"extends" ,"final" ,"interface"
            ,"new" ,"package" ,"private" ,"protected" ,"public"
            ,"return" ,"static" ,"strictfp" ,"super" ,"synchronized"
            ,"this" ,"throw" ,"throws" ,"transient" ,"try" ,"volatile"
        };

        System.out.print("원하는 키워드를 입력하세요 : ");

        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky);
        System.out.println(idx);

        if (idx < 0) {
            System.out.println("해당 키워드가 없습니다.");
        } else {
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
        }
    }
}