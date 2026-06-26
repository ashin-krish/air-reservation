package repository;

import model.Admin;
import java.util.List;

public interface AdminRepository {

    void saveAdmin(Admin admin);

    List<Admin> findAll();

    Admin findByEmail(String email);
}