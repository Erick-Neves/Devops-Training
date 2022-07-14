package pernambucanas.po;

import br.com.linkconsulting.t4gexcore.assertion.T4gexAssert;
import br.com.linkconsulting.t4gexwebdriver.assertion.WebDriverAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static br.com.linkconsulting.t4gexcore.test.T4gexTest.assertion;

public class BuscaPO {
    @FindBy(css = "div a.product-link")
    private WebElement nomeProduto;

    @FindBy(css = "article h1.styles__H1-sc-13br01k-0.jrfHSJ")
    private WebElement precoProduto;

    @FindBy(css = "div h1 span")
    private WebElement nenhumProduto;

    private ThreadLocal<WebDriver> driver;
    private WebDriverWait wait;

    public BuscaPO(ThreadLocal<WebDriver> driver){
        this.driver = driver;
        driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver.get(), this);
        wait = new WebDriverWait(driver.get(), 30);
    }

    public BuscaPO existeProduto(){
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(nomeProduto)).isDisplayed();
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        webAssert.assertEquals(nomeProduto.isDisplayed(), true);
        return new BuscaPO(driver);
    }

    public BuscaPO naoExisteProduto(){
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(nenhumProduto)).isDisplayed();
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        webAssert.assertEquals(nenhumProduto.isDisplayed(), true);
        return new BuscaPO(driver);
    }

    public ProdutoPO selecionarProduto() {
        nomeProduto.click();
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(precoProduto)).isDisplayed();
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        webAssert.assertEquals(precoProduto.isDisplayed(), true);
        return new ProdutoPO(driver);
    }
}
