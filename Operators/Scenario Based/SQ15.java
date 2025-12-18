import java.util.*;
public class SQ15 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rs2000,rs500,rs200,rs100;
        rs2000=a/2000;
        a=a%2000;
        rs500=a/500;
        a=a%500;
        rs200=a/200;
        a=a%200;
        rs100=a/100;
        System.out.println("2000 : "+rs2000+"\n"+"500 : "+rs500+"\n"+"200 : "+rs200+"\n"+"100 : "+rs100);
}
}
