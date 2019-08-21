package HugeBusinessManager.BusinessManagerDao;

import HugeBusinessManager.BusinessManagerPojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> SelectUserList();

    List<Student> SelectList();

    boolean InsertStudent(Student student);

    boolean batchSave(@Param("list") List<Student> students);
}
