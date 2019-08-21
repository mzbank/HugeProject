package HugeBusinessManager.BusinessManagerService.impl;

import HugeBusinessManager.BusinessManagerService.StudentService;
import HugeBusinessManager.BusinessManagerVO.StudentVO;
import HugeBusinessManager.HugeBusinessManager;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HugeBusinessManager.class)
@Slf4j
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void findAllStudent() {
        StudentVO vo = new StudentVO();
        vo.setPageNum(4);
        vo.setPageSize(4);
        PageInfo pageInfo = studentService.FindAllStudent(vo);
        log.info("分页信息: "+pageInfo);
    }
}