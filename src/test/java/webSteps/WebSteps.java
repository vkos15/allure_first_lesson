package webSteps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WebSteps {

    @Step("Открываем главную github")
    public void openMainPage(){
        open("https://github.com/");
    }

   @Step("Ищем репозиторий {repository}")
    public void searchRepository(String repository){
        $("[data-test-selector='nav-search-input']").setValue(repository).pressEnter();
    }

    @Step("Открываем репозиторий {repository}")
    public void goToRepository(String repository){
        $("[href*='" + repository + "']").click();
    }

   @Step("Открываем список issues")
    public void openIssues(){
        $("#issues-tab").click();
    }

    @Step("Проверяем что есть issue с названием {name}")
    public void checkIssueWithName(String name){
        $$("[data-hovercard-type='issue']").findBy(text(name)).shouldBe(visible);
    }


}
