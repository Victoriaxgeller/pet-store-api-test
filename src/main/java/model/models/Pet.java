package model.models;

import java.util.ArrayList;

public class Pet {

    public int id;
    public Category category;
    public String name;
    public ArrayList<String> photoUrls;
    public String status;

    public class Category {
        int id;
        String name;
    }
}
