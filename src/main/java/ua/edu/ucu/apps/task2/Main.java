package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
            System.out.println("Success");
        }
    }
}
