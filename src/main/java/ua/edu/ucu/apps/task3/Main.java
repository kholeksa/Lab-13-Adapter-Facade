package ua.edu.ucu.apps.task3;

public class Main {
    public static void main(String[] args) {
        CompanyReader cr = new CompanyReader();
        Company company = cr.fetch("ucu.edu.ua");
        System.out.println(company);
    }
}
