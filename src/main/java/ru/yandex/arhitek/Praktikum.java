package ru.yandex.arhitek;

public class Praktikum {
  public static void main(String[] args) {
  Account check = new Account("Ambasador Leader");
    if (check.checkNameToEmboss()){
      System.out.println("Поздравляем, это имя подходит");
    }
    else {
      System.out.println("Укажите другое имя");
  }
}}
