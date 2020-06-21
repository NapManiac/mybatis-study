import com.fly.mapper.UserMapper;
import com.fly.pojo.User;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class MyTest {

    private static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void testSelectUser() {

        logger.info("info:进入selectUser()");
        logger.debug("debug:进入selectUser()");
        logger.error("error:进入 selectUser()");

        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
