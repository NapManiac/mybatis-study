import com.fly.mapper.UserMapper;
import com.fly.pojo.User;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSession(true);
        //本质上利用了jvm的动态代理机制
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }




}
