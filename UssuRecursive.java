import java.util.Scanner;
public class UssuRecursive {

    public static int usAlma(int a, int b){

        if(b == 0) return 0;
        if(b==1) return a;

        return a * usAlma(a,b-1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz:   ");
        int base = input.nextInt();

        System.out.print("Üs sayısını giriniz:   ");
        int exponent = input.nextInt();

        System.out.print(base+" üzeri "+exponent+ ":  "+usAlma(base,exponent));

    }
}
