package com.deknaua.scopa.state;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;

import com.deknaua.scopa.state.property.StateProperty;

public class State implements Serializable, Cloneable {
  private static final long serialVersionUID = -7115788362062252477L;

  private transient PropertyChangeSupport propertyChangeSupport;
  private int gameId;
  private List<Player> players;
  private byte playersTotal;
  private int playerIdTurn;
  private List<Card> boardCards;

  public int getGameId() {
    return gameId;
  }

  public void setGameId(int gameId) {
    final int oldGameId = getGameId();
    this.gameId = gameId;
    propertyChangeSupport.firePropertyChange(StateProperty.PLAYERS_TOTAL, oldGameId, getGameId());
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    final List<Player> oldPlayers = getPlayers();
    this.players = players;
    propertyChangeSupport.firePropertyChange(StateProperty.PLAYERS, oldPlayers, getPlayers());
  }

  public byte getPlayersTotal() {
    return playersTotal;
  }

  public void setPlayersTotal(byte playersTotal) {
    final byte oldPlayersTotal = this.playersTotal;
    this.playersTotal = playersTotal;
    propertyChangeSupport.firePropertyChange(StateProperty.PLAYERS_TOTAL, oldPlayersTotal, getPlayersTotal());
  }

  public int getPlayerIdTurn() {
    return playerIdTurn;
  }

  public void setPlayerIdTurn(int playerIdturn) {
    final int oldPlayerIdTurn = getPlayerIdTurn();
    this.playerIdTurn = playerIdturn;
    propertyChangeSupport.firePropertyChange(StateProperty.PLAYER_ID_TURN, oldPlayerIdTurn, getPlayerIdTurn());
  }

  public List<Card> getBoardCards() {
    return boardCards;
  }

  public void setBoardCards(List<Card> boardCards) {
    final List<Card> oldBoardCards = getBoardCards();
    this.boardCards = boardCards;
    propertyChangeSupport.firePropertyChange(StateProperty.BOARD_CARDS, oldBoardCards, getBoardCards());
  }

  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
  }
}
