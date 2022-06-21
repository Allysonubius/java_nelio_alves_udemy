package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Employee;
import application.entities.OutsourceEmployee;

public class Program{
    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();

        System.out.print("\n"+"Insira o número de empregados : ");
        int n = scanner.nextInt();
        for(int i = 1; i<= n;i++){
            System.out.print("\n"+"Empregado Nº " + i+ "\n");
            System.out.print("\n"+"Taxa addicional (y/n)? ");
            char booleanChar = scanner.next().charAt(0);
            System.out.print("\n"+"Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("\n"+"Horas: ");
            int hours = scanner.nextInt();
            System.out.print("\n"+"Valor por horas: ");
            double valuePerHour = scanner.nextDouble();

            if(booleanChar == 'y'){
                System.out.print("\n"+"Digite a taxa adicional: ");
                double additionalCharge = scanner.nextDouble();
                OutsourceEmployee outsourceEmployee = new OutsourceEmployee(name, hours, valuePerHour,additionalCharge);
                list.add(outsourceEmployee);
            }
			else {
                Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}
        }

        System.out.println();
        System.out.print("Pagamentos "+"\n");
        for(Employee emp : list){
            System.out.print("\n"+emp.getName() + " - R$ " +String.format("%.2f", emp.payment()));
            System.out.println();
        }

        scanner.close();
    }
}