package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.entities_enums.WorkerLevel;

public class Worker {
    private String nome;
    private WorkerLevel workerLevel;
    private Double baseSalary;

    private Department department;

    //Ao ter um atributo do tipo lista na minha classe, ela não deve ser iniciada no meu construtor, devo iniciá-la vazia na minha classe 
    private List<HourContract> contracts = new ArrayList<>(); 

    public Worker () {

    }

    public Worker(String nome, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.nome = nome;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public String getNome() {
        return nome;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal =  Calendar.getInstance();
        for(HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);  //Em calender, o mês começa em 0, por isso adiciono + 1 
            if(year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }

}
