package ru.yandex.praktikum.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ScooterOrderForm {
    private final WebDriver driver;

    public ScooterOrderForm(WebDriver driver) {
        this.driver = driver;
    }//конструктор класса

    //    Адрес сайта
    private static final String SCOOTER_URL = "https://qa-scooter.praktikum-services.ru/";
    //    Кнопка "да все привыкли" в окне про куки
    private final static By COOKIE_BUTTON = By.id("rcc-confirm-button");
    //    Кнопка "Заказать" в хедере
    private final static By HEADER_ORDER_BUTTON = By.cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g");
    //    Кнопка "Заказать" в блоке "Как это работает"
    private final static By MIDDLE_ORDER_BUTTON = By.cssSelector("div.Home_FinishButton__1_cWm > button.Button_Middle__1CSJM");

    //    Поле "Имя"
    private final static By NAME_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[1]/input");
    //    Поле "Фамилия"
    private final static By SURNAME_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[2]/input");
    //    Поле "Адрес: куда привезти заказ"
    private final static By ADDRESS_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[3]/input");
    //    Поле "Станция метро"
    private final static By METRO_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[4]/div/div/input");
    //    Поле "Телефон: на него позвонит курьер"
    private final static By PHONE_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[5]/input");

    //    Кнопка "Далее"
    private final static By ORDER_NEXT_BUTTON = By.cssSelector("div.Order_NextButton__1_rCA > button.Button_Middle__1CSJM");

    //    Поле "Когда привезти самокат"
    private final static By WHEN_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[1]/div/div/input");
    //    Поле "Срок аренды"
    private final static By TERM_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[2]/div/div[1]");
    //    Сутки в Поле "Срок аренды"
    private final static By TERM_INPUT_OPTION1 = By.xpath(".//div[2]/div[2]/div[2]/div[2]/div[1]");
    //    Двое суток в Поле "Срок аренды"
    private final static By TERM_INPUT_OPTION2 = By.xpath(".//div[2]/div[2]/div[2]/div[2]/div[2]");
    //    Серый в Поле "Цвет самоката"
    private final static By COLOR_INPUT_OPTION_GREY = By.id("grey");
    //    Черный в Поле "Цвет самоката"
    private final static By COLOR_INPUT_OPTION_BLACK = By.id("black");
    //    Поле "Комментарий для курьера"
    private final static By COMMENT_INPUT_FIELD = By.xpath(".//div[2]/div[2]/div[4]/input");

    //    Кнопка "Заказать" для завершения
    private final static By ORDER_BUTTON_FINAL = By.xpath(".//div[2]/div[3]/button[2]");
    //    Кнопка "Да" в окне подтверждения оформления заказа
    private final static By CONFIRM_BUTTON = By.xpath(".//div[2]/div[5]/div[2]/button[2]");

    //    Окно "Заказ оформлен"
    private final static By PROCESSED_WINDOW = By.xpath(".//div[2]/div[5]/div[1]");

    // метод открытия тестовой страницы
    public ScooterOrderForm open() {
        driver.get(SCOOTER_URL);
        return this;
    }

    // метод клика на подтверждение куки
    public ScooterOrderForm clickCookieButton() {
        driver.findElement(COOKIE_BUTTON).click();
        return this;
    }

    // метод ожидания загрузки страницы (появление наличия кнопки Заказать)
    public void waitForLoadPage() {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOfElementLocated(HEADER_ORDER_BUTTON));
    }

    // метод проверки наличия кнопки "Заказать" в хедере
    public boolean isHeaderOrderButtonPresent() {
        return driver.findElement(HEADER_ORDER_BUTTON).isDisplayed();
    }

    // метод клика на "Заказать" в хедере
    public ScooterOrderForm clickHeaderOrderButton() {
        driver.findElement(HEADER_ORDER_BUTTON).click();
        return this;
    }

    // метод проверки наличия кнопки "Заказать" в блоке "Как это работает"
    public boolean isOrderButtonMiddlePresent() {
        return driver.findElement(MIDDLE_ORDER_BUTTON).isEnabled();
    }

    //метод поиска кнопки "Заказать" в блоке "Как это работает" и скролла до него
    public void findMiddleOrderButton() {
        WebElement element = driver.findElement(MIDDLE_ORDER_BUTTON);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // метод клика на "Заказать" в блоке "Как это работает"
    public ScooterOrderForm clickMiddleOrderButton() {
        driver.findElement(MIDDLE_ORDER_BUTTON).click();
        return this;
    }

    // метод ввода значения в Поле "Имя"
    public ScooterOrderForm inputName() {
        driver.findElement(NAME_INPUT_FIELD).click();
        driver.findElement(NAME_INPUT_FIELD).sendKeys("Дмитрий");
        return this;
    }

    // метод ввода значения в Поле "Имя"
    public ScooterOrderForm inputNameWithSpaceCaps() {
        driver.findElement(NAME_INPUT_FIELD).click();
        driver.findElement(NAME_INPUT_FIELD).sendKeys("ДИ МА");
        return this;
    }

    // метод ввода значения в Поле "Фамилия"
    public ScooterOrderForm inputSurname() {
        driver.findElement(SURNAME_INPUT_FIELD).click();
        driver.findElement(SURNAME_INPUT_FIELD).sendKeys("Бычков");
        return this;
    }

    // метод ввода значения в Поле "Фамилия"
    public ScooterOrderForm inputSurnameCaps() {
        driver.findElement(SURNAME_INPUT_FIELD).click();
        driver.findElement(SURNAME_INPUT_FIELD).sendKeys("БЫЧКОВ");
        return this;
    }

    //    метод ввода значения в Поле "Адрес: куда привезти заказ"
    public ScooterOrderForm inputAddress() {
        driver.findElement(ADDRESS_INPUT_FIELD).click();
        driver.findElement(ADDRESS_INPUT_FIELD).sendKeys("Ленина, 12");
        return this;
    }

    //    метод ввода значения в Поле "Адрес: куда привезти заказ"
    public ScooterOrderForm inputAddressMinus() {
        driver.findElement(ADDRESS_INPUT_FIELD).click();
        driver.findElement(ADDRESS_INPUT_FIELD).sendKeys("Ленина-12");
        return this;
    }

    //    метод ввода значения в Поле "Станция метро"
    public ScooterOrderForm inputMetro() {
        driver.findElement(METRO_INPUT_FIELD).click();
        driver.findElement(METRO_INPUT_FIELD).sendKeys(Keys.DOWN);
        driver.findElement(METRO_INPUT_FIELD).sendKeys(Keys.ENTER);
        return this;
    }

    //    метод ввода значения в Поле "Станция метро"
    public ScooterOrderForm inputMetro2() {
        driver.findElement(METRO_INPUT_FIELD).click();
        driver.findElement(METRO_INPUT_FIELD).sendKeys(Keys.DOWN);
        driver.findElement(METRO_INPUT_FIELD).sendKeys(Keys.DOWN);
        driver.findElement(METRO_INPUT_FIELD).sendKeys(Keys.ENTER);
        return this;
    }

    //    метод ввода значения в Поле "Телефон: на него позвонит курьер"
    public ScooterOrderForm inputPhone() {
        driver.findElement(PHONE_INPUT_FIELD).click();
        driver.findElement(PHONE_INPUT_FIELD).sendKeys("12345678901");
        return this;
    }

    //    метод ввода значения в Поле "Телефон: на него позвонит курьер"
    public ScooterOrderForm inputPhonePlus() {
        driver.findElement(PHONE_INPUT_FIELD).click();
        driver.findElement(PHONE_INPUT_FIELD).sendKeys("+12345678901");
        return this;
    }

    //    метод клика на кнопку "Далее"
    public ScooterOrderForm clickOrderNextButton() {
        driver.findElement(ORDER_NEXT_BUTTON).click();
        return this;
    }

    //    метод ввода значения в Поле "Когда привезти самокат"
    public ScooterOrderForm inputWhen() {
        driver.findElement(WHEN_INPUT_FIELD).click();
        // готовим нужный форматтер
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // получаем текущую дату, прибавляем к ней 2 дня и форматируем
        String date = LocalDate.now().plusDays(2).format(formatter);
        driver.findElement(WHEN_INPUT_FIELD).sendKeys(date);
        driver.findElement(WHEN_INPUT_FIELD).sendKeys(Keys.ENTER);
        return this;
    }

    //    метод ввода значения в Поле "Когда привезти самокат"
    public ScooterOrderForm inputWhenToday() {
        driver.findElement(WHEN_INPUT_FIELD).click();
        // готовим нужный форматтер
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // получаем текущую дату, прибавляем к ней 2 дня и форматируем
        String date = LocalDate.now().plusDays(0).format(formatter);
        driver.findElement(WHEN_INPUT_FIELD).sendKeys(date);
        driver.findElement(WHEN_INPUT_FIELD).sendKeys(Keys.ENTER);
        return this;
    }

    //    метод ввода значения в Поле "Срок аренды"
    public ScooterOrderForm inputTerm() {
        driver.findElement(TERM_INPUT_FIELD).click();
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOfElementLocated(TERM_INPUT_OPTION1));
        driver.findElement(TERM_INPUT_OPTION1).click();
        return this;
    }

    //    метод ввода значения в Поле "Срок аренды"
    public ScooterOrderForm inputTermTwo() {
        driver.findElement(TERM_INPUT_FIELD).click();
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOfElementLocated(TERM_INPUT_OPTION2));
        driver.findElement(TERM_INPUT_OPTION2).click();
        return this;
    }

    //    метод ввода значения в Поле "Цвет самоката"
    public ScooterOrderForm inputColor() {
        driver.findElement(COLOR_INPUT_OPTION_BLACK).click();
        return this;
    }

    //    метод ввода значения в Поле "Цвет самоката"
    public ScooterOrderForm inputColorGrey() {
        driver.findElement(COLOR_INPUT_OPTION_GREY).click();
        return this;
    }

    //    метод ввода значения в Поле "Комментарий для курьера"
    public ScooterOrderForm inputComment() {
        driver.findElement(COMMENT_INPUT_FIELD).click();
        driver.findElement(COMMENT_INPUT_FIELD).sendKeys("В дверь стучать 3 раза");
        return this;
    }

    //    метод клика на кнопку "Заказать" для завершения
    public ScooterOrderForm clickOrderButtonFinal() {
        driver.findElement(ORDER_BUTTON_FINAL).click();
        return this;
    }

    //    метод нажатия кнопки "Да" в окне подтверждения оформления заказа
    public ScooterOrderForm clickConfirmButton() {
        driver.findElement(CONFIRM_BUTTON).click();
        return this;
    }

    //    метод проверки окна "Заказ оформлен"
    public boolean isProcessedWindowPresent() {
        return driver.findElement(PROCESSED_WINDOW).isDisplayed();
    }
}