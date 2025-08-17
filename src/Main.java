
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees : ");
        int n = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Employee # " + (i + 1));
            System.out.print("Outsourced ? (y/n):  " );
            char question = sc.next().charAt(0);
                System.out.print("Name:" );
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                if(question == 'y'){
                    System.out.print("Additional charge : ");
                    double additionalCharge = sc.nextDouble();
                    employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
                } else {
                    employees.add(new Employee(name,hours,valuePerHour));
                }
            }
        System.out.println();
        System.out.println("PAYMENTS: ");

        for(Employee emp : employees){
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }




}
