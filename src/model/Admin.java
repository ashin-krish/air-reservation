package model;



public class Admin {


    private int adminId;
    private String name;  
    private String email;
    private String password;

  public  Admin(String name,String email,String password,int id)
    {
        setName(name);
        setEmail(email);
        setPassword(password);
        setAdminId(id);
    
    }

    public void setName(String name)
    {
        if(name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException(" Name Cannot Be Empty ......... " );
        }
        if(name.trim().length() < 3)
        {
            throw new IllegalArgumentException(" Enter a Proper Name ......... ");
        }

        this.name = name.trim();
    }

   public String getName()
    {
        return name;
    }


 
      public void setEmail(String email)
      {
          
          if(email == null || email.trim().isEmpty())
            {
                throw new IllegalArgumentException(" Email Cannot be Empty ");
            }

        this.email = email.trim();

      }

      public String getEmail()
      {
        return email;
      }

      public void setPassword(String password)
      {
             if(password == null || password.trim().isEmpty())
            {
                throw new IllegalArgumentException(" password Cannot be Empty ");
            }

            this.password = password.trim();
      }


      public String getPassword()
      {
        return password;
      }

   
        public void setAdminId(int adminId)
        {
            this.adminId=adminId;
        }


        public int getAdminId()
        
        {
            return adminId;
        }

        @Override
public String toString() {
    return "Admin{" +
            "adminId=" + adminId +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
}


}