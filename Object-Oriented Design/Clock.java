package de.ovgu.icse.assignment02;

public class Clock {
int in_hour;
int in_minute;

	public Clock(int hour, int minute) {
        this.in_hour=hour;
        this.in_minute=minute;
	}

	public Clock(int minute) {
		this.in_hour=(minute/60)%24;
		this.in_minute=minute%60;
	}

	public Clock(String hourmin) {
		this.in_hour=Integer.valueOf(hourmin.substring(0,2));
		this.in_minute=Integer.valueOf(hourmin.substring(3,5));
        	}

	public int getMin() {
		return this.in_minute;
	}

	public int getHour() {
        return this.in_hour;
    }

	public Clock add(int min) {
	    int minute=(this.in_minute+min)%60;
	    int hour=(this.in_hour+(this.in_minute+min)/60)%24;
		return new Clock(hour,minute);
	}

	public Clock add(Clock c) {
	    return this.add(c.getHour()*60+c.getMin());
	}

	public String toString() {
        return String.format("%02d",this.in_hour)+":"+String.format("%02d",this.in_minute);

	}
}
