package chapter02.hw;

public class TV {

	private boolean power;
	private int channel;
	private int volume;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if (!power) {
			return;
		}
		if (channel > 50) {
			channel = 0;
		}
		if (channel < 0) {
			channel = 50;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		if (up)  channel(++channel);
		if (!up) channel(--channel);
	}
	
	public void volume(int volume) {
		if (!power) {
			return;
		}
		if (volume > 50) {
			volume = 0;
		}
		if (volume < 0) {
			volume = 50;
		}
		this.volume = volume;
	}

	public void volume(boolean up) {
		if (up)  volume(++volume);
		if (!up) volume(--volume);
	}
	
	public void status() {
		System.out.println(
				"TV [power = " + power +
				", channel = " + channel +
				", volume = " + volume +
				"]"
		);
	}
	
}
