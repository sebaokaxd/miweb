package com.example.demo;

public class ServiceItem {
    private String title;
    private String description;
    private String img; // ruta relativa: /img/...
    private String price;

    public ServiceItem(String title, String description, String img, String price) {
        this.title = title;
        this.description = description;
        this.img = img;
        this.price = price;
    }
    // getters y setters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getImg() { return img; }
    public String getPrice() { return price; }
}
