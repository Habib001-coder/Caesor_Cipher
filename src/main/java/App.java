

public class App {

    public String message;
    public int num;
    public App(String message, int num) {
        this.message = message;
        this.num = num;
    }
    public String getMessage() {
        return message;
    }
    public int getNum() {
        return num;
    }
    public String encryption(){
        StringBuilder sb= new StringBuilder();
        for( char character : message.toCharArray()){
            if( character != ' '){
                int asciiPosition = character -'a';
                int newPosition = (asciiPosition + num)%26;
                char newCharacter = (char)('a' + newPosition);
                sb.append(newCharacter);
            }else{
                sb.append(character);
            }
        }
        return sb.toString();
    }
    public String decryption(){
        int reverse = 26 - (num % 26);
        StringBuilder sb = new StringBuilder();
        for (char character : message.toCharArray()){
            if( character != ' ') {
                int asciiPosition = character - 'a';
                int newPosition = (asciiPosition + reverse) % 26;
                char newCharacter = (char) ('a' + newPosition);
                sb.append(newCharacter);
            }
            else{
                sb.append(character);
            }
        }
        return sb.toString();
    }
}




