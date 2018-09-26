package com.bluegrass.dao;

import com.bluegrass.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> searchByUserId(@Param("userId") Integer userId);

    List<Article> searchByArticleTitle(String articleTitle);
}