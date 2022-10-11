import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.PageObject.ScooterOrderForm;

public class TestScooterOrderForm {
    private WebDriver driver;
    private ScooterOrderForm objScooterOrderForm;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();//драйвер хром
        driver = new ChromeDriver();//экземпляр драйвера хром
        WebDriverManager.firefoxdriver().setup();//драйвер мозиллы
//        driver = new FirefoxDriver();//экземпляр драйвера мозиллы
        objScooterOrderForm = new ScooterOrderForm(driver);//новый объект класса главной страницы
        objScooterOrderForm.open();//открытие тестовой страницы
        objScooterOrderForm.waitForLoadPage();//ожидание загрузки
        objScooterOrderForm.clickCookieButton();//принять куки
    }

    @Test
    public void enterOrderInMiddle() {
        // проверка наличия кнопки "Заказать" в хедере
        objScooterOrderForm.isHeaderOrderButtonPresent();
        //найти кнопку "Заказать" в блоке "Как это работает"
        WebElement element = driver.findElement(By.cssSelector("div.Home_FinishButton__1_cWm > button.Button_Middle__1CSJM"));
        //скролл до кнопки
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        // проверка наличия кнопки "Заказать" в блоке "Как это работает"
        objScooterOrderForm.isOrderButtonMiddlePresent();
        // клик на "Заказать" в блоке "Как это работает"
        objScooterOrderForm.clickMiddleOrderButton();
        // ввод значения в Поле "Имя"
        objScooterOrderForm.inputName();
        // ввод значения в Поле "Фамилия"
        objScooterOrderForm.inputSurname();
        // ввод значения в Поле "Адрес: куда привезти заказ"
        objScooterOrderForm.inputAddress();
        // ввод значения в Поле "Станция метро"
        objScooterOrderForm.inputMetro();
        // ввод значения в Поле "Телефон: на него позвонит курьер"
        objScooterOrderForm.inputPhone();
        // клик на кнопку "Далее"
        objScooterOrderForm.clickOrderNextButton();
        // ввод значения в Поле "Когда привезти самокат"
        objScooterOrderForm.inputWhen();
        // ввод значения в Поле "Срок аренды"
        objScooterOrderForm.inputTerm();
        // ввод значения в Поле "Цвет самоката"
        objScooterOrderForm.inputColor();
        // ввод значения в Поле "Комментарий для курьера"
        objScooterOrderForm.inputComment();
        // клик на кнопку "Заказать" для завершения
        objScooterOrderForm.clickOrderButtonFinal();
        // клик на кнопку "Да" в окне подтверждения оформления заказа
        objScooterOrderForm.clickConfirmButton();
        // проверка появления окна "Заказ оформлен"
        objScooterOrderForm.isProcessedWindowPresent();
    }

    @Test
    public void enterOrderInHeader() {
        // проверка наличия кнопки "Заказать" в хедере
        objScooterOrderForm.isHeaderOrderButtonPresent();
        // клик на "Заказать" в хедере
        objScooterOrderForm.clickHeaderOrderButton();
        // ввод значения в Поле "Имя"
        objScooterOrderForm.inputNameWithSpaceCaps();
        // ввод значения в Поле "Фамилия"
        objScooterOrderForm.inputSurnameCaps();
        // ввод значения в Поле "Адрес: куда привезти заказ"
        objScooterOrderForm.inputAddressMinus();
        // ввод значения в Поле "Станция метро"
        objScooterOrderForm.inputMetro2();
        // ввод значения в Поле "Телефон: на него позвонит курьер"
        objScooterOrderForm.inputPhonePlus();
        // клик на кнопку "Далее"
        objScooterOrderForm.clickOrderNextButton();
        // ввод значения в Поле "Когда привезти самокат"
        objScooterOrderForm.inputWhenToday();
        // ввод значения в Поле "Срок аренды"
        objScooterOrderForm.inputTermTwo();
        // ввод значения в Поле "Цвет самоката"
        objScooterOrderForm.inputColorGrey();
        // без ввода значения в Поле "Комментарий для курьера"
        // клик на кнопку "Заказать" для завершения
        objScooterOrderForm.clickOrderButtonFinal();
        // клик на кнопку "Да" в окне подтверждения оформления заказа
        objScooterOrderForm.clickConfirmButton();
        // проверка появления окна "Заказ оформлен"
        objScooterOrderForm.isProcessedWindowPresent();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
