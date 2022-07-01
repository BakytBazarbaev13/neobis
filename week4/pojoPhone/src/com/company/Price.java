package com.company;

public class Price {
    private int id;
    private double price;
    private Phone phone;

    public Price(int id){
        this.id=id;
    }

    public Price(int id,double price){
        this.id=id;
        this.price=price;
    }

    public Price(int id,double price,Phone phone){
        this(id,price);
        this.phone=phone;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", price=" + price +
                ", phone=" + phone +
                '}';
    }
}
