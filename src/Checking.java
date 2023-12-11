import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class Checking {

   private static boolean checkData(String data){
       if (data == null
           || data.length() > 20
           || data.isBlank()){
           return false;
       }
           return data.matches("[0-9A-Za-z_]*");
       }

    public  static void chekingRegistrationInformation (String login, String password, String confirmPassword) throws
            WrongPasswordException, WrongLoginException {
        if (checkData(login)) {
            System.out.println("Корректный логин");
        } else {
          throw new WrongLoginException("Некорректный логин");
       }
        if (checkData(password) &&  password.equals(confirmPassword)){
            System.out.println("Корректный пароль");
        } else {
           throw new WrongPasswordException("Некорректный пароль");
       }

    }
}
