package ch09;

public class ToyRobot implements RemoteController, SoundEffect{
	
	String name;
	public ToyRobot() {
		this.name = "°Ç´ã·Îº¿";
	}

	@Override
	public void turnOn() {
		System.out.println("Àå³­°¨ ·Îº¿À» ÄÕ´Ï´Ù.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Àå³­°¨ ·Îº¿À» ²ü´Ï´Ù.");
		
	}

	@Override
	public void notification() {
		System.out.println("µÎ·ç·ç Äç !!~");
		
	}

}
