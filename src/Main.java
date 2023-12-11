import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class Main {


    public static void main(String[] args) {

        try {
            Checking.chekingRegistrationInformation( "Jkz", "123*", "123*");
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль");
        } finally {
            System.out.println("Проверка аутентификации завершена");
        }
    }
}