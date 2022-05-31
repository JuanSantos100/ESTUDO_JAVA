package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.entities_enums.WorkerLevel;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        System.out.print("Entre com o nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador.");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("Quantos contratos este trabalhador vai ter: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do contrato de número #" + i + 1);
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Entre com o mês e ano para calcular o salário (MM/AAAA): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));


        System.out.println("Name: " + worker.getNome());
        System.out.println("Department: " + worker.getDepartment().getNome());
        System.out.println("Valor de " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));




        sc.close();
    }
}