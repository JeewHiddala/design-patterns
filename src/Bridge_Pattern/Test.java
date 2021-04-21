package Bridge_Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV lgLv = new LGTV();
		TV sontTv = new SonyTV();
		
		new RemoteControllerImpl(lgLv).on();
		new RemoteControllerImpl(lgLv).off();
		new RemoteControllerImpl(lgLv).tune(10);
		new RemoteControllerImpl(sontTv).on();
		new RemoteControllerImpl(sontTv).off();
		new RemoteControllerImpl(sontTv).tune(20);
	}

}
