import com.fly.mapper.TeacherMapper;
import com.fly.pojo.Teacher;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void testSelectTeacherById1() {
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.selectTeacherById1(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void testSelectTeacherById2() {
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.selectTeacherById2(1);
        System.out.println(teacher);
        session.close();
    }
}
