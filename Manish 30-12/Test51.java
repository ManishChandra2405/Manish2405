import java.time.LocalDate;
import java.time.LocalTime;
class Test51
{ 
  public static void main(String[] args)
   {
     LocalDate doj = LocalDate.of(95,10,31);
     System.out.println(doj.getDayOfMonth()+"/"+doj.getMonthValue()+"/"+doj.getYear());
   }
} 