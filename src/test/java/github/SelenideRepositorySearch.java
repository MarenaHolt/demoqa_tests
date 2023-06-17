package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиска Selenide и нажать Enter
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        //$ ищет первый элемент из селектора, $$ ищет все элементы из селектора
        //кликнуть на первый репозиторий из списка найденных
        $$("ul.repo-list li").first().$("a").click();
        //проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        //.classname, #id, [] атрибут, a[href=abc].red

    }
}
