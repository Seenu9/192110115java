import java.lang.*;
public class lastword {
        public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return s.length();
        } else {
            return s.substring(lastSpaceIndex + 1).length();
        }
    }
        public static void main(String[] args) {
            // TODO code application logic here
            String input = "Hello World";
            lastword a = new lastword();
            System.out.println("The length of last word is "+a.lengthOfLastWord(input));
        }
    }
    
