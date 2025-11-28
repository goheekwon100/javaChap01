package sec01.exam03;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// 실행 블록이 없는 메소드
	// public abstract 자동 추가
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
