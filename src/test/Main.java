package test;

import repository.AdminRepositoryImpl;
import service.AdminService;

public class Main {

    public static void main(String[] args) {

        AdminService service =
                new AdminService(new AdminRepositoryImpl());

        service.addAdmin("Ashin", "ashin@gmail.com", "abc123@");
    }
}