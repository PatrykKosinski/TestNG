package test;

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before executing any methods in the class");
    }

    @AfterClass
    public void afterClas(){
        System.out.println("After executing any methods in the class");
    }


    @Parameters({"URL", "AeyPIkey/username"})
    @Test
    public void WebLoginCarLoan(String urlname, String key){
        System.out.println("weblogin");
        System.out.println(urlname);
        System.out.println(key);

        //selenium
    }


    @Test(enabled = false)
    public void MobilesignCarLoan(){
        //appium
        System.out.println("mobilelogin");
    }

    @Test(dataProvider = "getData")
    public void MobilesignoutLoan(String username, String password){
        //appium
        System.out.println("mobilelog out timeout");
        System.out.println(username);
        System.out.println(password);
    }



    @Test
    public void MobileLogInCarLoan(){
        //appium
        System.out.println("Log In");
    }

    @Test
    public void MobileLogOutCarLoan(){
        //appium
        System.out.println("Log OUT");
    }


    @BeforeMethod(enabled = false)
    public void beforeEveryMethod(){
        System.out.println("Before every Method in my class");
    }

    @AfterMethod(enabled = false)
    public void afterEveryMethod(){
        System.out.println("After every Method in my class");
    }
    @BeforeSuite
    public void Bfsuite(){
        System.out.println("the very first impl");
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan","MobileLogOutCarLoan"})
    public void APICarLoan(){
        //Rest Api automation
        System.out.println("APILoginCar");
    }

    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[3][2];


        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";


        return data;

    }

}
