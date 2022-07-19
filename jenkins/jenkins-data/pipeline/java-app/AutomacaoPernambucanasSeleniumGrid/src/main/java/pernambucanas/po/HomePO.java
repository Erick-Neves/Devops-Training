package pernambucanas.po;

import br.com.linkconsulting.t4gexcore.assertion.T4gexAssert;
import br.com.linkconsulting.t4gexwebdriver.assertion.WebDriverAssertion;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePO {


    @FindBy(css = "div.styles__HeaderAccountContent-sc-1qotcn3-9 p.ecvQXW")
    private static WebElement labelLogin;

    @FindBy(css = "input.styles__HeaderSearchInput-sc-1qotcn3-18.kNcXzy")
    private static WebElement campoBusca;

    @FindBy(css = "div a.product-link")
    private WebElement nomeProduto;

    @FindBy(css = "article h1.styles__H1-sc-13br01k-0.jrfHSJ")
    private WebElement precoProduto;

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePO(WebDriver driver, String url){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    public LoginPO selectLogin(){
        labelLogin.click();
        return new LoginPO(driver);
    }

    public BuscaPO realizarPesquisa(String produto){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(campoBusca)).click();
        campoBusca.sendKeys(produto, Keys.ENTER);
        return new BuscaPO(driver);
    }

    public ProdutoPO selecionarProduto() {
        nomeProduto.click();
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(precoProduto)).isDisplayed();
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        webAssert.assertEquals(precoProduto.isDisplayed(), true);
        return new ProdutoPO(driver);
    }

}
