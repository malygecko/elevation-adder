package elevationadder.file;

import java.io.File;
import java.util.Collection;

import elevationadder.elevation.ICoordinate;

/**
 * Writes coordinates one per line into an output file.
 * 
 * @author malygecko
 *
 */
public interface ICoordinateFileWriter {

	/**
	 * @param coordinates
	 *            in WGS84
	 * @param outputFile
	 *            output file
	 */
	void write(Collection<ICoordinate> coordinates, File outputFile);
}
