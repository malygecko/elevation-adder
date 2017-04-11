package elevationadder.file;

import com.opencsv.bean.CsvBindByName;

/**
 * One line of file with coordinates.
 * 
 * @author malygecko
 *
 */
public class CoordinateFileLine {

	@CsvBindByName
	private double longitude;
	@CsvBindByName
	private double latitude;
	@CsvBindByName
	private double elevation;

	/**
	 * @return longitude in degrees
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @return latitude in degrees
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @return elevation in meters
	 */
	public double getElevation() {
		return elevation;
	}

}
