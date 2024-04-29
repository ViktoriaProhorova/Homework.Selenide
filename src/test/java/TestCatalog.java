import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import pages.CatalogPage;
import pages.HomePage;


public class TestCatalog extends TestBase {

    @Test
    public void checkFilterButtonsBecomeActiveAfterClicking() {
        HomePage homePage = page(HomePage.class);
        CatalogPage catalogPage = page(CatalogPage.class);

        homePage.clickLinkToCatalogFromHeader();

        catalogPage.clickFilterButtonName();
        catalogPage.checkFilterButtonNameIsActive();

        catalogPage.clickFilterButtonPrice();
        catalogPage.checkFilterButtonPriceIsActive();


        catalogPage.clickFilterButtonPopularity();
        catalogPage.checkFilterButtonPopularityIsActive();;

        catalogPage.clickFilterButtonDate();
        catalogPage.checkFilterButtonDateIsActive();
    }
}


