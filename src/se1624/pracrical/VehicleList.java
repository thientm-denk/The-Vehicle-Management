package se1624.pracrical;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * This is comment, do not delete 2021.10.31
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */

public class VehicleList  extends ArrayList<Vehicles> implements I_List{
    
    @Override
    public int find(String code) {
        int index = -1;
        index = this.indexOf(new Vehicles(code));
        return index;
    }
    
    @Override
    public void add(int type) {
        String ID;
        do {
            ID = Utils.getString("Input code: ");
            if (find(ID) == -1) {
                break;
            } else {
                System.out.println("Code bi trung");
            }
        } while (true);
        String name = Utils.getString("Input name: ");
        String color = Utils.getString("Input color: ");
        int price = Utils.getInt("Input price(1-1000): ", 1, 1000);
        String brand = Utils.getString("Input brand: ");
        
        if(type == 1){
            String typeOfCar = Utils.getString("Input type: ");
            int yearOfManufacture = Utils.getInt("Input yearOfManufacture(1-100): ",1,100);
            this.add(new Car(ID, name, color, price, brand, typeOfCar, yearOfManufacture));
        }else{
            int speed = Utils.getInt("Input speed()1-300: ", 1, 300);
            String requiceLicense = Utils.getString("Requice License?: ");
            this.add(new Motobike(ID, name, color, price, brand, speed, requiceLicense));
        }
    }

    
    @Override
    public void delete() {
        String code = Utils.getString("Input code want to remove: ");
        if(Utils.confirmYesNo("Are you sure want to delete(Y/N): ")){
            this.remove(new Vehicles(code));
            System.out.println("Deleted!");
        }
    }

    
    @Override
    public void update() {
        String code = Utils.getString("Input code want to update: ");
        int index = this.find(code);
        if (index < 0 || index >= this.size()) {
            System.out.println("Not found!");
            return;
        }
        this.get(index).update(); 
        this.get(index).showInfor();
    }

    @Override
    public void sort() {
        Collections.sort(this);
    }

    @Override
    public void output() {
        for (Vehicles o : this) {
            o.showInfor();
        }
    }

    @Override
    public void searchVehicle() {
        String ID = Utils.getString("Input code: ");
        int index = find(ID);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            this.get(index).showInfor();
        }
    }

}
