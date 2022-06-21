package com.company;

import java.time.LocalDate;

public class Phone {
    private int id;
    private String name;
    private String color;
    private int memory;
    private int ram;
    LocalDate year_of_issue;
    private Brand brand;

    public Phone(int id){
        this.id=id;
    }
    public Phone(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Phone(int id,String name,String color){
        this(id,name);
        this.color=color;
    }
    public Phone(int id,String name,String color,int memory){
        this(id,name,color);
        this.memory=memory;
    }
    public Phone(int id,String name,String color,int memory,int ram){
        this(id,name,color,memory);
        this.ram=ram;
    }
    public Phone(int id,String name,String color,int memory,int ram,LocalDate year_of_issue){
        this(id,name,color,memory,ram);
        this.year_of_issue=year_of_issue;
    }
    public Phone(int id,String name,String color,int memory,int ram,LocalDate year_of_issue,Brand brand){
        this(id,name,color,memory,ram,year_of_issue);
        this.brand=brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setMemory(int memory){
        this.memory=memory;
    }

    public int getMemory(){
        return memory;
    }

    public void setRam(int ram){
        this.ram=ram;
    }

    public int getRam(){
        return ram;
    }

    public void setYear_of_issue(LocalDate year_of_issue){
        this.year_of_issue=year_of_issue;
    }

    public LocalDate getYear_of_issue(){
        return year_of_issue;
    }

    public void setBrand(Brand brand){
        this.brand=brand;
    }

    public Brand getBrand(){
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", ram=" + ram +
                ", year_of_issue=" + year_of_issue +
                ", brand=" + brand +
                '}';
    }
}
