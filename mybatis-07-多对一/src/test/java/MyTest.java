import com.fly.mapper.StudentMapper;
import com.fly.mapper.TeacherMapper;
import com.fly.pojo.Student;
import com.fly.pojo.Teacher;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testSelectStudents1() {
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectStudents1();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void testSelectStudents2() {
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
}
