package lambdaStep;

import config.TestBase;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LambdaStepTestGithub extends TestBase
{
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога";

    @Test
    public void nameOfIssueTest()
    {
        step("Открываем главную страницу", () -> {
            open("https://github.com/");
        });
        step("Ищем реппозиторий " + REPOSITORY, () -> {
            $("[data-test-selector='nav-search-input']").setValue(REPOSITORY).pressEnter();
        });
        step("Переходим в реппозиторий " + REPOSITORY, () -> {
            $("[href*='" + REPOSITORY + "']").click();
        });
        step("Открываем разедел Issues", () -> {
            $("#issues-tab").click();
        });

        step("Ищем Issue c названием " + ISSUE_NAME, () -> {
            $$("[data-hovercard-type='issue']").findBy(text(ISSUE_NAME)).shouldBe(visible);
        });
    }
}
