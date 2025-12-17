import java.util.*;
public class Cuboid {
     public static void main (String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        int a=2*(l*w)+(w*h)+(h*l);
        int v=l*w*h;
        System.out.println(a+"\n"+v);
   }
}
