package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    private String removeFromCartButton = "//button[@name='remove_cart_item']";
    private String backButton = "//a[text()='<< Back']";
    private String emptyCartMessage = "//em";
    private String duckPriceFromCart = "td.unit-cost";
    private String quantityInCart = "//input[@name='quantity']";


    public void clickRemoveFromCartButton() {
        $x(removeFromCartButton).click();
    }

    public void findBackButton() {
        $x(backButton).shouldBe(visible);
    }

    public String getEmptyCartMessage() {
        return $x(emptyCartMessage).text();
    }

    public String getProductPrice() {
        return $(duckPriceFromCart).text();
    }

    public void waitingUntilProductIsAddedToCart() {
        $("span.quantity").shouldHave(text("1"));
    }

    public void waitingUntilBackButtonAppearsOnThePage() {
        $x(backButton).shouldBe(visible);
    }

    public SelenideElement getEmptyCartMessageElement() {
        return $x(emptyCartMessage);
    }

    public SelenideElement getProductPriceElement() {
        return $("td.unit-cost");
    }

    public String getProductsQuantityFromCart() {
        return $x(quantityInCart).getValue();
    }

}
