package HugeBusinessManager.ExcelImport.ExcelUtils;

import org.apache.catalina.connector.Response;
import org.apache.poi.hssf.usermodel.*;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName ExcelUtils
 * @Description excel工具
 * @Author
 * @Date2019/8/21 15:56
 * @Version V1.0
 */

public class ExcelUtils {

    public void CreateExcel(Response response) throws IOException {
        /**
        * 功能描述:创建excel表单
         * @param
        * @return:
        */
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("调查问卷");

        setTitle(workbook,sheet);

        HSSFRow row = sheet.createRow(1);
        row.createCell(0).setCellValue(01);
        row.createCell(1).setCellValue("ABCD");
        row.createCell(2).setCellValue("BC,CD");
        row.createCell(3).setCellValue("不知道答什么");

        String fileName = "survey-answer.xlsx";
        //清空response
        response.reset();
        //设置response的Header
        response.addHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream os = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        //将excel写入到输出流中
        try {
            workbook.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        os.flush();
        os.close();

    }

    /**
    * 功能描述:
     * @param workbook
     * @param sheet
    * @Author:
    * @Date:
    */

    private void setTitle(HSSFWorkbook workbook, HSSFSheet sheet){
        HSSFRow row = sheet.createRow(1);
//设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1,10*256);
        sheet.setColumnWidth(2,10*256);
        sheet.setColumnWidth(3,10*256);
        sheet.setColumnWidth(4,100*256);

        HSSFCellStyle cellStyle = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        cellStyle.setFont(font);

        HSSFCell cell;

        cell = row.createCell(01);
        cell.setCellValue("序号");
        cell.setCellStyle(cellStyle);
        cell = row.createCell(02);
        cell.setCellValue("单选");
        cell.setCellStyle(cellStyle);
        cell = row.createCell(03);
        cell.setCellValue("多选");
        cell.setCellStyle(cellStyle);
        cell = row.createCell(04);
        cell.setCellValue("简答");
        cell.setCellStyle(cellStyle);
    }

}