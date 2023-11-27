package Steps;

import Pages.GoogleMainPage;
import io.qameta.allure.Step;

public class GoogleMainPageSteps {
    private GoogleMainPage googleMainPage = new GoogleMainPage();

    @Step
    public GoogleMainPageSteps fillGoogleSearchBar(String text){
        googleMainPage.searchBar.sendKeys(text);

        return this;
    }

    @Step
    public GoogleMainPageSteps pressEnterOnSearchBar() {
        googleMainPage.searchBar.pressEnter();

        return this;
    }
}
