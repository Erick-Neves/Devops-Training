package pernambucanas.grid;

import br.com.linkconsulting.t4gexwebdriver.test.T4gexWebDriverTest;
import helpers.DriverHelperGrid;
import helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pernambucanas.po.BuscaPO;
import pernambucanas.po.HomePO;
import pernambucanas.po.LoginPO;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Node1 extends T4gexWebDriverTest {

    WebDriver driver;
    String nodeUrl = "http://192.168.0.121:17979/wd/hub";
    private void setup() {
        try {
            nodeUrl = "http://192.168.0.121:4444/wd/hub";
            FirefoxOptions capabilities = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test(threadPoolSize = 1, invocationCount = 1)
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoExistente(@Optional("firefox") String browser,
                                              @Optional("https://www.pernambucanas.com.br/") String url,
                                              @Optional("Almofada de Formato Gato Oculos") String produto) {
        setup();
        BuscaPO busca = new HomePO(driver, url)
                .realizarPesquisa(produto);
        driver.quit();
    }
}
