package HugeBusinessManager.ExcelImport;

import HugeBusinessManager.ExcelImport.CustomAnnotate.ExcelColumn;
import lombok.Data;

/**
 * @ClassName BusClick
 * @Description
 * @Author
 * @Date2019/8/21 12:12
 * @Version V1.0
 */
@Data
public class BusClick {

    @ExcelColumn(value = "cityCode", col = 1)
    private String cityCode;

    @ExcelColumn(value = "markId", col = 2)
    private String markId;

    @ExcelColumn(value = "toaluv", col = 3)
    private String toaluv;

    @ExcelColumn(value = "date", col = 4)
    private String date;

    @ExcelColumn(value = "clientVer", col = 5)
    private String clientVer;
}