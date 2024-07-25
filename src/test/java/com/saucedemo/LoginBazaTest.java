package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginBazaTest extends PaginaDeBaza
{
    public void apasaButonLogin()
    {
        // gaseste buton login
        WebElement butonLogin= driver.findElement(By.id("login-button"));
        // apasa buton
        butonLogin.click();
    }
    public void introduParolaSecretSauce()
    {
        //locatie camp parola
        WebElement campParola=driver.findElement(By.id("password"));
        //
        campParola.sendKeys("secret_sauce");
    }
    public void introduUsernameStandardUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("standard-user");
    }
    public void introduUsernameLockedOutUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("locked_out_user");
    }
    public void introduUsernameProblemUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("problem_user");
    }
    public void introduUsernamePerformanceGlitchUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("performance_glitch_user");
    }
    public void introduUsernameErrorUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("error_user");
    }
    public void introduUsernameVisualUser()
    {
        //cautare camp username
        WebElement campUsername=driver.findElement(By.id("user-name"));
        campUsername.sendKeys("visual_user");
    }
    public void introduParolaParolaGresita()
    {
        //locatie camp parola
        WebElement campParola=driver.findElement(By.id("password"));
        //
        campParola.sendKeys("parola_gresita");
    }
    public void  verificareMesajParolaIncorecta()
    {
        WebElement mesajDeEroareParolaLipsa= driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
        String mesajDeEroareAsteptat="Epic sadface: Password is required";
        String mesajDeEroareAfisat=mesajDeEroareParolaLipsa.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void verificareMesajDeEroareUserLipsa()
    {
        WebElement mesajDeEroare= driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
        String mesajDeEroareAsteptat="Epic sadface: Username is required";
        String mesajDeEroareAfisat=mesajDeEroare.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void verificareMesajDeEroareUserSiParolaLipsa()
    {
        WebElement mesajDeEroare= driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
        String mesajDeEroareAsteptat="Epic sadface: Username and password required";
        String mesajDeEroareAfisat=mesajDeEroare.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void verificareLogareButonMeniu()
    {
        WebElement butonMeniu=driver.findElement(By.xpath("/html//button[@id='react-burger-menu-btn']"));
        assert butonMeniu.isDisplayed();
    }
    public void verificareMesajDeEroareUserBlocat()
    {
    WebElement mesajDeEroare= driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
    String mesajDeEroareAsteptat="Epic sadface: Sorry, this user has been locked out.";
    String mesajDeEroareAfisat=mesajDeEroare.getText();
    Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void apasareButonMeniu()
    {
        WebElement butonMeniu=driver.findElement(By.xpath("/html//button[@id='react-burger-menu-btn']"));
        butonMeniu.click();
    }

}
