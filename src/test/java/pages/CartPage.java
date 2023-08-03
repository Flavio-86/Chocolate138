package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    // Elementos
    @FindBy(css = "div.inventory_item_name")
    WebElement lblTituloProduto;

    @FindBy(css = "div.inventory_item_price")
    WebElement lblPrecoProduto;

    @FindBy(css = "div.cart_quantity")
    WebElement lblQuatidade;

    // Construtor
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Funções e Metodos
    public String leTituloProdutoNoCarrinho(){
        return lblTituloProduto.getText();
    }

    public String lerPrecoProdutoNoCarrinho(){
        return lblPrecoProduto.getText();
    }

    public String lerQuantidadeDoProdutoNoCarrinho(){
        return lblQuatidade.getText();
    }

}
