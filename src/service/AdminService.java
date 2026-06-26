package service;

import model.Admin;
import repository.AdminRepository;
import util.*;


public class AdminService 
{

         private AdminRepository adminRepo;

    public AdminService(AdminRepository adminrepo)
    {
        this.adminRepo = adminrepo;
    }
    public void addAdmin(String name,String email,String password)
    {
       ValidationUtil.checkEmail(email);
       ValidationUtil.checkPassword(password);
      int adminId = AdminIdGenerator.idGenerator();

      Admin admin = new Admin(name, email, password, adminId);

      adminRepo.saveAdmin(admin);



    }

}
