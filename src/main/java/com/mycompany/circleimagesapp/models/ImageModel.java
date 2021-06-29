/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.circleimagesapp.models;

/**
 *
 * @author Marcin
 */
public class ImageModel {
    
    private String id;
    private int hour;
    private int min;
    private String imagepath;
    private String url;
    private String forumpath;

    public ImageModel(String id, int hour, int min, String imagepath, String url, String forumpath) {
        this.id = id;
        this.hour = hour;
        this.min = min;
        this.imagepath = imagepath;
        this.url = url;
        this.forumpath = forumpath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForumpath() {
        return forumpath;
    }

    public void setForumpath(String forumpath) {
        this.forumpath = forumpath;
    }
    
    
    
    
    
    
    
}
