import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;


public class TestCart extends TestBase {

    @Test
    public void removeFromCartTest() {
        HomePage homePage = page(HomePage.class);
        ProductPage productPage = page(ProductPage.class);
        CartPage cartPage = page(CartPage.class);

        homePage.clickRedDuckFromMostPopularSection();
        productPage.clickAddToCartButton();
        cartPage.waitingUntilProductIsAddedToCart();
        productPage.clickCheckoutButton();

        cartPage.clickRemoveFromCartButton();
        cartPage.waitingUntilBackButtonAppearsOnThePage();

        cartPage.getEmptyCartMessageElement().shouldHave(text("There are no items in your cart."));
    }

    @Test
    public void checkDuckPriceIsCorrect() {
        HomePage homePage = page(HomePage.class);
        ProductPage productPage = page(ProductPage.class);
        CartPage cartPage = page(CartPage.class);

        homePage.clickRedDuckFromMostPopularSection();

        productPage.clickAddToCartButton();
        cartPage.waitingUntilProductIsAddedToCart();
        productPage.clickCheckoutButton();

        cartPage.getProductPriceElement().shouldHave(text("$20.00"));
    }
}
