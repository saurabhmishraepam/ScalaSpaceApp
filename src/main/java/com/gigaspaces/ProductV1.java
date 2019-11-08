package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class ProductV1 {

    private String id;
    private String name;
    @SpaceId
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductV1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public ProductV1() {
    }

    public ProductV1(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
