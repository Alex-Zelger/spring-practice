package az.com.practicum.springpractice;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

public class History {
    private int int1;
    private int int2;
    private char op;
    String time;

    public void setHistory(int val1, int val2, char oper){
        int1 = val1;
        int2 = val2;
        op = oper;
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        time = sdf.format(ts);
    }

    public String getHistory(){
        return int1 + " " + op + " " + int2 + " at " + time;
    }


}