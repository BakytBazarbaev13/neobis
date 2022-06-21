package com.company;

public class Price {
    private int id;
    private int price;
    private Phone phone;

    public Price(int id){
        this.id=id;
    }

    public Price(int id,int price){
        this.id=id;
        this.price=price;
    }

    public Price(int id,int price,Phone phone){
        this(id,price);
        this.phone=phone;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
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
