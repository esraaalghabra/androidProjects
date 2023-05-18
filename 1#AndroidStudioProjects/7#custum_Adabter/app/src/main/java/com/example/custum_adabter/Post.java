package com.example.custum_adabter;

import java.io.Serializable;

public class Post implements Serializable
{
    private String data;
    private String name;
    private String body;
    private int folowers;
    private int folowing;
    private int postes;

    public Post(String data, String name, String body, int folowers, int folowing, int postes) {
        this.data = data;
        this.name = name;
        this.body = body;
        this.folowers = folowers;
        this.folowing = folowing;
        this.postes = postes;

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getFolowers() {
        return folowers;
    }

    public void setFolowers(int folowers) {
        this.folowers = folowers;
    }

    public int getFolowing() {
        return folowing;
    }

    public void setFolowing(int folowing) {
        this.folowing = folowing;
    }

    public int getPostes() {
        return postes;
    }

    public void setPostes(int postes) {
        this.postes = postes;
    }
}
