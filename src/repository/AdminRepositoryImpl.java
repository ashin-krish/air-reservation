package repository;

import model.Admin;
import util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

public class AdminRepositoryImpl implements AdminRepository {

  private static final String FILE_PATH = "src/data/admins.json";

    private List<Admin> admins = new ArrayList<>();

    @Override
    public void saveAdmin(Admin admin) {
        admins.add(admin);
        JsonUtil.writeToFile(FILE_PATH, admins);
    }

    @Override
    public List<Admin> findAll() {
        return admins;
    }

    @Override
    public Admin findByEmail(String email) {

        for (Admin admin : admins) {
            if (admin.getEmail().equals(email)) {
                return admin;
            }
        }
        return null;
    }
}