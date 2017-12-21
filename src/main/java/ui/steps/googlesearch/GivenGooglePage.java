package ui.steps.googlesearch;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;
import ui.pages.google.GooglePage;

import static com.codeborne.selenide.Selenide.open;

public class GivenGooglePage extends Stage<GivenGooglePage> {

    @ScenarioState
    GooglePage page;

    public GivenGooglePage userOpensGooglePage() {
        page = open("http://google.com/ncr", GooglePage.class);
        return self();
    }
}
