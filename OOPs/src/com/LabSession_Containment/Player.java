package com.LabSession_Containment;

public class Player {

	private int playerId;
	private String playerName;
	private Country c;
	
	Player(){
		
	}
	Player(int playerId,String playerName,Country c){
		
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Country getC() {
		return c;
	}
	public void setC(Country c) {
		this.c = c;
	}
	
}
