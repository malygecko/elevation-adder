package elevationadder.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import elevationadder.elevation.Coordinate;
import elevationadder.elevation.ICoordinate;

/**
 * Simple CSV reader for coordinate files.
 * 
 * @author malygecko
 *
 */
public final class CSVCoordinateFileReader implements ICoordinateFileReader {

	@Override
	public Collection<ICoordinate> read(File file) {

		HeaderColumnNameMappingStrategy<CoordinateFileLine> strategy =
				new HeaderColumnNameMappingStrategy<>();
		strategy.setType(CoordinateFileLine.class);
		CsvToBean<CoordinateFileLine> csvToBean = new CsvToBean<>();
		List<CoordinateFileLine> coordinateLines =
				csvToBean.parse(strategy, createReader(file));
		List<ICoordinate> coordinates = coordinateLines.stream()
				.map(cl -> new Coordinate(cl.getLongitude(), cl.getLatitude()))
				.collect(Collectors.toList());
		return coordinates;

	}

	private CSVReader createReader(File file) {
		try {
			return new CSVReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Cannot find file: " + file.getName(),
					e);
		}
	}

}
