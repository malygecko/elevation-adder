package elevationadder.elevation;

/**
 * Provides elevation for input location.
 * 
 * @author malygecko
 *
 */
public interface IElevationProvider {

	/**
	 * @param location
	 *            in WG84
	 * @return elevation in meters
	 */
	double getElevation(ICoordinate location);

}
