package testProgram4;
/**
 * a class of television
 * @author wanghan
 *
 */
public class TV {
	int channel;
	int volumeLevel;
	boolean on;

	public TV(int channel, int volumeLevel, boolean on) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}

	public void turnOn() {
		this.on = true;
	}

	public void turnOff() {
		this.on = false;
	}

	public void setChannel(int newChannel) {
		this.channel = newChannel;
	}

	public void setVolume(int newVolume) {
		this.volumeLevel = newVolume;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDowm() {
		this.channel--;
	}

	public void volumeUp() {
		this.volumeLevel++;
	}

	public void volumDown() {
		this.volumeLevel--;
	}
}
