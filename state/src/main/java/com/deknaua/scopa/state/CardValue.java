package com.deknaua.scopa.state;

public enum CardValue {
  ONE((byte) 1),
  TWO((byte) 2),
  THREE((byte) 3),
  FOUR((byte) 4),
  FIVE((byte) 5),
  SIX((byte) 6),
  SEVEN((byte) 7),
  KNAVE((byte) 8),
  KNIGHT((byte) 9),
  KING((byte) 10);
  
  private byte value;

  private CardValue(byte value) {
    this.value = value;
  }

  public byte getValue() {
    return value;
  }

  public static CardValue getCardValue(byte value) {
    for (CardValue cardValue : CardValue.values()) {
      if (cardValue.getValue() == value) {
        return cardValue;
      }
    }
    return null;
  }
}
