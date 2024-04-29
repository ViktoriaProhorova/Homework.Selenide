package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private String errorMessageLocator = ".notice.errors";
    private String successMessageLocator = ".notice.success";

    private String mostPopularSection = "//*[@id='box-most-popular']/h3";
    private String campaignsSection = "//*[@id='box-campaigns']/h3";
    private String latestProductsSection = "//*[@id='box-campaigns']/h3";

    private String redDuckFromMostPopularSection = "//h3[text()='Most Popular']/following-sibling::div[@class='content']//a[@title='Red Duck' and div[@class='name']='Red Duck']";

    private String linkToCatalogFromHeader = "//*[@id='site-menu']/ul/li[2]/a";

    public void clickLinkToCatalogFromHeader() {
        $x(linkToCatalogFromHeader).click();
    }

    public SelenideElement getErrorMessage() {
        return $(errorMessageLocator);
    }

    public String getErrorMessageBgColor() {
        return $(errorMessageLocator).getCssValue("background-color");
    }

    public boolean errorMessageIsVisible() {
        return $(errorMessageLocator).isDisplayed();
    }

    public SelenideElement getSuccessMessage() {
        return $(successMessageLocator);
    }

    public void clickRedDuckFromMostPopularSection() {
        $x(redDuckFromMostPopularSection).click();
    }
}
