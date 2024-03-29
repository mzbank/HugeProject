package HugeBusinessManager.ExcelImport.CustomAnnotate;

import java.lang.annotation.*;

/**
 * @ClassName ExcelColumn
 * @Description 自定义注解
 * @Author
 * @Date2019/8/21 11:09
 * @Version V1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelColumn {

    String value() default "";

    int col() default 0;
}