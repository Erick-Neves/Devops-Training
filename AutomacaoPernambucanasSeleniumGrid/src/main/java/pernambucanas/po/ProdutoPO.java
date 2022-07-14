package pernambucanas.po;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProdutoPO {
    @FindBy(css = "button.boRNit")
    public WebElement btnAdicionarCarrinho;
    @FindBy(css = "button.lmAYOL")
    public WebElement btnComprar;

    @FindBy(css = "tr.product-item")
    public WebElement carrinhoCompras;
    @FindBy(css = "input.hPJaIy")
    private static WebElement campoCPF;

    @FindBy(css = "[name=password]")
    private static WebElement campoPassword;

    public WebElement escolherGarantia;
    private WebDriver driver;
    private WebDriverWait wait;

    public ProdutoPO(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    public ProdutoPO adicionarProduto(){
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(btnComprar));
        return  new ProdutoPO(driver);
    }

    /*public ProdutoPO verificarProduto(){
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.visibilityOf(carrinhoCompras));
        return  new ProdutoPO(driver);
    }*/
}
