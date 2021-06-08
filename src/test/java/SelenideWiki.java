import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWiki {
    @Test
    void softAssertionsTest(){
        // открыть страничку Selenide в Github
        open("https://github.com/selenide/selenide");
        //Переход в раздел Wiki проекта
        $("[data-content='Wiki']").click();
        //Поиск в списке страниц (Pages) страницы SoftAssertions и ее открытие
        $("#wiki-pages-filter").setValue("SoftAssertions");
        // Проверка, что на странице SoftAssertions есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
