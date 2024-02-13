package com.blog.extras;

public class Employe implements Comparable<Employe>{
    private int id;
    private String name;

    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employe o) {
        return  this.id-o.id;
    }
}
