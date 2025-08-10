import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args){
        LocalDate obj = LocalDate.now();
        System.out.println(obj);
        LocalTime obj1 = LocalTime.now();
        System.out.println(obj1);


        LocalDateTime obj2 = LocalDateTime.now();
        System.out.println("before format: "+ obj2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss:ms");
        String result = formatter.format(obj2);
        System.out.println(result);

    }
}
