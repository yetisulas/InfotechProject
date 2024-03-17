package tests.US01;

import org.testng.annotations.Test;
import pages.InfotechPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_01 extends TestBaseRapor {
    @Test
    public void TC_01() throws IOException {

        InfotechPage infotechPage=new InfotechPage();
        extentTest= extentReports.createTest("Demo istek testi","Kullanici gecerli bilgileri girerek demo istegini yapabilmelidir");


        //1- "https://www.infotech.com.tr/index.php"  anasayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("InfotechUrl"));
        extentTest.info("Kullanici Infotech anasayfasina gider");

        //Demo linkine tikla
        infotechPage.DemoElementi.click();
        extentTest.info("Demo linkine tiklar");

        //ad-soyad a tiklar
        infotechPage.adSoyadElementi.click();
        extentTest.info("ad-soyad a tiklar");

        //ad-soyad kutusuna Infotech gonderir
        infotechPage.adSoyadElementi.sendKeys("Infotech");
        extentTest.info("ad-soyad kismina Infotech gonderir");

        //Sirket kutusuna tiklar
        infotechPage.sirketElementi.click();
        extentTest.info("Sirket kutusuna tiklar");

        //Sirket ismine yetis gonderir
        infotechPage.sirketElementi.sendKeys("ulas");
        extentTest.info("Sirket ismi gonderir");

        ReusableMethods.wait(1);

        //Telefon kutusuna tiklar
        infotechPage.telefonNoElementi.click();
        extentTest.info("Telefon kutusuna tiklar");

        //Telefon numarasi olarak 05555555555 gonderir
        infotechPage.telefonNoElementi.sendKeys("04444444444");
        extentTest.info("Telefon numarasi gonderir");

        //eMail kutusuna tiklar
        infotechPage.ePostaElementi.click();
        extentTest.info("eMail kutusuna tiklar");

        //eMail adresi gonderir
        infotechPage.ePostaElementi.sendKeys("helebidur@gmail.com");
        extentTest.info("eMail gonderir");
        //Mesaj kutusuna tiklar
        infotechPage.mesajElementi.click();
        extentTest.info("Mesaj kutusuna tiklar");

        //Mesaj kutusuna mesaj gonderir
        infotechPage.mesajElementi.sendKeys("BU ISI KESINLIKLE ISTIYORUM");
        extentTest.info("Mesaj yazdirir");

        //Gonder butonuna tiklar
        infotechPage.gonderButonu.click();
        extentTest.info("Gondere tiklar");


        //Tekrar demo basligina basar
        infotechPage.DemoElementi.click();
        ReusableMethods.wait(1);

        //Mesajınız başarıyla iletildi. ekran goruntusunu alir
        String mesaj=infotechPage.iletildiMesaji.getText();
        ReusableMethods.getScreenshot(mesaj);
        extentTest.info("Mesajin ekran goruntusunu alir");



    }

}
