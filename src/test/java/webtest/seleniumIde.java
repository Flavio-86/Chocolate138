package webtest;

// Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class seleniumIde {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // instala o driver mais atual do browser Crhome
        ChromeOptions options = new ChromeOptions(); // instancia o objeto de configuração
        options.addArguments("--remote-allow-origins=*");  // permite origens remotas

        driver = new ChromeDriver(options); // instancia o selenium como CrhomeDriver com a configuração desejada
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        // 1 minuto
        // 60 segundos
        // 60000 milisegundos


        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(802, 824));
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        // carregamento da página interna --> demora um pouco
        Thread.sleep(50000); // é um alfinete temporario
        // este passo não é necesário pois o carrinho já inicia vazio
        //driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
        assertThat(driver.findElement(By.cssSelector("#item_4_title_link > .inventory_item_name")).getText(), is("Sauce Labs Backpack"));
        assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_price")).getText(), is("$29.99"));
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.linkText("1")).click();
        driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
        assertThat(driver.findElement(By.cssSelector(".title")).getText(), is("Checkout: Your Information"));
    }
}