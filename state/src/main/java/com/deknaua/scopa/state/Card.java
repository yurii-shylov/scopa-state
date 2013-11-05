package com.deknaua.scopa.state;

public enum Card {
  CUP_ONE(CardSuit.CUP, CardValue.ONE),
  CUP_TWO(CardSuit.CUP, CardValue.TWO),
  CUP_THREE(CardSuit.CUP, CardValue.THREE),
  CUP_FOUR(CardSuit.CUP, CardValue.FOUR),
  CUP_FIVE(CardSuit.CUP, CardValue.FIVE),
  CUP_SIX(CardSuit.CUP, CardValue.SIX),
  CUP_SEVEN(CardSuit.CUP, CardValue.SEVEN),
  CUP_KNAVE(CardSuit.CUP, CardValue.KNAVE),
  CUP_KNIGHT(CardSuit.CUP, CardValue.KNIGHT),
  CUP_KING(CardSuit.CUP, CardValue.KING),
  COIN_ONE(CardSuit.COIN, CardValue.ONE),
  COIN_TWO(CardSuit.COIN, CardValue.TWO),
  COIN_THREE(CardSuit.COIN, CardValue.THREE),
  COIN_FOUR(CardSuit.COIN, CardValue.FOUR),
  COIN_FIVE(CardSuit.COIN, CardValue.FIVE),
  COIN_SIX(CardSuit.COIN, CardValue.SIX),
  COIN_SEVEN(CardSuit.COIN, CardValue.SEVEN),
  COIN_KNAVE(CardSuit.COIN, CardValue.KNAVE),
  COIN_KNIGHT(CardSuit.COIN, CardValue.KNIGHT),
  COIN_KING(CardSuit.COIN, CardValue.KING),
  SWORD_ONE(CardSuit.SWORD, CardValue.ONE),
  SWORD_TWO(CardSuit.SWORD, CardValue.TWO),
  SWORD_THREE(CardSuit.SWORD, CardValue.THREE),
  SWORD_FOUR(CardSuit.SWORD, CardValue.FOUR),
  SWORD_FIVE(CardSuit.SWORD, CardValue.FIVE),
  SWORD_SIX(CardSuit.SWORD, CardValue.SIX),
  SWORD_SEVEN(CardSuit.SWORD, CardValue.SEVEN),
  SWORD_KNAVE(CardSuit.SWORD, CardValue.KNAVE),
  SWORD_KNIGHT(CardSuit.SWORD, CardValue.KNIGHT),
  SWORD_KING(CardSuit.SWORD, CardValue.KING),
  CLUB_ONE(CardSuit.CLUB, CardValue.ONE),
  CLUB_TWO(CardSuit.CLUB, CardValue.TWO),
  CLUB_THREE(CardSuit.CLUB, CardValue.THREE),
  CLUB_FOUR(CardSuit.CLUB, CardValue.FOUR),
  CLUB_FIVE(CardSuit.CLUB, CardValue.FIVE),
  CLUB_SIX(CardSuit.CLUB, CardValue.SIX),
  CLUB_SEVEN(CardSuit.CLUB, CardValue.SEVEN),
  CLUB_KNAVE(CardSuit.CLUB, CardValue.KNAVE),
  CLUB_KNIGHT(CardSuit.CLUB, CardValue.KNIGHT),
  CLUB_KING(CardSuit.CLUB, CardValue.KING);
  
  private CardSuit suit;
  private CardValue value;
  
  private Card(CardSuit suit, CardValue value) {
    this.suit = suit;
    this.value = value;
  }
  
  public CardSuit getSuit() {
    return suit;
  }
  
  public CardValue getValue() {
    return value;
  }
}
