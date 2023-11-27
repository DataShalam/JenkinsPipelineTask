import Data.InputsForGoogleSearch;
import Steps.GoogleMainPageSteps;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class WriteInGoogleSearch {
    private GoogleMainPageSteps googleMainPageSteps = new GoogleMainPageSteps();
    private InputsForGoogleSearch inputsForGoogleSearch = new InputsForGoogleSearch();

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserCapabilities = options;
        browserSize = null;

        timeout = 15000;

        reportsFolder = "src/main/resources";
    }

    @Test
    public void googleSearch() throws InterruptedException {
        open("https://www.google.com/");

        googleMainPageSteps
                .fillGoogleSearchBar(inputsForGoogleSearch.input)
                .pressEnterOnSearchBar();

        Thread.sleep(1000);
    }
}
