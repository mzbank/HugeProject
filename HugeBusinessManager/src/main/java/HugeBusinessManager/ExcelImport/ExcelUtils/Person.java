package HugeBusinessManager.ExcelImport.ExcelUtils;

import java.util.Date;
import cn.afterturn.easypoi.excel.annotation.Excel;


/**
 * @ClassName Person
 * @Description
 * @Author
 * @Date2019/8/21 17:02
 * @Version V1.0
 */
public class Person {

    @Excel(name = "姓名", orderNum = "0")
    private String name;

    @Excel(name = "性别", replace = {"男_1", "女_2"}, orderNum = "1")
    private String sex;

    @Excel(name = "生日", exportFormat = "yyyy-MM-dd", orderNum = "2")
    private Date birthday;
}