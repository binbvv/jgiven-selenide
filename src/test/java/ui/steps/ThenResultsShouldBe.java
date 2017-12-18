package ui.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;
import ui.pages.SearchResultsPage;

import static com.codeborne.selenide.CollectionCondition.sizeLessThanOrEqual;

public class ThenResultsShouldBe extends Stage<ThenResultsShouldBe> {
    @ScenarioState
    SearchResultsPage results;

    public ThenResultsShouldBe userSeesNumberOfLinksIsLessOrEqualTo(int linksCount) {
        results.getResults().shouldHave(sizeLessThanOrEqual(linksCount));
        return self();
    }
}
