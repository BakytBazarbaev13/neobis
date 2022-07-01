package com.company;

import java.time.LocalDateTime;

public class Operation {
    private int id;
    private LocalDateTime date_sale;
    private double cash;
    private double change;
    private Phone phone;
    private Employees employees;
    private Client client;

    public Operation(int id){
        this.id=id;
    }

    public Operation(int id,LocalDateTime date_sale){
        this.id=id;
        this.date_sale=date_sale;
    }

    public Operation(int id, LocalDateTime date_sale, double cash){
        this(id,date_sale);
        this.cash=cash;
    }

    public Operation(int id,LocalDateTime date_sale,double cash,double change){
        this(id,date_sale,cash);
        this.change=change;
    }

    public Operation(int id,LocalDateTime date_sale,double cash,double change,Phone phone){
        this(id,date_sale,cash,change);
        this.phone=phone;
    }
    public Operation(int id,LocalDateTime date_sale,double cash,double change,Phone phone,Employees employees){
        this(id,date_sale,cash,change,phone);
        this.employees=employees;
    }

    public Operation(int id,LocalDateTime date_sale,double cash,double change,Phone phone,Employees employees,Client client){
        this(id,date_sale,cash,change,phone,employees);
        this.client=client;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setDate_sale(LocalDateTime date_sale){
        this.date_sale=date_sale;
    }

    public LocalDateTime getDate_sale(){
        return date_sale;
    }

    public void setCash(int cash){
        this.cash=cash;
    }

    public double getCash(){
        return cash;
    }

    public void setChange(double change){
        this.change=change;
    }

    public double getChange(){
        return change;
    }

    public void setPhone(Phone phone){
        this.phone=phone;
    }

    public Phone getPhone(){
        return phone;
    }

    public void setEmployees(Employees employees){
        this.employees=employees;
    }

    public Employees getEmployees(){
        return employees;
    }

    public void setClient(Client client){
        this.client=client;
    }

    public Client getClient(){
        return client;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", date_sale=" + date_sale +
                ", cash=" + cash +
                ", change=" + change +
                ", phone=" + phone +
                ", employees=" + employees +
                ", client=" + client +
                '}';
    }
}
