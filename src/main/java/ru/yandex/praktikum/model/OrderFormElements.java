package ru.yandex.praktikum.model;

import org.openqa.selenium.By;

public class OrderFormElements {
    //    Поле "Имя"
    private final By nameInputField = By.cssSelector(".//input[@placeholder='* Имя']");
    //    Поле "Фамилия"
    private final By surnameInputField = By.cssSelector(".//input[@placeholder='* Фамилия']");
    //    Поле "Адрес: куда привезти заказ"
    private final By addressInputField = By.cssSelector(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //    Поле "Станция метро"
    private final By metroInputField = By.cssSelector(".//input[@placeholder='* Станция метро']");
    //    Поле "Телефон: на него позвонит курьер"
    private final By phoneInputField = By.cssSelector(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //    Кнопка "Далее"
    private final By orderNextButton = By.cssSelector("div.Order_NextButton__1_rCA > button.Button_Middle__1CSJM");

    //    Поле "Когда привезти самокат"
    private final By whenInputField = By.cssSelector(".//input[@placeholder='* Когда привезти самокат']");
    //    Поле "Срок аренды"
    private final By termInputField = By.cssSelector(".Dropdown-placeholder");
    //    Сутки в Поле "Срок аренды"
    private final By termInputOption = By.xpath(".//div[2]/div[2]/div[2]/div[2]/div[1]");
    //    Поле "Цвет самоката"
    private final By colorInputField = By.cssSelector(".Order_Title__3EKne");
    //    Черный в Поле "Цвет самоката"
    private final By colorInputOption = By.id("black");
    //    Поле "Комментарий для курьера"
    private final By commentInputField = By.cssSelector(".//input[@placeholder='Комментарий для курьера']");

    //    Кнопка "Заказать" для завершения
    private final By orderButtonFinal = By.xpath(".//div[2]/div[3]/button[2]");
    //    Кнопка "Да" в окне подтверждения оформления заказа
    private final By confirmButton = By.xpath(".//div[2]/div[5]/div[2]/button[2]");

    //    Окно "Заказ оформлен"
    private final By processedWindow = By.cssSelector(".Order_ModalHeader__3FDaJ");
    //    Кнопка "Посмотреть статус"
    private final By checkStatusButton = By.xpath(".//div[2]/div[5]/div[2]/button");
}
