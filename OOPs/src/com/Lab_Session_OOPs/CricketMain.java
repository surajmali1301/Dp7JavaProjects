package com.Lab_Session_OOPs;

class Cricketer {
	private int pId;
	private String pName;
	private boolean isBaller;
	private float strikeRate;
	private int runs;// ODI

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getpId() {
		return pId;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpName() {
		return pName;
	}

	public void setBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public boolean getBaller() {
		return isBaller;
	}

	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}

	public float getStrikeRate() {
		return strikeRate;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

}

public class CricketMain {

	public static void main(String[] args) {

		Cricketer c = new Cricketer();
		c.setpId(18);
		c.setpName("ViratKohli");
		c.setBaller(false);
		c.setRuns(13000);
		c.setStrikeRate(93.0f);

		System.out.println("PlayerId: " + c.getpId() + "\nPlayerName: " + c.getpName() + "\nPlayerIsBaller: "
				+ c.getBaller() + "PlayerRunsInODI: " + c.getRuns() + "\nStrikeRate: " + c.getStrikeRate());
	}

}
