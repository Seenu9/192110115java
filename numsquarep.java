import java.util.*;
public class numsquarep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,k=1;
        for(a=1;a<n;a++){
            for(b=1;b<=a;b++){
                System.out.print((int)Math.pow((k++),2)+" ");
            }
            System.out.println();
           }
        }
        
    }

