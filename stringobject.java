public class stringobject {

    public static void main(String[] args)
     {
        String columnist1 = "The quick brown fox jumps over the lazy dog.";
        String columnist2 = "The quick brown fox jumps";        
        String columnist3 = "Mike Royko";
         boolean equals1 = columnist1.equals(columnist2);
         boolean equals2 = columnist1.equals(columnist3);
 
        
         System.out.println("\"" + columnist1 + "\" equals \"" +
             columnist2 + "\"? " + equals1);
         System.out.println("\"" + columnist1 + "\" equals \"" +
             columnist3 + "\"? " + equals2);
     }
 }
 