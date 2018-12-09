package game;

public class Organism {
	
	public int power;
	public int intitative;
	public int liveLength;
	public int powerToReproduce;
	public String sign;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getIntitative() {
		return intitative;
	}
	public void setIntitative(int intitative) {
		this.intitative = intitative;
	}
	public int getLiveLength() {
		return liveLength;
	}
	public void setLiveLength(int liveLength) {
		this.liveLength = liveLength;
	}
	public int getPowerToReproduce() {
		return powerToReproduce;
	}
	public void setPowerToReproduce(int powerToReproduce) {
		this.powerToReproduce = powerToReproduce;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "[power= " + power + ", intitative= " + intitative + ", liveLength= " + liveLength
				+ ", powerToReproduce= " + powerToReproduce + ", sign= " + sign + "]";
	}
	
	

}
