import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sicakligini Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayaga Gidebilirsiniz.");
        }
        else if (heat < 15) {
            System.out.println("Sinemaye Gidebilirsiniz.");
        }
        else if (heat > 15 && heat <= 25) {
            System.out.println("Piknige Gidebilirsiniz.");
        }
        else if (heat == 15) {
            System.out.println("Sinemaya veya Piknige Gidebilirsiniz.");
        }
        else {
            System.out.println("Yuzmeye Gidebilirsiniz.");
        }
    }
}
