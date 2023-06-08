package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextboxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
//        Configuration.browser = FIREFOX;
//        Configuration.browserVersion = "100.0";
//        Configuration.holdBrowserOpen = true;
    }

    @Test
    void successTest() {
        open("/text-box");

        $("#userName").setValue("Some name");
        $("#userEmail").setValue("some_email@someemail.com");
        $("#currentAddress").setValue("Some address");
        $("#permanentAddress").setValue("Another address");
        $("#submit").click();

        $("#output #name").shouldHave(text("Some name"));
        $("#output #email").shouldHave(text("some_email@someemail.com"));
        $("#output #currentAddress").shouldHave(text("Some address"));
        $("#output #permanentAddress").shouldHave(text("Another address"));
    }
}
