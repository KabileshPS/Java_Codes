import java.util.*;
public class SQ11 {
    public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int cp=sc.nextInt();
            double p=sc.nextDouble();
            double per=(p*cp)/100;
            double selling_price=cp+per;
            System.out.println(selling_price);
        }
    }
}
