import java.util.*;
public class SQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        double d=sc.nextDouble();
        double dp=(d/100.0)*p;
        System.out.println(p-dp);
    }
}
