package Main;
import Object.Staff;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Staff [] staff = new Staff[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("enter value ");
        for (int i = 0 ; i < staff.length;i++){
            String name = scan.nextLine();
            String adress = scan.nextLine();
            int age = scan.nextInt();

            staff[i] = new Staff(name,adress,age);

            //clear cache
            scan.nextLine();
        }
        for(Staff s : staff){
            System.out.println(s.getName()+" "+s.getAdress()+" "+s.getAges());
        }


    }

}

