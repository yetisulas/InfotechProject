package tests.US02;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.InfotechPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class TC_O1 extends TestBaseRapor {
    @Test
    public void TC_01() {

        InfotechPage infotechPage = new InfotechPage();
        extentTest = extentReports.createTest("Basliklarin gorunurluk testi", "Kullanici anasayfadaki basliklarin gorunur oldugunu test eder");
        //1- "https://www.infotech.com.tr/index.php"  anasayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("InfotechUrl"));
        extentTest.info("Kullanici smartcard anasayfasina gider");

        //2-Anasayfada bulunan basliklarin gorundugunu dogrular
        infotechPage.infotechbaslikElementi.isDisplayed();
        extentTest.info("Infotech basligina basar");

        infotechPage.aracTakipVeIotbaslikElementi.isDisplayed();
        extentTest.info("Arac Takip Ve Iot Basligina basar");

        infotechPage.cografiBilgiSistemleribaslikElementi.isDisplayed();
        extentTest.info("Cografi Bilgi Sistemleri Basligina basar");

        infotechPage.haritaVeApibaslikElementi.isDisplayed();
        extentTest.info("Harita Ve Api Basligina tiklar");

        infotechPage.locationBoxBaslikElementi.isDisplayed();
        extentTest.info("locationBox Basligina tiklar");

        infotechPage.blogBaslikElementi.isDisplayed();
        extentTest.info("Blog Basligina tiklar");

        infotechPage.iletisimBaslikElementi.isDisplayed();
        extentTest.pass("Iletisim Basligina tiklar");
        ReusableMethods.wait(1);

        //Basliklarin yazdirabildigini test eder
        String basliklar=infotechPage.baslikyazdir.getText();
        System.out.println(basliklar);
        extentTest.pass("Basliklari yazirabildigini test eder");
    }
}