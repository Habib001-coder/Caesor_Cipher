import org.graalvm.compiler.debug.TTY;

import java.util.Scanner;
public class caesar{
    public static void main(String[] args) {
        System.out.println("welcome to the caesar_cipher App");
        while (true) {
            System.out.println("Chose 'E' For encryption or D for decryption");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("e")) {
                System.out.println("Input Test For Encryption");
                String planeText = input.nextLine().toLowerCase();
                System.out.println("Input a random value");
                int num = input.nextInt();
                App message = new App(planeText, num);
                System.out.println("plane Text:" + message.getMessage() + "/n new Value of:" + message.getNum());
                System.out.println("Encrypt Test:" + message.encryption());
                break;
            } else if (choice.equals("d")) {
                System.out.println("Input Test to Decrypt:");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Enter numValue");
                int reversValue = input.nextInt();
                App encryptText = new App(encryptedText, reversValue);
                System.out.println("decrypted message: " + encryptText.decryption());
                break;
            } else {
                System.out.println("invalid choice");
            }
        }
    }
}