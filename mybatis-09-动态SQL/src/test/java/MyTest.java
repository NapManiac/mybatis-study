import com.fly.mapper.BlogMapper;
import com.fly.pojo.Blog;
import com.fly.util.IDUtil;
import com.fly.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    public void init() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setId(IDUtil.getId());
        blog.setTitle("mybatis如此简单");
        blog.setAuthor("符凌云");
        blog.setCreateTime(new Date());
        blog.setViews(999);

        mapper.insertBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Java如此简单");
        mapper.insertBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("spring如此简单");
        mapper.insertBlog(blog);

        blog.setTitle("spring cloud如此简单");
        blog.setId(IDUtil.getId());
        mapper.insertBlog(blog);


        session.close();
    }

    @Test
    public void testSelectBlogIf() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("author", "符凌云");
        mapper.selectBlogIf(map);

        session.close();
    }

    @Test
    public void testSelectBlogWhereIf() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("title", "Java如此简单");
        map.put("author", "符凌云");
        mapper.selectBlogWhereIf(map);

        session.close();
    }

    @Test
    public void testUpdateBlogSet() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("id", "0a960b9d47004929801d8d9f0f242a59");
        map.put("author", "符凌风");
        map.put("title", "Mybatis");
        mapper.updateBlogSet(map);

        session.close();
    }

    @Test
    public void testSelectBlogChoose() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("view", "1000");
        mapper.selectBlogChoose(map);

        session.close();
    }

    @Test
    public void testSelectBolgForeach() {
        SqlSession session = MybatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Map map = new HashMap<>();
        ArrayList<String> ids = new ArrayList<>();
        ids.add("8991edff9ff14754b59dc569a4bd6604");
        ids.add("15bed63574464dcab04a51786e7875e8");
        map.put("ids", ids);
        mapper.selectBolgForeach(map);

        session.close();
    }


}
