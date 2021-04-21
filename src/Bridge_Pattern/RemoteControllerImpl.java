package Bridge_Pattern;

public class RemoteControllerImpl implements RemoteController {
	private TV tv;

	public RemoteControllerImpl(TV tv) {
		this.tv = tv; 
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		tv.off();
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		tv.tune(channel);
	}

}
