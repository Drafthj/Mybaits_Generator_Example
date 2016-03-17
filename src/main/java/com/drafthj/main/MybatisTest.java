package com.drafthj.main;

import com.drafthj.mapper.StudentMapper;
import com.drafthj.model.Student;
import com.drafthj.model.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by huojia on 2016/3/17 13:38.
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        //插入数据
//        Student student = new Student();
//        student.setName("xiaoming");
//        student.setAge(18);
//        student.setBirth(new Date());
//        student.setSex("男");
//        studentMapper.insert(student);
//        session.commit();

        //查询数据
        Student student =studentMapper.selectByPrimaryKey(3);
        System.out.println(student);

        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andAgeGreaterThan(10);
        Student student1 = studentMapper.selectByExample(studentExample).get(0);
        System.out.println(student1);

    }
}
