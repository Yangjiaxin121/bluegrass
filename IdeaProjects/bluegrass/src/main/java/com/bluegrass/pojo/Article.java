package com.bluegrass.pojo;

import java.util.Date;

public class Article {
    private Integer id;

    private Integer userId;

    private String articleTitle;

    private Integer articleViewcount;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private String detail;

    private Date createTime;

    private Date updateTime;

    public Article(Integer id, Integer userId, String articleTitle, Integer articleViewcount, String subtitle, String mainImage, String subImages, String detail, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.articleTitle = articleTitle;
        this.articleViewcount = articleViewcount;
        this.subtitle = subtitle;
        this.mainImage = mainImage;
        this.subImages = subImages;
        this.detail = detail;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleViewcount() {
        return articleViewcount;
    }

    public void setArticleViewcount(Integer articleViewcount) {
        this.articleViewcount = articleViewcount;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}