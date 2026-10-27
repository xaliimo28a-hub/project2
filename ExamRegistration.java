package chapter2;

import java.util.Scanner;

class  InvalidRegistrationExcePtion extends  Exception{
    public InvalidRegistrationExcePtion(String massage){
        super(massage);
    }
}
public class ExamRegistration {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter Student ID:");
        String studentID = input.nextLine();
        System.out.print("enter name:");
        String name = input.nextLine();
        System.out.print("enter age:");
        int age= input.nextInt();
        System.out.print("enter Examination mark:");
        double mark = input.nextDouble();
        System.out.print("enter  Number of subjects:");
        int subjects = input.nextInt();


        try {
            if (age < 18 || age > 60){
                throw  new InvalidRegistrationExcePtion("invalid age!");
            }
            if (name.isEmpty()){
                throw  new InvalidRegistrationExcePtion("Name connot be empty!");
            }
            if (mark < 0 || mark > 100) {
                throw  new InvalidRegistrationExcePtion("Invalid mark!");
            }
            if (subjects <= 0){
                throw  new InvalidRegistrationExcePtion("invalid number od subjects!");
            }
            if (studentID.isEmpty()){
                throw  new InvalidRegistrationExcePtion("Student ID connot be empty!");
            }
            System.out.println("Registration Successful!");

        }catch (InvalidRegistrationExcePtion e){
            System.out.println("Registration Error:"+ e.getMessage());
        }
        input.close();
        }
    }



