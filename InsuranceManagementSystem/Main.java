package InsuranceManagementSystem;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date lastLogin = new Date();
        ArrayList<Address> addresses = new ArrayList<Address>();
        addresses.add(new AdressManager.HomeAddress("madrassa"));
        addresses.add(new AdressManager.BusinessAddress("ADFS"));
        Date startDate = new Date();
        Date endDate = new Date();
        Account.HealthInsurance healthInsurance = new Account.HealthInsurance("Health Insurance", 1000, startDate, endDate);
        Account.ResidenceInsurance residenceInsurance = new Account.ResidenceInsurance("Residence Insurance", 1000, startDate, endDate);
        Account.TravelInsurance travelInsurance = new Account.TravelInsurance("Travel Insurance", 1000, startDate, endDate);
        Account.CarInsurance carInsurance = new Account.CarInsurance("Car Insurance", 1000, startDate, endDate);

        Account.User newUser = new Account.User("John", "Doe", "a", "b", "Developer", 30, addresses, lastLogin);
        System.out.println();
        newUser.showUserInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        AccountManager manager = new AccountManager();
        try {
            Account account = manager.login(email, password);
            if (account != null) {
                System.out.println("Welcome, " + account.getUser().getName());
            }
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
}
