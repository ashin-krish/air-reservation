package util;

public class ValidationUtil 
{


   private static final String EMAIL_REGEX ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

   public static void checkEmail( String email)
    {

            if (email == null || email.trim().isEmpty()) {
        throw new IllegalArgumentException("Email cannot be empty");
    }
            if(!email.matches(EMAIL_REGEX))
        {
            throw new IllegalArgumentException(" Enter a Valid Email ");
        }
    }

    
    static String special = "@#!$%^&*";
    
    
   public static void checkPassword(String password)
    {


        if (password == null || password.trim().isEmpty()) {
    throw new IllegalArgumentException("Email cannot be empty");
}
        boolean hasDigit = false;
       boolean hasLetter = false;
        boolean hasSpecial = false;
        
            for(char c : password.toCharArray())
            {
                if(Character.isDigit(c))
                {
                    hasDigit = true;
                }
                if(Character.isLetter(c))
                {
                    hasLetter = true;
                }
                if(special.contains(String.valueOf(c)) )
                {
                    hasSpecial = true;
                }
            }

            if(!hasDigit || !hasLetter || ! hasSpecial)
            {
                throw new IllegalArgumentException(" Password must contains letter,number and a Special Character ");
            }
    }
}


