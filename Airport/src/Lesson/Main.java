package Lesson;

import model.Plane;
import model.PlaneService;

import java.security.Provider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Plane plane1 = new Plane("Airbus","France", 2010,1200,12000,false,20,900,156,20000$);
        Plane plane2  = new Plane("Copter","USA",2017, 100,11000,true,13,1200,2,17000$);
        Plane plane3 = new Plane("F-25","Russia",2016,29,15000,true,14,1100, 3,13000$);
        Plane [] planes = new Plane [10];
        int index = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("*********MENU*********");
        System.out.println("1 : to print planes info");
        System.out.println("2 : to print militry planes topspeed and cost");
        System.out.println("3 : to get newer plane");
        System.out.println("4 : to get plane with big wingspan");
        System.out.println("5 : to print plane with smallest seat count");
        System.out.println("6 : to print all not military planes");
        System.out.println("7 : to print all military planes which were in the air more than 100 h ");
        System.out.println("8 : to get plane with minimum weigh");

        boolean Active = true;
        while (Active){
            int choice = scanner.nextInt();
            System.out.println("*********MENU*********");
            System.out.println("1 : to print planes info");
            System.out.println("2 : to print militry planes topspeed and cost");
            System.out.println("3 : to get newer plane");
            System.out.println("4 : to get plane with big wingspan");
            System.out.println("5 : to ptint plane with smallest seat count");
            System.out.println("6 : to print all not military planes");
            System.out.println("7 : to print all military planes which were in the air more than 100 h ");
            System.out.println("8 : to get plane with minimum weigh");



            switch (choice ){
                case 1:
                   plane1.printINFO();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case  4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    break;
                case 7 :
                    break;

                    //  mnacacy chhascreci
            }
        }

    }
}