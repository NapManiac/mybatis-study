package com.fly.mapper;

import com.fly.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //新增一个博客
    public int insertBlog(Blog blog);

    //if
    public List<Blog> selectBlogIf(Map map);

    //where-if
    public List<Blog> selectBlogWhereIf(Map map);

    //set
    public int updateBlogSet(Map map);

    //choose
    public List<Blog> selectBlogChoose(Map map);

    //foreach
    public List<Blog> selectBolgForeach(Map map);
}
