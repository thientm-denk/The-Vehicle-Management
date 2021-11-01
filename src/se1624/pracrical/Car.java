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
public class Car extends Vehicles {

    private String type;
    private int yearOfmanufacture;

    public Car(String ID, String name, String color, Integer price, String brand, String type, int yearOfmanufacture) {
        super(ID, name, color, price, brand);
        this.type = type;
        this.yearOfmanufacture = yearOfmanufacture;
    }

    @Override
    public void showInfor() {
        System.out.printf("|%-5s|%-15s|%-15s|%-5d|%-15s|%-15s|%-5d|\n", ID, name, color, price, brand, type, yearOfmanufacture);
    }

    @Override
    public void update() {
        super.update();
        this.setType(Utils.getString("newTpye: ", getType()));
        this.setYearOfmanufacture(Utils.getInt("new yearOfManufacture(1-100): ", 1, 100, getYearOfmanufacture()));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfmanufacture() {
        return yearOfmanufacture;
    }

    public void setYearOfmanufacture(int yearOfmanufacture) {
        this.yearOfmanufacture = yearOfmanufacture;
    }

}
