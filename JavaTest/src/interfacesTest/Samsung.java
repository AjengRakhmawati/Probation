package interfacesTest;

public class Samsung implements Phone {
	private int volume;
	private boolean isPowerOn;
	
	public void Samsung() {
		this.volume = 50;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Welcome to...");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Power Off");
			
	}

	@Override
	public void volumeUp() {
		if (isPowerOn) {
			if(this.volume==Max_Volume) {
				System.out.println("volume is max...");
				System.out.println("sudah " + this.getVolume() + "%");
			}else {
				this.volume += 10;
				System.out.println("Volume is "+ this.getVolume());
			} 
					
		}else {
				System.out.println("Hp off");
		}
	}

	@Override
	public void volumeDown() {
		if(isPowerOn) {
			if(this.volume==Min_Volume) {
				System.out.println("volume is 0%");
			}else {
				this.volume-=10;
				System.out.println("volume is "+this.getVolume());
			}
		}else {
			System.out.println("Hp off");
		}
		
	}
	public int getVolume() {
		return this.volume;
	}

}
