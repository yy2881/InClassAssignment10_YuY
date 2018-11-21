import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a tweet: ");
	    Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(input.length() > 140){
            int excess = input.length()-140;
            System.out.println("Excess Characters:"+excess);
        }else {
            int numHashtag = 0;
            int numAttribution = 0;
            int numLink = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '@' && input.charAt(i + 1) != ' ') {
                    numAttribution++;
                }
                if (input.charAt(i) == '#' && input.charAt(i + 1) != ' ') {
                    numHashtag++;
                }
                String link = "http://";
                if (input.charAt(i) == 'h' || input.charAt(i) == 'H') {
                    boolean ifExistLink = input.regionMatches(true, i, link, 0, 6);
                    if (ifExistLink) {
                        numLink++;
                    }
                }
            }
            System.out.println("Length Correct");
            System.out.println("Number of Hashtags : " + numHashtag);
            System.out.println("Number of Attributions : " + numAttribution);
            System.out.println("Number of Links : " + numLink);
        }
    }

}
