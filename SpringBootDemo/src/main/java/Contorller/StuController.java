package Contorller;

import Bean.Student;
import ch.qos.logback.classic.spi.STEUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2018\4\28 0028.
 */
@RestController
@SpringBootApplication
public class StuController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

        @RequestMapping("/lin")
        public List<Student> getDbType(){
            String sql = "select id,name,remark from student";
            List<Student> stu = jdbcTemplate.queryForList(sql,Student.class);
            System.out.println(stu);
            return stu;
        }

    public static  void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
    }
}
