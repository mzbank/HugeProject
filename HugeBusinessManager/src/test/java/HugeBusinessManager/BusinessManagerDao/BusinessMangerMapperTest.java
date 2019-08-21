package HugeBusinessManager.BusinessManagerDao;

import HugeBusinessManager.BusinessManagerPojo.BusinessManager;
import HugeBusinessManager.BusinessManagerPojo.Student;
import HugeBusinessManager.HugeBusinessManager;
import HugeUtils.DateTimeUtil.FormatDate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HugeBusinessManager.class)
@Slf4j
public class BusinessMangerMapperTest {

    @Autowired
    private BusinessMangerMapper businessMangerMapper;

    @Autowired
    private StudentMapper studentMapper;


    String patten = "YYYY-MM-dd HH-mm-ss";


    @Test
    public void batchInsertManger() {
        List<BusinessManager> managers = new ArrayList<>();

        for (int i = 0; i < 120; i++) {
            Date date = new Date();
            FormatDate formatDate = new FormatDate();
            String formatResult = formatDate.FormatDate(date, patten);
            BusinessManager businessManager = new BusinessManager();
            businessManager.setManagerId("0" + i);
            businessManager.setManagerName("manager" + i);
            businessManager.setCreateManagerDate(formatResult);
            managers.add(businessManager);
        }
        boolean result = businessMangerMapper.BatchInsertManger(managers);
        log.info("批量插入结果：" + result);
    }

    @Test
    public void InsertManger() {
        Date date = new Date();
        FormatDate formatDate = new FormatDate();
        String formatResult = formatDate.FormatDate(date, patten);
        BusinessManager businessManager = new BusinessManager();
        businessManager.setManagerId("01");
        businessManager.setManagerName("manager01");
        businessManager.setCreateManagerDate(formatResult);
        boolean result = businessMangerMapper.InsertManger(businessManager);
        log.info("插入结果： " + result);
    }

    @Test
    public void SelectUserList() {

        List<Student> students = studentMapper.SelectUserList();
        log.info("学生列表：" + students);
    }

    @Test
    public void SelectList(){
        List<Student> students = studentMapper.SelectList();
        log.info("所有学生信息:" + students);
    }

    @Test
    public void batchSave(){
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Student student = new Student();
            student.setCid("10"+i);
            student.setSid("20"+i);
            student.setSname("张鲁");
            list.add(student);
        }
        boolean result = studentMapper.batchSave(list);
        log.info("批量插入结果：" + result);
    }
}