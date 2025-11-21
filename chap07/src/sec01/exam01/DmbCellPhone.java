package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); //최상단 작성 필요
//		super();
		System.out.println("자식객체 호출");
//		super(); //부모의 생성자 호출, 생략시 자동추가
		this.channel = channel;
		
		this.model = model; //부모로부터 물려받음
		this.color = color; //부모로부터 물려받음
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
