package config;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class TestBase
{
    @BeforeAll
    public static void setUp()
    {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
    }

    @AfterAll
    public static void tearDown()
    {
        Selenide.closeWebDriver();
    }
}
