import org.graalvm.compiler.debug.TTY;

import java.util.Scanner;

public class caesar {
    public static void main(String[] args) {
        Scanner aScanner =  new Scanner(System.in);
        String pLainText;
        int shiftKey;
        System.out.println("Please enter the message to be encrypted: ");
        pLainText = aScanner.nextLine();
        System.out.println("Please enter the shift key ");
        shiftKey = aScanner.nextInt();


//        sytem.out.prIntIn("The Encrypted Text:"+EncryptedText(pLainText,shiftKey));
    }

public static  String cyperText(String message, int shiftKey) {
//    c(x) = x + shiftKey Mod(%) 26 ;
    final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
    message = message.toLowerCase();

    StringBuilder cypherText = new StringBuilder();
    int counter;
    for (counter = 0; counter < message.length(); counter++) ;
    if (!Character.isLetter(message.charAt(counter))) {

        cypherText.append(message.charAt(counter));


    else int charPosition = ALPHABETS.indexOf(message.charAt(counter));
        char typeValue = ALPHABETS.charAt(keyValue);
        cypherText.append(cyperValue);
    }
}
return cyperText.toString();
        }


