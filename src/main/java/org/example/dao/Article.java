package org.example.dao;

import lombok.Data;

@Data
public class Article {

    /**本子id。*/
    private Integer articleId;

    /**创建时间。*/
    private String createDate;

    /**标题。*/
    private String title;

    /**作者。*/
    private String author;

    /**上传者。*/
    private String upLoader;

    /**浏览数量。*/
    private Integer viewCounts;

    /**评论数量。*/
    private Integer commentCounts;

    /**简介。*/
    private String summary;

    /**封面。*/
    private String background;

    /**内容图片。*/
    private String picture;

}
