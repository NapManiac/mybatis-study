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

    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(userMapper.selectUserById(1));

        sqlSession.close();
    }

    @Test
    public void testSelectUserByOthers1() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectUserByOthers1("符凌云", "123"));
        sqlSession.close();
    }

    @Test
    public void testSelectUserByOthers2() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("符凌云");
        user.setPwd("123");

        System.out.println(userMapper.selectUserByOthers2(user));
        sqlSession.close();
    }

    @Test
    public void testSelectUserByOthers3() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectUserByOthers3("符凌云", "123"));
        sqlSession.close();
    }

    @Test
    public void testSelectUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "符凌云");
        map.put("pwd", "123");
        System.out.println(userMapper.selectUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testAddUser() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(4, "李四", "123");
        int res = userMapper.addUser(user);
        if (res != 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        //增删改都要commit 提交事务才会生效
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateUser() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(4);
        user.setName("lisi");
        user.setPwd("1234");
        int res = userMapper.updateUser(user);
        if (res != 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }

        //增删改都要commit 提交事务才会生效
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.deleteUser(4);
        if (res != 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        //增删改都要commit 提交事务才会生效
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectLike() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        String likeName = "符";
        List<User> users = userMapper.selectLike(likeName);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
