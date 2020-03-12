import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        DbWorkerReg dbWorkerReg = new DbWorkerReg();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login:  *");
        String login = scanner.nextLine();
        System.out.println("Password:  *");
        int pass = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your E-Mail:  *");
        String email = scanner.nextLine();
        dbWorkerReg.register(login, email, pass);

        int i = 0;
        while(i == 0) {
            System.out.println("Авторизоваться");
            System.out.println("Login:");
            String loginForCheck = scanner.nextLine();
            System.out.println("Password");
            int passForCheck = scanner.nextInt();
            dbWorkerReg.authorization(loginForCheck, passForCheck);
            System.out.println("Чтобы повторить попытку введите 0, чтобы закончить введите 1");
            int j = scanner.nextInt();
            scanner.nextLine();
            if (j > 0){
                break;
            }
        }
    }
}
