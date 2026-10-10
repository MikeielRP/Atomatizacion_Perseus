package com.Perseus.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By Usuario = By.id("usuario");
    private final By Password = By.id("password");
    private final By btnIngresar = By.className("btn-submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void IngresarUsuario(String usuario){
        driver.findElement(Usuario).sendKeys(usuario);
    }
    public void IngresarPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }
    public void clickIngresar(){
        driver.findElement(btnIngresar).click();
    }
    public void IniciarSesion(String usuario, String password){
        IngresarUsuario(usuario);
        IngresarPassword(password);
        clickIngresar();

    }


}
