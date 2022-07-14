package helpers;

import br.com.linkconsulting.t4gexwebdriver.test.T4gexWebDriverTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author guilherme.cutovoi
 */
public class DriverHelper extends T4gexWebDriverTest {
    private final String CHROMEDRIVER_PATH = "src/main/resources/drivers/chromedriver.exe";
    private final String GECKODRIVER_PATH = "src/main/resources/drivers/geckodriver.exe";
    private final String CHROMEDRIVER_PATH_MAC = "src/main/resources/drivers/mac/chromedriver";
    private final String GECKODRIVER_PATH_MAC = "src/main/resources/drivers/mac/geckodriver";

    /** Inicializa o driver selenium para execuções web
     *
     * @param browser Navegador a ser utilizado pelo selenium
     * @return Retorna instancia do driver selenium
     */
    public WebDriver setupDriver(String browser) {
        setupDriverWebPaths();
        DesiredCapabilities des = new DesiredCapabilities();
        des.setBrowserName(browser);
        return getNewWebDriver(des);
    }

    public void setupDriverWebPaths() {
        if (System.getProperty("os.name").contains("Mac")) {
            // IEDriver via ClassLoader
            //System.setProperty("webdriver.ie.driver",IEDRIVER_PATH);
            // Geckodriver via String
            System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH_MAC);
            // Chromedriver via Path
            System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH_MAC);
        } else {
            // IEDriver via ClassLoader
            //System.setProperty("webdriver.ie.driver",IEDRIVER_PATH);
            // Geckodriver via String
            System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH);
            // Chromedriver via Path
            System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        }
    }
}
