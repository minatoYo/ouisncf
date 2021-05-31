import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OuiSncf {

    WebDriver driver;
//3A(arrange ,asct ,assert )

    @BeforeMethod
    public void ouvrirChrome()
    {
        driver= new ChromeDriver();

        driver.get("https://www.oui.sncf/");

        driver.manage().window().maximize();

        WebElement acc;

        acc= driver.findElement(By.id("didomi-notice-agree-button"));
        acc.click();

    }

    @AfterMethod
    public void fermerchrome()
    {
        driver.quit();
    }


    @Test
    public void test()
    {
        //arrange

        //acts

         //assert

    }
}

/*
paris marseill pour 2 voyageurs
15/07/2021 a 14h  22/07/20121 a  10h lancer la recherche

 prendre le deuxieme resultats

 fonction genereique -
 */