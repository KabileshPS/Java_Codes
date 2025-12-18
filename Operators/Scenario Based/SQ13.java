import java.util.*;
public class SQ13 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int buy=sc.nextInt();
        int price=sc.nextInt();
        int free=buy/4;
        int pay=buy-free;
        int total=pay*price;
        System.out.print(total);
    }
}
