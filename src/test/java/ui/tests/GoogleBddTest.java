package ui.tests;

import com.tngtech.jgiven.testng.ScenarioTest;
import org.testng.annotations.Test;
import ui.steps.GivenGooglePage;
import ui.steps.ThenResultsShouldBe;
import ui.steps.WhenSearchIsPerformed;
import ui.tags.Story;
import ui.tags.TagsWithCustomStyle;

public class GoogleBddTest extends ScenarioTest<GivenGooglePage, WhenSearchIsPerformed, ThenResultsShouldBe> {

    @Test
    @Story("TC-1122-1")
    public void shouldFindSelenide() {
        given().userOpensGooglePage();
        when().userSearchesFor("selenide");
        then().userSeesNumberOfLinksIsLessOrEqualTo(10);
    }

    @Test
    @TagsWithCustomStyle
    public void shouldFindSelenium() {
        given().userOpensGooglePage();
        when().userSearchesFor("selenium web driver");
        then().userSeesNumberOfLinksIsLessOrEqualTo(100);
    }
}
