package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        //Configuration.browserSize="800x400";
        //Configuration.browser="firefox";
        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому аватару из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                // .closest(".BorderGrid-cell").$$("ul li").first().hover();
                .closest("h2").sibling(0).$$("li").first().hover();
        //closest() - ищем наверх до первого элемента, который удовлетворяет
        //условиям
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

        //Проверка:во всплывающем окне есть текст Andrei Solntsev

        // sleep(5000);
        // screenshot("screen");
    }
}
