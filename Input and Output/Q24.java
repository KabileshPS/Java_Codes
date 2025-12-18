import java.time.*;;
public class Q24 {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println("Hour : "+time.getHour()+" "+"Minute : "+time.getMinute()+" "+"Second : "+time.getSecond());
    }
}
