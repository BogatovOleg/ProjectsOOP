package lab6;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateEditer {

    public static String getDate(){
        String date;
        date =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS").format(Calendar.getInstance().getTime()).toString();

        return date;
    }

}
