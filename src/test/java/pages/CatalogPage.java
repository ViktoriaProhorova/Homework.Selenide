package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {

    private String filterButtonName = "//a[@class='button' and text()='Name']";
    private String filterButtonPrice = "//a[@class='button' and text()='Price']";
    private String filterButtonPopularity = "//a[@class='button' and text()='Popularity']";
    private String filterButtonDate = "//a[@class='button' and text()='Date']";

    private String activeFilterButtonName = "//span[@class='button active' and text()='Name']";
    private String activeFilterButtonPrice = "//span[@class='button active' and text()='Price']";
    private String activeFilterButtonPopularity = "//span[@class='button active' and text()='Popularity']";
    private String  activeFilterButtonDate = "//span[@class='button active' and text()='Date']";



    public void clickFilterButtonName() {
        $x(filterButtonName).click();
    }

    public void clickFilterButtonPrice() {
        $x(filterButtonPrice).click();
    }

    public void clickFilterButtonPopularity() {
        $x(filterButtonPopularity).click();
    }

    public void clickFilterButtonDate() {
        $x(filterButtonDate).click();
    }

    public void checkFilterButtonNameIsActive() {
        $x(activeFilterButtonName).shouldBe(visible);
    }

    public void checkFilterButtonPriceIsActive() {
        $x(activeFilterButtonPrice).shouldBe(visible);
    }

    public void checkFilterButtonPopularityIsActive() {
        $x(activeFilterButtonPopularity).shouldBe(visible);
    }

    public void checkFilterButtonDateIsActive() {
        $x(activeFilterButtonDate).shouldBe(visible);
    }
}