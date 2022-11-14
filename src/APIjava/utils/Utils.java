package APIjava.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {
    static public java.sql.Date DateConvertedToSqlDateByString (String date) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date javaDate = formatter1.parse(date);
        java.sql.Date sqlFinalDate = new java.sql.Date(javaDate.getTime());
        return sqlFinalDate;
    }

}
