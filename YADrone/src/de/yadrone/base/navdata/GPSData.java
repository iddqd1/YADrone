package de.yadrone.base.navdata;

public class GPSData {
	  private double latitude;
      double longitude;
      double elevation;
      double hdop;
      int dataAvailable;
      int zeroValidated;
      int wptValidated;
      double lat0;
      double lon0;
      double latFuse;
      double lonFuse;
      long gpsState;
      
      
      /*
      xTraj:                reader.float32(),
      xRef:                 reader.float32(),
      yTraj:                reader.float32(),
      yRef:                 reader.float32(),
      thetaP:               reader.float32(),
      phiP:                 reader.float32(),
      thetaI:               reader.float32(),
      phiI:                 reader.float32(),
      thetaD:               reader.float32(),
      phiD:                 reader.float32(),
      vdop:                 reader.double64(),
      pdop:                 reader.double64(),
      speed:                reader.float32(),
      lastFrameTimestamp:   droneTimeToMilliSeconds(reader.uint32()),
      degree:               reader.float32(),
      degreeMag:            reader.float32(),
      ehpe:                 reader.float32(),
      ehve:                 reader.float32(),
      c_n0:                 reader.float32(),
      nbSatellites:         reader.uint32(),
      channels:             timesMap(12, reader.satChannel, reader),
      gpsPlugged:           reader.int32(),
      ephemerisStatus:      reader.uint32(),
      vxTraj:               reader.float32(),
      vyTraj:               reader.float32(),
      firmwareStatus:       reader.uint32()
    };
  }
	 */
	/*
	 *  'gps': function(reader) {
    return {
      // from https://github.com/lesire/ardrone_autonomy/commit/a986b3380da8d9306407e2ebfe7e0f2cd5f97683
      latitude:             reader.double64(),
      longitude:            reader.double64(),
      elevation:            reader.double64(),
      hdop:                 reader.double64(),
      dataAvailable:        reader.int32(),
      zeroValidated:        reader.int32(),
      wptValidated:         reader.int32(),
      lat0:                 reader.double64(),
      lon0:                 reader.double64(),
      latFuse:              reader.double64(),
      lonFuse:              reader.double64(),
      gpsState:             reader.uint32(),
      xTraj:                reader.float32(),
      xRef:                 reader.float32(),
      yTraj:                reader.float32(),
      yRef:                 reader.float32(),
      thetaP:               reader.float32(),
      phiP:                 reader.float32(),
      thetaI:               reader.float32(),
      phiI:                 reader.float32(),
      thetaD:               reader.float32(),
      phiD:                 reader.float32(),
      vdop:                 reader.double64(),
      pdop:                 reader.double64(),
      speed:                reader.float32(),
      lastFrameTimestamp:   droneTimeToMilliSeconds(reader.uint32()),
      degree:               reader.float32(),
      degreeMag:            reader.float32(),
      ehpe:                 reader.float32(),
      ehve:                 reader.float32(),
      c_n0:                 reader.float32(),
      nbSatellites:         reader.uint32(),
      channels:             timesMap(12, reader.satChannel, reader),
      gpsPlugged:           reader.int32(),
      ephemerisStatus:      reader.uint32(),
      vxTraj:               reader.float32(),
      vyTraj:               reader.float32(),
      firmwareStatus:       reader.uint32()
    };
  }
	 */


	public static class Builder {
		private double latitude;
		private double longitude;
		private double elevation;
		private double hdop;
		private int dataAvailable;
		private int zeroValidated;
		private int wptValidated;
		private double lat0;
		private double lon0;
		private double latFuse;
		private double lonFuse;
		private long gpsState;

		public Builder latitude(double latitude) {
			this.latitude = latitude;
			return this;
		}

		public Builder longitude(double longitude) {
			this.longitude = longitude;
			return this;
		}

		public Builder elevation(double elevation) {
			this.elevation = elevation;
			return this;
		}

		public Builder hdop(double hdop) {
			this.hdop = hdop;
			return this;
		}

		public Builder dataAvailable(int dataAvailable) {
			this.dataAvailable = dataAvailable;
			return this;
		}

		public Builder zeroValidated(int zeroValidated) {
			this.zeroValidated = zeroValidated;
			return this;
		}

		public Builder wptValidated(int wptValidated) {
			this.wptValidated = wptValidated;
			return this;
		}

		public Builder lat0(double lat0) {
			this.lat0 = lat0;
			return this;
		}

		public Builder lon0(double lon0) {
			this.lon0 = lon0;
			return this;
		}

		public Builder latFuse(double latFuse) {
			this.latFuse = latFuse;
			return this;
		}

		public Builder lonFuse(double lonFuse) {
			this.lonFuse = lonFuse;
			return this;
		}

		public Builder gpsState(long gpsState) {
			this.gpsState = gpsState;
			return this;
		}

		public GPSData build() {
			return new GPSData(this);
		}
	}

	private GPSData(Builder builder) {
		this.latitude = builder.latitude;
		this.longitude = builder.longitude;
		this.elevation = builder.elevation;
		this.hdop = builder.hdop;
		this.dataAvailable = builder.dataAvailable;
		this.zeroValidated = builder.zeroValidated;
		this.wptValidated = builder.wptValidated;
		this.lat0 = builder.lat0;
		this.lon0 = builder.lon0;
		this.latFuse = builder.latFuse;
		this.lonFuse = builder.lonFuse;
		this.gpsState = builder.gpsState;
	}
}
