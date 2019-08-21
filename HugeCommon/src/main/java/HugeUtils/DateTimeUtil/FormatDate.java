package HugeUtils.DateTimeUtil;


import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
//    format时间工具类
    public String FormatDate(Date date, String Model){
        SimpleDateFormat format = new SimpleDateFormat(Model);
        String ResultDate = format.format(date);
        return ResultDate;
    }
}
