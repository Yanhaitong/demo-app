package com.yht.demo.entity.dto.product;

/**
 * 产品分类信息的返回值
 */
public class LoanProductClassifyReturnDto {
    /**
     * 分类id
     */
    private String classifyId;
    /**
     * 分类标题
     */
    private String title;
    /**
     * 分类图标url
     */
    private String icon;
    /**
     * 列表页背景图url
     */
    private String backgroundUrl;



    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    @Override
    public String toString() {
        return "LoanProductClassifyReturnDto{" +
                ", title=" + title +
                ", icon=" + icon +
                ", backgroundUrl=" + backgroundUrl +
                "}";
    }
}
