package HugeBusinessManager.BusinessManagerService.impl;

import HugeBusinessManager.BusinessManagerDao.StudentMapper;
import HugeBusinessManager.BusinessManagerPojo.Student;
import HugeBusinessManager.BusinessManagerService.StudentService;
import HugeBusinessManager.BusinessManagerVO.StudentVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo FindAllStudent(StudentVO vo) {

        PageHelper.startPage(vo.getPageSize(),vo.getPageNum());
        List<Student> students = studentMapper.SelectUserList();
        PageInfo<Student> pageInfo = new PageInfo<>(students);

        return pageInfo;
    }
}
