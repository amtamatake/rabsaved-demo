package org.example.service.impl;

import org.example.dao.Article;
import org.example.mapper.ArticleMapper;
import org.example.service.ArticleService;
import org.example.utils.FileUtils;
import org.example.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 人气最高
     * @param limit
     * @return
     */
    @Override
    public Result hotArticles(int limit) {
        List<Article> articles = articleMapper.listArticle();
        List<Article> hotArticles = articles.stream()
                //根据viewCounts属性降序排序
                .sorted(Comparator.comparingInt(Article::getViewCounts).reversed())
                //取前limit个
                .limit(limit)
                //转换为List<Article>
                .collect(Collectors.toList());
        for (Article hotArticle : hotArticles) {
            List<String> pictures = FileUtils.getPictures(hotArticle.getPicture());
        }
        return Result.success(hotArticles);
    }
}
