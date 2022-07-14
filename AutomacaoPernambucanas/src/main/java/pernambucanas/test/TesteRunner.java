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

    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    private void setup(String browser) {
        driver.set(new DriverHelper().setupDriver(browser));
    }

    @Test
    @Parameters({"browser", "url", "cpf"})
    public void fazerLoginComCPFInvalido(@Optional("firefox") String browser,
                           @Optional("https://www.pernambucanas.com.br/") String url,
                           @Optional("12345678912") String cpf){
        setup(browser);
        LoginPO login = new HomePO(driver, url)
                .selectLogin()
                .clickTypeCPF(cpf)
                .isInvalidCPF();
    }

    @Test
    @Parameters({"browser", "url", "cpf"})
    public void fazerLoginComCPFValido(@Optional("firefox") String browser,
                                         @Optional("https://www.pernambucanas.com.br/") String url,
                                         @Optional("43862927806") String cpf){
        setup(browser);
        LoginPO login = new HomePO(driver, url)
                .selectLogin()
                .clickTypeCPF(cpf)
                .isValidCPF();
    }

    @Test
    @Parameters({"browser", "url", "cpf", "password"})
    public void fazerLoginComCPFValidoESenhaInvalida(@Optional("firefox") String browser,
                                       @Optional("https://www.pernambucanas.com.br/") String url,
                                       @Optional("43862927806") String cpf,
                                       @Optional("AdcOP1997") String password){
        setup(browser);
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
        setup(browser);
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
        setup(browser);
        BuscaPO busca = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .existeProduto();
    }

    @Test
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoInexistente(@Optional("firefox") String browser,
                                              @Optional("https://www.pernambucanas.com.br/") String url,
                                              @Optional("xpto") String produto){
        setup(browser);
        BuscaPO busca = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .naoExisteProduto();
    }

    @Test
    @Parameters({"browser", "url", "produto"})
    public void fazerBuscaPorProdutoExistenteSelecionarAdicionar(@Optional("firefox") String browser,
                                                                  @Optional("https://www.pernambucanas.com.br/") String url,
                                                                  @Optional("Almofada de Formato Gato Oculos") String produto){
        setup(browser);
        ProdutoPO prod = new HomePO(driver, url)
                .realizarPesquisa(produto)
                .selecionarProduto()
                .adicionarProduto();
    }
}
