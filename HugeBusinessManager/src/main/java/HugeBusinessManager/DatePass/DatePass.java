package HugeBusinessManager.DatePass;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Data
public class DatePass {

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
}
