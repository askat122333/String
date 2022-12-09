import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Strings {
    public static void main(String[] args) {
   /*     int result = calc(12,45);
        System.out.println(result);
        double res = calc(12d,45d);
        System.out.println(res);*/





/*        LocalDate date = LocalDate.now();
        System.out.println(date);
        long milliSec = System.currentTimeMillis();
        long oldDay = milliSec-86_400_000;
        LocalDate oldDate = Instant.ofEpochMilli(oldDay).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(oldDate);*/





        BigDecimal First = BigDecimal.ONE;
        BigDecimal Second = BigDecimal.TEN;
        BigDecimal Third = First.add(Second);
        System.out.println(Third);
        Third = Third.subtract(BigDecimal.ONE);
        System.out.println(Third);


        long money = 1_123_123_212555555555L;
        BigDecimal myMoney = BigDecimal.valueOf(money);
        System.out.println(myMoney);

    }

/*    @Deprecated
    public  static int calc(int first, int second){
        return first+ second;
    }
    public  static double calc(double first, double second){
        return first+ second;
    }*/
}
