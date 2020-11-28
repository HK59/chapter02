package com.javaex.ex07;

public class TV {

	//field
	private int channel; 
	private int volume;
	private boolean power;

	
	//constructor
	public TV() {
		super();
	}


	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}


	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}


	private void status() {
		// TODO Auto-generated method stub
		
	}
	
	public void setPower(boolean power) {
		this.power = power;
		if (power == true) {
			this.power = true;
			
		} else {
			this.power = false;
		}
	}

	
	public void setChannel(int channel) {
		if (this.power == true) {
			if (channel > 255) {{ //when the tv is on;
				this.channel = 255;
			}} else if (channel <= 0) {
				this.channel = 1;
			} else if (channel <= 255) {
				this.channel = channel;
			}
		} else {//when the tv is off; it is not implemented and the status is
			status();
		}
		
	}
	

	public void Channel (boolean up) {{
		if (this.power == true) 
			if (up == true) {
				if (channel == 255) {
					this.channel = 255;
				}else 
					this.channel += 1;
			
			}else{
				if(channel == 1) {
					this.channel = 1;
				}else {
					this.channel -= 1;
				}
			}
			else {
				status();
			}
		}
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		if (this.power == true) {
			if (volume ==100) {
				this.volume = 100;
			}else if (this.volume <= 0) {
				this.volume = 0;
			}else if (this.volume <= 100) {
				this.volume = volume;
				
			}
	}

	}
	
	 public void Volume(int volume) {
		 this.volume = volume;
		 if (this.power == true) {
			 if (volume ==100) {
		 }else 
			 this.volume +=1;
			 
		 }else 
			 if(volume == 1) {
				 this.volume -=1;
			 }
			 else {
				 status();
			 }
				 
	 	}


	@Override
	public String toString() {
		return "TV [getChannel()=" + getChannel() + ", getVolume()=" + getVolume() + ", isPower()=" + isPower() + "]";
	}
	
	}

