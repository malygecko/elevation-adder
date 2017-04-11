package elevationadder.elevation;

/**
 * A WGS84 coordinate with longitude, latitude.
 * 
 * @author malygecko
 *
 */
public interface ICoordinate {

	/**
	 * @return longitude in degrees
	 */
	double getLongitude();

	/**
	 * @return latitude in degrees
	 */
	double getLatitude();

}
