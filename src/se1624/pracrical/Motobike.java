/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1624.pracrical;

public class Motobike extends Vehicles {

    private int speed;
    private String requireLicense;

    public Motobike(String ID, String name, String color, Integer price, String brand, int speed, String requireLicense) {
        super(ID, name, color, price, brand);
        this.speed = speed;
        this.requireLicense = requireLicense;
    }

    @Override
    public void showInfor() {
        System.out.printf("|%-5s|%-15s|%-15s|%-5d|%-15s|%-15s|%-5d|", ID, name, color, price, brand, requireLicense, speed);
        makeSound();
        System.out.println("");
    }

    @Override
    public void update() {
        super.update();
        this.setRequireLicense(Utils.getString("newRequireLicense: ", getRequireLicense()));
        this.setSpeed(Utils.getInt("new Speed(1-300): ", 1, 300, getSpeed()));

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getRequireLicense() {
        return requireLicense;
    }

    public void setRequireLicense(String requireLicense) {
        this.requireLicense = requireLicense;
    }

    public void makeSound() {
        System.out.printf("Tin Tin Tin");
    }

}
