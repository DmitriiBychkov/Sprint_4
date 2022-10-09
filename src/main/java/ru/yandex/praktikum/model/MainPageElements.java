package ru.yandex.praktikum.model;

import org.openqa.selenium.By;

public class MainPageElements {
    //    Кнопка "Заказать" в хедере
    private final By orderButtonHeader = By.cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g");
    //    Кнопка "Заказать" в блоке "Как это работает"
    private final By orderButtonMiddle = By.cssSelector("div.Home_FinishButton__1_cWm > button.Button_Middle__1CSJM");

    //    Кнопка "да все привыкли" в окне про куки
    private final By cookieButton = By.id("rcc-confirm-button");

    //    Вопрос "Сколько это стоит? И как оплатить?"
    private final By priceQuestion = By.id("accordion__heading-0");
    //    Ответ "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    private final By priceAnswer = By.id("accordion__panel-0");

    //    Вопрос "Хочу сразу несколько самокатов! Так можно?"
    private final By quantityQuestion = By.id("accordion__heading-1");
    //    Ответ "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    private final By quantityAnswer = By.id("accordion__panel-1");

    //    Вопрос "Как рассчитывается время аренды?"
    private final By timeQuestion = By.id("accordion__heading-2");
    //    Ответ "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    private final By timeAnswer = By.id("accordion__panel-2");

    //    Вопрос "Можно ли заказать самокат прямо на сегодня?"
    private final By todayQuestion = By.id("accordion__heading-3");
    //    Ответ "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    private final By todayAnswer = By.id("accordion__panel-3");

    //Вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By extendReturnQuestion = By.id("accordion__heading-4");
    //    Ответ "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    private final By extendReturnAnswer = By.id("accordion__panel-4");

    //    Вопрос "Вы привозите зарядку вместе с самокатом?"
    private final By chargerQuestion = By.id("accordion__heading-5");
    //    Ответ "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    private final By chargerAnswer = By.id("accordion__panel-5");

    //    Вопрос "Можно ли отменить заказ?"
    private final By cancellationQuestion = By.id("accordion__heading-6");
    //    Ответ "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    private final By cancellationAnswer = By.id("accordion__panel-6");

    //    Вопрос "Я жизу за МКАДом, привезёте?"
    private final By mkadQuestion = By.id("accordion__heading-7");
    //    Ответ "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    private final By mkadAnswer = By.id("accordion__panel-7");
}
