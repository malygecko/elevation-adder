package elevationadder.file;

import java.io.File;
import java.util.Collection;

import elevationadder.elevation.ICoordinate;

/**
 * Reads coordinates from file one per line.
 * 
 * @author malygecko
 *
 */
public interface ICoordinateFileReader {

	/**
	 * @param file
	 *            with coordinates
	 * @return coordinates
	 */
	Collection<ICoordinate> read(File file);
}
