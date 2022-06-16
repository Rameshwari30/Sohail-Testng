package utils;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PersonalDetailsPage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static PersonalDetailsPage personalDetailsPage;

    public static void initializeObjects(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        personalDetailsPage = new PersonalDetailsPage();
    }
}
