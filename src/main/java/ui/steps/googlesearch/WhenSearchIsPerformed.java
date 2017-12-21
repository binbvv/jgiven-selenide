package ui.steps.googlesearch;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;
import ui.pages.google.GooglePage;
import ui.pages.google.SearchResultsPage;

public class WhenSearchIsPerformed extends Stage<WhenSearchIsPerformed> {
    @ScenarioState
    GooglePage page;

    @ScenarioState
    SearchResultsPage results;

    public WhenSearchIsPerformed userSearchesFor(String searchText) {
        results = page.searchFor(searchText);
        return self();
    }
}
