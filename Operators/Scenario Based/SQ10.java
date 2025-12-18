import java.util.*;
public class SQ10 {
    public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int Basic=sc.nextInt();
            int Allowance=sc.nextInt();
            int Deductions=sc.nextInt();
            int Salary=Basic+Allowance-Deductions;
            System.out.println(Salary);
        }
    }
}
