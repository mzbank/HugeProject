package HugeBusinessManager.BusinessManagerDao;

import HugeBusinessManager.BusinessManagerPojo.BusinessManager;
import HugeBusinessManager.BusinessManagerPojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessMangerMapper {

    boolean BatchInsertManger(@Param("managers") List<BusinessManager> managers);

    boolean InsertManger(@Param("manager") BusinessManager manager);

    List<Student> SelectManager();


}
