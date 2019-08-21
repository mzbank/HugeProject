package HugeBusinessManager.BusinessManagerService;

import HugeBusinessManager.BusinessManagerVO.StudentVO;
import com.github.pagehelper.PageInfo;

public interface StudentService {

    PageInfo FindAllStudent(StudentVO vo);
}
