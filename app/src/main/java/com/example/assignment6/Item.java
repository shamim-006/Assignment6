package com.example.assignment6;

public class Item {
    private String title;
    private int imageResource;
    private String description;

    public Item(String title, int imageResource, String description) {
        this.title = title;
        this.imageResource = imageResource;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDescription() {
        return description;
    }
}
