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

import static br.com.linkconsulting.t4gexcore.test.T4gexTest.assertion;

public class LoginPO {

    @FindBy(css = "[name=username]")
    private static WebElement campoCPF;

    @FindBy(css = "[name=password]")
    private static WebElement campoPassword;

    @FindBy(css = "div.Toastify__toast-container.Toastify__toast-container--top-right")
    public static WebElement loginFalhou;

    @FindBy(css = "div span.styles__ErrorMessage-sc-1skgo2r-3")
    public static WebElement mensagemErroCPFInvalido;

    @FindBy(css = "div section div p.styles__HeaderAccountActionText-sc-1qotcn3-12")
    private static WebElement labelLoginLogged;

    @FindBy(css = "input.styles__HeaderSearchInput-sc-1qotcn3-18.kNcXzy")
    private static WebElement campoBusca;

    private ThreadLocal<WebDriver> driver;
    private WebDriverWait wait;

    public LoginPO(ThreadLocal<WebDriver> driver){
        this.driver = driver;
        driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver.get(), this);
        wait = new WebDriverWait(driver.get(), 30);
    }

    public LoginPO clickTypeCPF(String cpf){
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(campoCPF)).click();
        campoCPF.sendKeys(cpf, Keys.ENTER);
        return new LoginPO(driver);
    }

    public LoginPO clickTypePassword(String password){
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(campoPassword)).click();
        campoPassword.sendKeys(password, Keys.ENTER);
        return new LoginPO(driver);
    }

    public LoginPO isInvalidCPF(){
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(mensagemErroCPFInvalido)).isDisplayed();
        webAssert.assertEquals(mensagemErroCPFInvalido.isDisplayed(), true);
        return new LoginPO(driver);
    }

    public LoginPO isValidCPF(){
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(campoPassword)).click();
        webAssert.assertEquals(campoPassword.isDisplayed(), true);
        return new LoginPO(driver);
    }

    public LoginPO isInvalidPassword(){
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        wait = new WebDriverWait(driver.get(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(loginFalhou)).isDisplayed();
        webAssert.assertEquals(loginFalhou.isDisplayed(), true);
        return new LoginPO(driver);
    }

    public LoginPO isValidPassword(){
        T4gexAssert webAssert = new WebDriverAssertion(driver);
        webAssert.assertEquals(campoBusca.isDisplayed(), true);
        return new LoginPO(driver);
    }

}
