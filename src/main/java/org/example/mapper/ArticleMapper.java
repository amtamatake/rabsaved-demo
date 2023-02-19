package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.dao.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> listArticle();
}
