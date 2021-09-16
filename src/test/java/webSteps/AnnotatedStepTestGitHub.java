package webSteps;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTestGitHub {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога";

    @Test
    public void testGithubWithSteps() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssues();
        steps.checkIssueWithName(ISSUE_NAME);
    }

}
