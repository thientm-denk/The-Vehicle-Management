/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1624.pracrical;

/**
 *
 * @author Truc Tran 2T Design
 */
public class Vehicles implements Comparable<Object> {

    protected String ID;
    protected String name;
    protected String color;
    protected int price;
    protected String brand;

    public void showInfor() {
        System.out.printf("|%-5s|%-15s|%-15s|%-5d|%-15s|\n", ID, name, color, price, brand);
    }

    public void update() {
        this.setName(Utils.getString("Newname: ", getName()));
        this.setColor(Utils.getString("newcolor: ", getColor()));
        this.setPrice(Utils.getInt("newPrice(1-1000): ", 1, 1000, getPrice()));
        this.setBrand(Utils.getString("newbrand: ", getBrand()));
    }

    @Override
    public int compareTo(Object o) {
        Vehicles Vehicle = (Vehicles) o;
        return Vehicle.getName().compareToIgnoreCase(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        Vehicles vehicles = (Vehicles) obj;
        return this.ID.equalsIgnoreCase(vehicles.getID());
    }

    public Vehicles() {
    }

    public Vehicles(String ID, String name, String color, Integer price, String brand) {
        this.ID = ID;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public Vehicles(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
