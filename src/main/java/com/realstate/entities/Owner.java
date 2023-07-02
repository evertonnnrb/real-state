package com.realstate.entities;

public class Owner {
    private Integer id;
    private String name;
    private String fone;

    public Owner() {
    }

    public Owner(Integer id, String name, String fone) {
        this.id = id;
        this.name = name;
        this.fone = fone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
