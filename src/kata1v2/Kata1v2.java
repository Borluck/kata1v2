package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1993,1,6);
        
        Person yo = new Person("Jonatan",date);
        System.out.println(yo.getName() + " tiene " + yo.getAge() + " años.");
    }
}
