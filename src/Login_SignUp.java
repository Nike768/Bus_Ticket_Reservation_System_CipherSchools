public class Login_SignUp {
             UserOperations userOperation = new UserOperations();
             public String signUp(String name, long phone, String email, String street, String city, String state,String password)
             {
                 if(userOperation.verifyEmail(email)){
                     return "Email already available";
                 }

                 Contact contact = new Contact(name,phone,email);
                 Address address = new Address(street,city,state);
                 User user = new User(contact,address,password);
                 userOperation.addUser(user);
                 return "signup successfull";
             }

             public String login(String email, String password)
             {
                if(!userOperation.verifyEmail(email)){
                       return "Email invalid";
                }
                if(!userOperation.verifyPassword(password)){
                    return "Incorrect password";
                }
                return "Successfully logged in";
             }
}
