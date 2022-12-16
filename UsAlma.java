import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n, i, toplam = 1;

        System.out.print("Üssü alıınacak sayıyı girin : ");
        k = input.nextInt();
        
        System.out.print("Üs kuvvetini girin : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            toplam *= k;
        }
        System.out.println(toplam);
    }
}
