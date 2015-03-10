package de.yadrone.base.navdata;

import java.util.EventListener;

public interface GPSListener extends EventListener {
	
	public void gpsDataUpdated(double longnitude, float roll);

}
