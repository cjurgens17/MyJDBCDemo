import com.persistence.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        User mike = new User("Mike", "Tyson", "BigMike@yahoo.com");


        //System.out.println(userDAO.create(mike));

        //Integer userId = userDAO.create(mike);

        UserDAO userDAO = new UserDAO();
        AccountTypeDAO accountTypeDAO = new AccountTypeDAO();
        AccountsDAO accountsDAO = new AccountsDAO();

        User bronson = new User("Bronson","Mcchecked","BigBronsonisComing@yahoo.com");
        Integer bronsonuserId = userDAO.create(bronson);

        AccountType accountType = new AccountType("checkings");
        Integer accTypeId = accountTypeDAO.create(accountType);

        Accounts bankAccount = new Accounts(100.00,accTypeId,bronsonuserId, Date.valueOf(LocalDate.now()));
        System.out.println(accountsDAO.create(bankAccount));





    }
}
