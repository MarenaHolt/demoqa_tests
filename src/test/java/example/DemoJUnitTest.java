package example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;


public class DemoJUnitTest {

    @BeforeAll //запускатся перед всеми тестами 1 раз
    static void beforeAll(){
        System.out.println("#### @BeforeAll");
        Configuration.browser = "chrome"; //все тесты будут запускаться только в хроме

    }

    @AfterAll //запускатся после всех тестов 1 раз
    static void afterAll(){
        System.out.println("#### @AfterAll");
    //    Configuration.browser = "chrome"; //все тесты будут запускаться только в хроме

    }

    @BeforeEach //запускает каждый раз перед тестом,
    //не требует static, выглядит как обычный тест
    void beforeEach(){
        System.out.println("#### @BeforeEach");
    }

    @AfterEach //запускает каждый раз после теста,
        //не требует static, выглядит как обычный тест
    void afterEach(){
        System.out.println("#### @AfterEach");
    }

    @Test //аннотация, которая запускает код, как будто есть метод main
    void firstTest(){
        System.out.println("    #### @Test first test");
        int result = 2 + 2;
        Assertions.assertTrue(result == 4);
    }

    @Test
    void secondTest(){
        System.out.println("    #### @Test second test");
        int result = 2 * 2;
        Assertions.assertTrue(result == 4);
    }


}
