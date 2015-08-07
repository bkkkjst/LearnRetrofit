package me.dev.bkk.learnretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BKK on 7/8/2558.
 */
public class Shot {
    private int id;
    private String title;
    private String description;
    private String url;

    @SerializedName("image_url")
    private String imageUrl;

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
