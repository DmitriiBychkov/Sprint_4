import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.PageObject.ScooterMainPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class TestScooterMainPage {
    private ScooterMainPage objScooterMainPage;
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();//драйвер хром
        driver = new ChromeDriver();//экземпляр драйвера хром
        WebDriverManager.firefoxdriver().setup();//драйвер мозиллы
//        driver = new FirefoxDriver();//экземпляр драйвера мозиллы
        objScooterMainPage = new ScooterMainPage(driver);//новый объект класса главной страницы
        objScooterMainPage.open();//открытие тестовой страницы
        objScooterMainPage.waitForLoadPage();//ожидание загрузки
        objScooterMainPage.clickCookieButton();//принять куки
        objScooterMainPage.findQuestions();
    }

    @Test
    public void checkFirstQuestionTwoStringsEqual() {
        objScooterMainPage.findFirstQuestion();//скролл до 1го вопроса
        objScooterMainPage.clickPriceQuestion();//клик на 1 вопрос
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";//ожидаемый ответ
        String actual = objScooterMainPage.priceText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkSecondQuestionTwoStringsEqual() {
        objScooterMainPage.findSecondQuestion();//скролл до 2го вопроса
        objScooterMainPage.clickQuantityQuestion();//клик на 2 вопрос
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";//ожидаемый ответ
        String actual = objScooterMainPage.quantityText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkThirdQuestionTwoStringsEqual() {
        objScooterMainPage.findThirdQuestion();//скролл до 3го вопроса
        objScooterMainPage.clickTimeQuestion();//клик на 3 вопрос
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";//ожидаемый ответ
        String actual = objScooterMainPage.timeText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkFourthQuestionTwoStringsEqual() {
        objScooterMainPage.findFourthQuestion();//скролл до 4го вопроса
        objScooterMainPage.clickTodayQuestion();//клик на 4 вопрос
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";//ожидаемый ответ
        String actual = objScooterMainPage.todayText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkFifthQuestionTwoStringsEqual() {
        objScooterMainPage.findFifthQuestion();//скролл до 5го вопроса
        objScooterMainPage.clickExtendReturnQuestion();//клик на 5 вопрос
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";//ожидаемый ответ
        String actual = objScooterMainPage.extendReturnText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkSixthQuestionTwoStringsEqual() {
        objScooterMainPage.findSixthQuestion();//скролл до 6го вопроса
        objScooterMainPage.clickChargerQuestion();//клик на 6 вопрос
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";//ожидаемый ответ
        String actual = objScooterMainPage.chargerText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkSeventhQuestionTwoStringsEqual() {
        objScooterMainPage.findSeventhQuestion();//скролл до 7го вопроса
        objScooterMainPage.clickCancellationQuestion();//клик на 7 вопрос
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";//ожидаемый ответ
        String actual = objScooterMainPage.cancellationText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @Test
    public void checkEighthQuestionTwoStringsEqual() {
        objScooterMainPage.findEighthQuestion();//скролл до 8го вопроса
        objScooterMainPage.clickMkadQuestion();//клик на 8 вопрос
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";//ожидаемый ответ
        String actual = objScooterMainPage.mkadText();//получаем текст ответа
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//ожидание открытия ответа
        assertEquals(expected, actual);//сравниваем
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
