package ui;

import com.tngtech.jgiven.testng.ScenarioTest;
import common.tags.Story;
import common.tags.TagsWithCustomStyle;
import org.testng.annotations.Test;
import ui.steps.googlesearch.GivenGooglePage;
import ui.steps.googlesearch.ThenResultsShouldBe;
import ui.steps.googlesearch.WhenSearchIsPerformed;

public class GoogleBddTest extends ScenarioTest<GivenGooglePage, WhenSearchIsPerformed, ThenResultsShouldBe> {

    @Test
    @Story("TC-1122-1")
    @TagsWithCustomStyle
    public void shouldFindSelenide() {
        given().userOpensGooglePage();
        when().userSearchesFor("selenide");
        then().userSeesNumberOfLinksIsLessOrEqualTo(10);
    }
}
