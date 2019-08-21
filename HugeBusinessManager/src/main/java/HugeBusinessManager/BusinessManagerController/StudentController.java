package HugeBusinessManager.BusinessManagerController;

import HugeBusinessManager.BusinessManagerService.StudentService;
import HugeBusinessManager.BusinessManagerVO.StudentVO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(description = "学生接口")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/list")
    @ApiOperation(value = "查询" ,notes = "查询所有学生")
    public PageInfo studentPageInfo(StudentVO vo){
        log.info("传入的数据：" + vo);
        PageInfo pageInfo = studentService.FindAllStudent(vo);
        log.info("分页信息：" + pageInfo);
        return pageInfo;
    }

    @GetMapping("/json")
    public String GetInfo(){
        log.info("请求成功");
        return "df";
    }
}
