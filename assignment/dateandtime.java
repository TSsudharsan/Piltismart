import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class dateandtime {
    
   static  void f1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unix time");
        Long unx=sc.nextLong();
        Date nux=new Date(unx*1000);
        System.out.println(" Unix time format to Local time format "+ nux.toString());
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter fdt=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        System.out.println("Current Time :"+ dt.format(fdt));

        //1.  Covert the time in to UTC time zone and US EST time zone.

        LocalDateTime utc =LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current Time Zone To UTC Time Zone :"+ utc.format(fdt));
        LocalDateTime us =LocalDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println("Current Time Zone To US EST Time Zone :"+ us.format(fdt));

        //2. Add and subtract 9 hours from current time and display
        
        System.out.println("Enter the number of hours to Add and subtract");
        int as = s.nextInt();
        LocalDateTime ph =dt.plusHours(as);
        LocalDateTime mh =dt.minusHours(as);
        System.out.println("Current Date : "+ dt.format(fdt));
        System.out.println("After Adding "+ as + " Hours:"+ ph.format(fdt));
        System.out.println("After Subtracting "+ as + " Hours:"+ mh.format(fdt));

        // 3.Add and subtract 4 days from current date

        System.out.println("Enter the number of Days to Add and subtract");
        int asd = s.nextInt();
        LocalDateTime pd =dt.plusDays(asd);
        LocalDateTime md =dt.minusDays(asd);
        System.out.println("Current Date : "+ dt.format(fdt));
        System.out.println("After Adding "+ asd + " Days:"+ pd.format(fdt));
        System.out.println("After Subtracting "+ asd + " Days:"+ md.format(fdt));

        //4. Add and subtract 8 months from current date

        System.out.println("Enter the number of Month to Add and subtract");
        int asm = s.nextInt();
        LocalDateTime pm =dt.plusMonths(asm);
        LocalDateTime mm =dt.minusMonths(asm);
        System.out.println("Current Date : "+ dt.format(fdt));
        System.out.println("After Adding "+ asm + " Months:"+ pm.format(fdt));
        System.out.println("After Subtracting "+ asm + " Months:"+ mm.format(fdt));

        //5 .Subtract a year from current date

        System.out.println("Enter the number of Year to  subtract");
        int sy = s.nextInt();
        LocalDateTime my =dt.minusYears(sy);
        System.out.println("Current Date : "+ dt.format(fdt));
        System.out.println("After Subtracting "+ sy + " years : "+ my.format(fdt));

        //6.Convert current date in to Unix time format

        Date ux=new Date();
        Long p= ux.getTime()/1000;
        System.out.println(" Current date to Unix time format "+ p);

        //7. Java static method to convert local time in to Unix time format

        dateandtime obj=new dateandtime();
        dateandtime.f1();
        
    }

}