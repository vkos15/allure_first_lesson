package webSteps;

import config.TestBase;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTestGitHub extends TestBase {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога";
    private final WebSteps steps = new WebSteps();

    @Test
    public void testGithubWithSteps() {
        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssues();
        steps.checkIssueWithName(ISSUE_NAME);
    }
}
