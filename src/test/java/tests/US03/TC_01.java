package tests.US03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.InfotechPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_01 extends TestBaseRapor {
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC_01() throws IOException {
        InfotechPage infotechPage = new InfotechPage();
        extentTest = extentReports.createTest("Iletisim sayfasi gorunurluk testi", "Kullanici iletisim sayfasina gidebilmeli iletisim noyu gorebilmelidir");

        //1- "https://www.infotech.com.tr/index.php"  anasayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("InfotechUrl"));
        extentTest.info("Kullanici infotech anasayfasina gider");

        //iletisim basligina tiklar
        infotechPage.iletisimBaslikElementi.click();
        extentTest.info("Iletisim basligina tiklat");

        //Acilan sayfadaki iletisim numarasi goruntusu alir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String mesaj=infotechPage.telefonNoElementi.getText();
        ReusableMethods.getScreenshot(mesaj);
        extentTest.info("Telefon numarasi  goruntusunu alir");


    }

}
