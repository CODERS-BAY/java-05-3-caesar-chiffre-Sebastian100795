import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        System.out.println("Geben Sie den zu verschlüsselnden Text ein:");
        String passwort = scanner.next().toUpperCase();
        char[] passwortArray = passwort.toCharArray();
        System.out.println("Geben Sie an um wieviel stellen Sie Verschlüsseln möchten (1-26");
        int verschluesselt = scanner.nextInt();

       char[] chiffre = new char[passwortArray.length];

        for (int i = 0; i < passwortArray.length ; i++) {
            chiffre[i]= (char) (passwortArray[i]+verschluesselt);

            while(chiffre[i]>90){


                chiffre[i]-=26;
            }
        }
        String verPaswort= new String(chiffre);
        System.out.println(verPaswort);


    }
}
