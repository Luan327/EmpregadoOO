import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department department = new Department();

        System.out.print("Nome do departamento: ");
        department.setName(sc.next());

        System.out.print("Dia do pagamento: ");
        department.setPayDay(sc.nextInt());
        sc.nextLine(); // consumir linha.

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        Address address = new Address(email,telefone);
        department.setAddress(address);

        System.out.println();

        System.out.print("Quantos funcionários tem o departamento? ");
        int quantidadeFuncionario = sc.nextInt();
        sc.nextLine(); // consumo de linha;


        for (int i = 0; i < quantidadeFuncionario; i++) {
            System.out.println("Dados do funcionário " + (i + 1));
            System.out.print("Nome : ");
            String name = sc.nextLine();

            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(name, salary);

            department.addEmployee(emp);
        }

        sc.close();
    }

    public static void showReport(Department dept) {
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println("Departamento : " + dept.getName());
        System.out.println("Total de pagamentos : "
                + String.format("%.2f", dept.payroll()));
        System.out.println("Funcionários: ");
        for (Employee emp : dept.getEmp()) {
            System.out.println(" - " + emp.getName()
                    + " - " + " Salário: "
                    + emp.getSalary());
        }
        System.out.println("Para duvidas favor entrar em contato: " + dept.getAddress().getEmail());
    }
}