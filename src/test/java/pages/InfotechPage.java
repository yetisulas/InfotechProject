package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class InfotechPage {
    public InfotechPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Demo Talebi']")
    public WebElement DemoElementi;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement adSoyadElementi;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement sirketElementi;

    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement telefonNoElementi;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement ePostaElementi;
    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement mesajElementi;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement gonderButonu;

    @FindBy(xpath = "//div[text()='Mesajınız başarıyla iletildi.']")
    public WebElement iletildiMesaji;

    @FindBy(xpath = "(//li[@class='nav-item dropdown'])[1]")
    public WebElement infotechbaslikElementi;
    @FindBy(xpath = "(//li[@class='nav-item dropdown'])[1]")
    public WebElement aracTakipVeIotbaslikElementi;

    @FindBy(xpath = "(//li[@class='nav-item dropdown'])[1]")
    public WebElement haritaVeApibaslikElementi;
    @FindBy(xpath = "(//li[@class='nav-item dropdown'])[1]")
    public WebElement cografiBilgiSistemleribaslikElementi;

    @FindBy(xpath = "//a[text()='Locatıonbox']")
    public WebElement locationBoxBaslikElementi;

    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement blogBaslikElementi;

    @FindBy(xpath = "//a[text()='Iletişim']")
    public WebElement iletisimBaslikElementi;

    @FindBy(xpath = "//div[@id='navbarSupportedContent']")
    public WebElement baslikyazdir;

    @FindBy(xpath = "(//a)[27]")
    public  WebElement telNoElementi;

}
