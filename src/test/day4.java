package test;

import org.testng.annotations.Test;

public class day4 {


    @Test
    public void WebLoginHomeLoan(){
        System.out.println("webloginHome");

        //selenium
    }


    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan(){
        //appium
        System.out.println("mobileloginHome");
    }

    @Test
    public void LoginAPIHomeLoan(){
        //Rest Api automation
        System.out.println("APILoginHome");
    }

}
