package Equipments;

import details.Constructor;
import details.Microprocessor;
import enumerations.EquipmentState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Equipment is a superclass of Computer, Smartphone and Printer
//Equipment is a parent of Computer, Smartphone and Printer
//Equipment is a base class of Computer, Smartphone and Printer
public class Equipment {
    private long id;
    private String name;
    private double price;
    private Microprocessor processor=new Microprocessor();
    private Constructor constructor=new Constructor();
    private EquipmentState state=EquipmentState.IN_STOCK;
    private int ram;

    /*public void print(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("processor: "+processor);
        System.out.println("constructor: "+constructor);
        System.out.println("state: "+state);
        System.out.println("ram: "+ram);
    }*/
    //get the equipment attributes values from the keyboard
    public  void getProperties(){
        Scanner sc = new Scanner(System.in);
        System.out.print("id =  ");
        id = sc.nextLong();
        System.out.print("name =  ");
        name = sc.nextLine();
        System.out.print("price =  ");
        price = sc.nextDouble();
        System.out.println("microprocessor Information :");
        processor.getProperties();
        System.out.print("ram capacity = ");
        ram=sc.nextInt();
    }
    //redefinition of toString method
    @Override
    public String toString(){
        return "id: "+id+", name :  "+name+", price : "+price+", ram capacity : "+ram+", state : "+state;
    }

}
