import java.util.*;
public class BitwiseAND {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a&(a-1);
        System.out.println((b==0)?"Pow of 2":"Not Pow of 2");
}
}
