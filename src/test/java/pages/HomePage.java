package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    // O Mapeamento cria ou reflete uma DSL
    // Domain Structured Lenguage
    // Linguagem Estruturada de Dominio
    // " Como falamos aqui na empresa"


    // Elementos Web / Web Elements --> Os que serão Mapeados
    @FindBy(id = "user_name") // mapeia o elemento pelo seletor
    WebElement txtUsuario;

    @FindBy(id = "password")
    WebElement txtSenha;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    // Construtor / Constructor

    public HomePage(WebDriver driver) {
      super(driver);         // instancia a classe mãe como SuperClasse
      PageFactory.initElements(driver, this); // Conecta o objeto interno e o externo do Selenium
    }

    // Funções e Metodos
    public void logar(String user, String password){
        txtUsuario.sendKeys(user);
        txtSenha.sendKeys(password);
        btnLogin.click();

    }
}
