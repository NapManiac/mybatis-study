import com.fly.mapper.UserMapper;
import com.fly.pojo.User;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    private static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void testSelectUserLimit() {

        logger.info("info:进入selectUser()");
        logger.debug("debug:进入selectUser()");
        logger.error("error:进入 selectUser()");

        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> users = userMapper.selectUserByLimit(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);



        RowBounds rowBounds = new RowBounds(0, 2);

        //通过session.**方法进行传递rowBounds，[此种方式现在已经不推荐使用了]
        List<User> users = sqlSession.selectList("com.fly.mapper.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
