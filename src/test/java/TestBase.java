import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

enum Browser {
    CHROME("chrome"),
    SAFARI("safari"),
    FIREFOX("firefox"),
    EDGE("edge");

    private final String browserName;

    Browser(String browserName) {
        this.browserName = browserName;
    }

    public void setUp() {
        Configuration.browser = this.browserName;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 15000;
    }
}

public class TestBase {

    @BeforeMethod
    protected void setup() {
        String browserProperty = System.getProperty("browser", "CHROME");
        Browser browser = Browser.valueOf(browserProperty.toUpperCase());
        browser.setUp();
        Selenide.open("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    protected void tearDown() {
        Selenide.closeWebDriver();
    }
}
