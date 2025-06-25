import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncryptingMessage {
    private static final Map<Character, Character> encryptionMap = new HashMap<>();
    private static final Map<Character, Character> decryptionMap = new HashMap<>();

    static{
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String cipher ="zyxwvutsrqponmlkjihgfedcba";

        for(int i=0; i<letters.length(); i++){
            encryptionMap.put(letters.charAt(i), cipher.charAt(i));
            decryptionMap.put(cipher.charAt(i), letters.charAt(i));
        }
    }
    public static String encrypting (String message){
        StringBuilder encrypted= new StringBuilder();
        for( char ch : message.toLowerCase(). toCharArray()){
            if(encryptionMap.containsKey(ch)){
                encrypted.append(encryptionMap.get(ch));
            }else{
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static String decrypting(String message){
        StringBuilder decrypted = new StringBuilder();
        for(char ch : message.toLowerCase().toCharArray()){
            if(decryptionMap.containsKey(ch)){
                decrypted.append(decryptionMap.get(ch));
            } else{
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your message:");
        String input = scanner.nextLine();

        String encrypted = encrypting(input);
        System.out.println("Encrypted Message: " + encrypted);

        String decrypted= decrypting(encrypted);
        System.out.println("Message Decrypted: " + decrypted);

        scanner.close();
    }
}