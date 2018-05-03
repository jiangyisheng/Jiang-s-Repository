package com.example.demo;


import Bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@SpringBootApplication
public class JiangApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiangApplication.class, args);
	}


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/lin")
		public List<Student> getDbType(){
		String sql = "select id,name,remark from student";
		List stu = jdbcTemplate.queryForList(sql);
//		Student stu = new Student();
//		stu.setId(1);
//		stu.setName("jiang");
//		stu.setRemark("adfadfafafd");
//		mm.put("info",stu);
//		return "info";
		return stu;
	}

}
