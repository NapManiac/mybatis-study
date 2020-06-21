import com.fly.mapper.UserMapper;
import com.fly.pojo.User;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void testSelectUser() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
