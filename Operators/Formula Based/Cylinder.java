import java.util.*;
public class Cylinder {
    public static void main (String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double a=(2*3.14*r*h)+(2*3.14*r*r);
        double v=3.14*r*r*h;
        System.out.println(a+"\n"+v);
   }
}
