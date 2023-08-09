package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage{

    @FindBy(id = "shopping_cart_container")
    public WebElement imgCarrinho;

    @FindBy(css = "span_title")
    WebElement lblTituloPagina;

    @FindBy(css = "button.btn.btn_primary btn_small.btn_inventory")
    WebElement btnAdicionarNoCarrinho;

    public WebDriver driver;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    // Função para retornar o titulo escrito na guia do browser
    public String lerTituloAba(){
        return driver.getTitle();
    }

    public void clicarNoCarrinho(){
        imgCarrinho.click(); // Clica na imagem do Carrinho
    }
    public String lerTituloDaPagina(){
        return lblTituloPagina.getText(); // retorna o que estiver escrito no elemento
    }

    // Esta função é apenas um exemplo, ela não será usada no exercício
    public String lerTextoDoBotaoAdicionarRemoverDoCarrinho(){
        return btnAdicionarNoCarrinho.getText();
    }

    public void clicarNoBotaoAdicionarOuRemoverNoCarrinho(){
        btnAdicionarNoCarrinho.click();
    }
}