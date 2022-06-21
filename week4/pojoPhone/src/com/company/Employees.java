package com.company;

public class Employees {
    private int id;
    private String name;
    private String address;
    private String phone_number;

    public Employees(int id){
        this.id=id;
    }

    public Employees(int id,String name){
        this.id=id;
        this.name=name;
    }

    public Employees(int id,String name,String address){
        this(id,name);
        this.address=address;
    }

    public Employees(int id,String name,String address,String phone_number){
        this(id,name,address);
        this.phone_number=phone_number;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhone_number(String phone_number){
        this.phone_number=phone_number;
    }

    public String getPhone_number(){
        return phone_number;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
