package com.deknaua.scopa.state;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;

import com.deknaua.scopa.state.property.PlayerProperty;

public class Player implements Serializable {
  private static final long serialVersionUID = -4365709583243160752L;

  private transient PropertyChangeSupport propertyChangeSupport;
  private int id;
  private List<Card> cards;
  private byte score;

  public Player() {
    this.propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    final int oldId = getId();
    this.id = id;
    propertyChangeSupport.firePropertyChange(PlayerProperty.ID, oldId, getId());
  }

  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    final List<Card> oldCards = getCards();
    this.cards = cards;
    propertyChangeSupport.firePropertyChange(PlayerProperty.CARDS, oldCards, getCards());
  }

  public byte getScore() {
    return score;
  }

  public void setScore(byte score) {
    final byte oldScore = getScore();
    this.score = score;
    propertyChangeSupport.firePropertyChange(PlayerProperty.SCORE, oldScore, getScore());
  }

  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
  }
}
