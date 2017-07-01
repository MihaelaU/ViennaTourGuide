package com.example.android.viennatourguide;


public class Item {

    private String title;
    private String eventDesc;
    private String location;
    private int image;

    public Item(String title, String eventDesc, String location, int image) {
        this.title = title;
        this.eventDesc = eventDesc;
        this.location = location;
        this.image = image;
    }

    public Item(String title, String location, String eventDesc) {
        this.title = title;
        this.location = location;
        this.eventDesc = eventDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
