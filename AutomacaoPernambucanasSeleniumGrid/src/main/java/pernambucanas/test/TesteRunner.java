package pernambucanas.test;

import br.com.linkconsulting.t4gexwebdriver.test.T4gexWebDriverTest;
import helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pernambucanas.po.BuscaPO;
import pernambucanas.po.HomePO;
import pernambucanas.po.LoginPO;
import pernambucanas.po.ProdutoPO;

public class TesteRunner extends T4gexWebDriverTest {

    /*private WebDriver driver;

    private String nodeUrl = "http://192.168.0.121:4444/wd/hub";

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

    @Test
    @Parameters({"browser", "url", "cpf"})
    public void fazerLoginComCPFInvalido(@Optional("chrome") String browser,
                           @Optional("https://www.pernambucanas.com.br/") String url,
                           @Optional("12345678912") String cpf){
        setup();
        LoginPO login = new HomePO(driver, url).selectLogin().clickTypeCPF(cpf).isInvalidCPF();
    }

    @Test
    @Parameters({"browser", "url", "cpf"})
    public void fazerLoginComCPFValido(@Optional("chrome") String browser,
                                         @Optional("https://www.pernambucanas.com.br/") String url,
                                         @Optional("43862927806") String cpf){
        setup();
        LoginPO login = new HomePO(driver, url).selectLogin().clickTypeCPF(cpf).isValidCPF();
    }

    @Test
    @Parameters({"browser", "url", "cpf", "password"})
    public void fazerLoginComCPFValidoESenhaInvalida(@Optional("firefox") String browser,
                                       @Optional("https://www.pernambucanas.com.br/") String url,
                                       @Optional("43862927806") String cpf,
                                       @Optional("AdcOP1997") String password){
        setup();
        LoginPO login = new HomePO(driver, url)
                .selectLogin()
                .clickTypeCPF(cpf)
                .isValidCPF()
                .clickTypePassword(password)
                .isInvalidPassword();
    }

    @Test
    @Parameters({"browser", "url", "cpf", "password"})
    public void fazerLoginComCPFValidoESenhaValida(@Optional("firefox") String browser,
                                                     @Optional("https://www.pernambucanas.com.br/") String url,
                                                     @Optional("43862927806") String cpf,
                                                     @Optional("AdcOP1997!") String password){
        setup();
        LoginPO login = new HomePO(driver, url)
                .selectLogin()
                .clickTypeCPF(cpf)
                .isValidCPF()
                .clickTypePassword(password)
                .isValidPassword();
    }

    @Test
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoExistente(@Optional("firefox") String browser,
                                                   @Optional("https://www.pernambucanas.com.br/") String url,
                                                   @Optional("Almofada de Formato Gato Oculos") String produto){
        setup();
        BuscaPO busca = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .existeProduto();
    }

    @Test
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoInexistente(@Optional("firefox") String browser,
                                              @Optional("https://www.pernambucanas.com.br/") String url,
                                              @Optional("xpto") String produto){
        setup();
        BuscaPO busca = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .naoExisteProduto();
    }

    @Test
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoExistenteSelecionarAdicionar(@Optional("firefox") String browser,
                                                                  @Optional("https://www.pernambucanas.com.br/") String url,
                                                                  @Optional("Almofada de Formato Gato Oculos") String produto){
        setup();
        ProdutoPO prod = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .selecionarProduto()
                .adicionarProduto();
    }*/
}
