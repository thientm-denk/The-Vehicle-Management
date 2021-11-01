package se1624.pracrical;

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
public class ShowRoomManagement {

    public static void main(String args[]) {
        I_Menu menu = new Menu();
        menu.addItem("1. Add new vehicle");
        menu.addItem("2. Update vehicle by ID");
        menu.addItem("3. Delete vehicle by ID");
        menu.addItem("4. Search vehicle by ID");
        menu.addItem("5. Sort by name(descending)");
        menu.addItem("6. Show vehicle list");
        menu.addItem("7. Quit");
        
        I_Menu subMenu = new Menu();
        subMenu.addItem("1. Car");
        subMenu.addItem("2. Motobike");
        subMenu.addItem("3. Quit");
        
        VehicleList list = new VehicleList();
        int choice;
        boolean cont = false;
 
        do {
            menu.showMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:{
                    subMenu.showMenu();
                    int subchoice = subMenu.getChoice();
                    switch (subchoice){
                        case 1:{
                            list.add(1);
                            break;
                        }
                        case 2:{
                            list.add(2);
                            break;
                        }
                        case 3:{
                            break;
                        }
                    }
                    break;
                }          
                case 2:{
                    list.update();
                    break;
                }
                case 3:{
                    list.delete();
                    break;
                }
                case 4:{
                    list.searchVehicle();
                    break;
                }
                case 5:{
                    list.sort();
                    break;
                }
                case 6:{
                    list.output();
                    break;
                }
                case 7:
                    cont = menu.confirmYesNo("Do you want to quit?(Y/N)");
                    break;
            }
        } while (!cont);
    }
}
