package ua.edu.ucu.apps.task2;

public class Auth extends Авторизація {
    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
