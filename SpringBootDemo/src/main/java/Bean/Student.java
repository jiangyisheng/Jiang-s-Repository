package Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018\4\28 0028.
 */

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String remark;

}
