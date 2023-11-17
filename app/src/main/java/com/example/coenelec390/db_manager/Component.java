package com.example.coenelec390.db_manager;
import java.util.Map;

public class Component {
    public Map<String, String> characteristics;
    public String location;
    public int quantity;
    public String tagID;

    public Component() {
        // Default constructor required for Firebase
    }

    public Component(Map<String, String> characteristics, String location, int quantity, String tag) {
        this.characteristics = characteristics;
        this.location = location;
        this.quantity = quantity;
        this.tagID = tag;
    }
}