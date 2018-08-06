package com.example.allan.newsappexample;

import com.google.gson.annotations.SerializedName;

class ArticlesBean {
    /**
     * source : {"id":"techcrunch","name":"TechCrunch"}
     * author : Jon Russell
     * title : China's Didi pumps $1B into its rebranded driver services business
     * description : Didi Chuxing is going pedal to the metal for its automobile services business after it announced it will invest $1 billion into the division, which is also getting a rebrand. The Chinese ride-hailing firm had been tipped to spin out the business and raise $1.…
     * url : https://techcrunch.com/2018/08/06/chinas-didi-pumps-1b-into-its-rebranded-driver-services-business/
     * urlToImage : https://techcrunch.com/wp-content/uploads/2016/09/didi-2.jpg?w=589
     * publishedAt : 2018-08-06T09:31:18Z
     */

    @SerializedName("source")
    private SourceBean source;
    @SerializedName("author")
    private String author;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("url")
    private String url;
    @SerializedName("urlToImage")
    private String urlToImage;
    @SerializedName("publishedAt")
    private String publishedAt;

    public SourceBean getSource() {
        return source;
    }

    public void setSource(SourceBean source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt  = publishedAt;
    }
}
