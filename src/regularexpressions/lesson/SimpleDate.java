package regularexpressions.lesson;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDate {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getTime());

//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(gregorianCalendar.get(Calendar.DATE));
//        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(gregorianCalendar.get(Calendar.MONTH));
//        System.out.println();
//        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_YEAR));

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(Calendar.MONTH, Calendar.MAY);
        gc.set(Calendar.DAY_OF_MONTH, 21);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println();
        GregorianCalendar gc1 = new GregorianCalendar(2020, Calendar.MAY,21);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));
        gc1.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(gc1.get(Calendar.DAY_OF_MONTH));
        GregorianCalendar gc2 = new GregorianCalendar();
        System.out.println(gc2.getTime());
    }
}
