import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwort = scanner.next();
        Random verschluesselt = new Random();
        char[] passwortArray = passwort.toCharArray();
        int[] verPasswort = new int[passwortArray.length];
        char[] verschPasswort = new char[verPasswort.length];
        int schlüssel= verschluesselt.nextInt(26);

        for (int i = 0; i < passwortArray.length; i++) {
            verPasswort[i] = passwortArray[i] - schlüssel;
            verschPasswort[i] = (char) verPasswort[i];
        }
        String verschluesseltesPasswort = new String(verschPasswort);
        System.out.println(verschluesseltesPasswort);

    }
}
