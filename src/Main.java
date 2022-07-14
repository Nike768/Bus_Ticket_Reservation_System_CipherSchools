import java.util.List;

public class Main {
    public static void main(String []args)
    {
          Login_SignUp loginSignUp = new Login_SignUp();
          System.out.println(loginSignUp.signUp("Nikhil",97865432, "nik@gamil.com" , "Barwala","Derabassi","Punjab","1234"));
          System.out.println(loginSignUp.signUp("Ayush",96385247,"ayu@gmail.com","Mall road","Lucknow","UttarPradesh","5632"));
          System.out.println(loginSignUp.signUp("Deepak",85263974,"deep@gmail.com","Gobind marg","Ludhiana","Punjab","2364"));
          System.out.println(loginSignUp.login("abcd@gmail.com","4521"));

          UserOperations userOperation = new UserOperations();

          userOperation.updateUserName("abcd@gmail.com","nikhil");


          BusOperation busOperation = new BusOperation();
          busOperation.createBus("88779966","jaipur","Goa","XYZ",500);
          busOperation.createBus("99779966","Delhi","Ludhiana","XYZ",500);
          busOperation.createBus("33779966","Jalandhar","Amritsar","XYZ",500);
          busOperation.createBus("44779966","Gurugram","Delhi","XYZ",500);
          busOperation.createBus("55779966","jaipur","Goa","XYZ",500);

          List<Bus> buses = busOperation.searchBus("jaipur","Goa");
          for(Bus bus : buses){
              System.out.println(bus);
          }
    }

}
