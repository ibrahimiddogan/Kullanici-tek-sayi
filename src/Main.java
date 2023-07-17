import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,total=0;
        Scanner alici= new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            sayi= alici.nextInt();
            if (sayi%4==0&&sayi%2==0){
                total +=sayi;
            }

        }while (sayi%2==0);
        System.out.print(total);

    }
}