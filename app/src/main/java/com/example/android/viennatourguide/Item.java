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

    public String getTitle() {
        return title;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }
}
