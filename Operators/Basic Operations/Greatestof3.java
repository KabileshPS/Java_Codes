import java.util.*;
public class Greatestof3 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int m=(a>b)?a:b;
    m=(m>c)?m:c;
    System.out.println(m);
}
}
