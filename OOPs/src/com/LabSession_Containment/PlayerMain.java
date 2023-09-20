package com.LabSession_Containment;

public class PlayerMain {

	public static void main(String[] args) {


		Player p = new Player();
		
		p.setPlayerId(18);
		p.setPlayerName("ViratKohli");
		p.setC(new Country());
		p.getC().setCountryId(1947);
		p.getC().setCountryName("India");
		
		System.out.println("Player id: "+p.getPlayerId());
		System.out.println("Player Name: "+p.getPlayerName());
		System.out.println("Country id: "+p.getC().getCountryId());
		System.out.println("Country Name: "+p.getC().getCountryName());

	}

}
