package ru.yandex.arhitek;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CheckNameTest {

  private final String name;
  private final Boolean expectedString;

  public CheckNameTest(String name, Boolean expectedString) {
    this.name = name;
    this.expectedString = expectedString;
  }

  @Parameterized.Parameters
  public static Object[][] dataForTest() {
    return new Object[][]{
            {"Andrey Evdokimov", true},                  //Позитивный кейс
            {"AndreyEvdokimov", false},                  //Пробел отсутствует
            {"Andrey  Evdokimov", false},                //Пробела два
            {" AndreyEvdokimov", false},                 //Пробел в начале
            {"AndreyEvdokimov ", false},                 //Пробел в конце
            {"Ad", false},                               //Символов меньше 3х
            {"123456789101112 14151617181920", false},   //Символов больше 19
            {"", false},                                 //Пустая строка
    };
  }

  @Test
  public void paramTest() {
    Account names = new Account(name);
    Assert.assertEquals(expectedString, names.checkNameToEmboss());
  }
}

