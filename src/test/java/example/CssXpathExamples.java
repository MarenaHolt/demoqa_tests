package example;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpathExample() {
        //<input type="email" class="inputtext login_form_input_box"
        //name="email" id="email" data-testid="email">
        $("input[data-testid=email]").setValue("1");
        $("[data-testid=email]").setValue("");
        $(by("data-testid", "email")).setValue("");
        $x("//*[@data-testid='email']").setValue("");
        $(byXpath("//*[@data-testid='email']")).setValue("");

        //<input type="email" class="inputtext login_form_input_box"
        //name="email" id="email">
        $("[id=email]").setValue("");
        $("#email").setValue("");
        $("#input #email").setValue("");

        //<input type="email" class="inputtext login_form_input_box"
        //name="email">
        $("[name=email]").setValue("");
        $(byName("email")).setValue("");

        //<input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("");
        $(".login_form_input_box").setValue("");
        $(".inputtext.login_form_input_box").setValue("");
        $("input.inputtext.login_form_input_box]").setValue("");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("");


        //<div class="inputtext>
        // <input type="email" class="login_form_input_box">
        //</div>
        $("inputtext .login_form_input_box").setValue("");
        $("div.inputtext input.login_form_input_box").setValue("");
        $("div.inputtext").$("input.login_form_input_box").setValue("");

        //<div>Hello</div>
        $x("//div[text()='Hello']").click();
        $(byText("Hello")).click();
        $(withText("ll")).click();//ищет неполный текст
    }
}
