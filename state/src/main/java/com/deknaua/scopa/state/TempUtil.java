package com.deknaua.scopa.state;

public class TempUtil {
  public static void main(String[] args) {
    for (int i = 0; i < CardSuit.values().length; i++) {
      for (int j = 0; j < CardValue.values().length; j++) {
        System.out.println(CardSuit.values()[i].name() + "_" + CardValue.values()[j].name() + "(CardSuit." + CardSuit.values()[i].name() + ", CardValue."
            + CardValue.values()[j].name() + "),");
      }
    }
  }
}
