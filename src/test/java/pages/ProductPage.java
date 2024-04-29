package pages;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private String addToCartButton = "//button[@name='add_cart_product']";
    private String checkoutButton = "//a[text()='Checkout »']";

    public void clickAddToCartButton() {
        $x(addToCartButton).click();
    }

    public void clickCheckoutButton() {
        $x(checkoutButton).click();
    }

}
