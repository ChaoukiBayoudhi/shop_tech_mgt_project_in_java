package details;

import enumerations.MicroprocessorBrand;

import java.util.Scanner;

public class Microprocessor {
    private Long id;
    private String name;
    private MicroprocessorBrand brand=MicroprocessorBrand.INTEL;
    private int frequency;
    private int cache;
    private int cores;
    private  double price;
    //get Microprocessor attributes values from the keyboard
    public void getProperties(){
        Scanner sc=new Scanner(System.in);
        System.out.println("id = ");
        id=sc.nextLong();
        System.out.println("name = ");
        name=sc.nextLine();
        System.out.println("frequency = ");
        frequency=sc.nextInt();
        System.out.println("cahe = ");
        cache=sc.nextInt();
        System.out.println("nbr cores = ");
        cores=sc.nextInt();
        System.out.println("price = ");
        price=sc.nextDouble();
        //get the brand
        System.out.println("brand = (choose between intel, apple, amd or other)");
        String b1=sc.next().toLowerCase();
        switch (b1) {
            case "intel":
                brand=MicroprocessorBrand.INTEL;
                break;
                case "apple":
                    brand=MicroprocessorBrand.APPLE;
                    break;
            case "amd":
                brand=MicroprocessorBrand.AMD;
                break;
            default:
                brand=MicroprocessorBrand.OTHER;
        }
    }
}
