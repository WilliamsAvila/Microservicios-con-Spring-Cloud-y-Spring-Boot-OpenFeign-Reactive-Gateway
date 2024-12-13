package org.demofeign.Model;


public class DemoFeignModel {

    private int id;
    private String name;

    public DemoFeignModel(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public DemoFeignModel() {
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
