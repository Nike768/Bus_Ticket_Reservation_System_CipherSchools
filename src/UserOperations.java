import java.util.ArrayList;

public class UserOperations {



    static ArrayList<User>userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }
    public boolean verifyEmail(String email){
        for(User user:userList){
            if(email.equals(user.getContact().getEmailId())){
                return true;
            }

        }
        return false;
    }
    public boolean verifyPassword(String password){
        for(User user:userList){
            if(password.equals(user.getPassword())){
                return true;
            }

        }
        return false;
    }

    public void updateUserName(String email,String newName){

        for(User user : userList){
            if(email.equals(user.getContact().getEmailId())){
                user.setContact(new Contact(newName, user.getContact().getPhoneNumber(), user.getContact().getEmailId()));
            }
        }
    }

    public User findUser(String email) {
        for (User user : userList) {
            if (email.equals(user.getContact().getEmailId())){
                return user;

            }
        }
        return null;
    }

}
