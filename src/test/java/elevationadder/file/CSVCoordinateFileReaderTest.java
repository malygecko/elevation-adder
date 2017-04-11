package elevationadder.file;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import elevationadder.elevation.Coordinate;
import elevationadder.elevation.ICoordinate;

public class CSVCoordinateFileReaderTest {

	private File testCSVFile;

	@Before
	public void setFile() {

		testCSVFile = new File(CSVCoordinateFileReaderTest.class
				.getResource("inputCoordinates.csv").getFile());

	}

	@Test
	public void testRead() {

		CSVCoordinateFileReader aReader = new CSVCoordinateFileReader();
		Collection<ICoordinate> aCoordinates = aReader.read(testCSVFile);
		assertThat(aCoordinates).hasSize(1);
		ICoordinate expected = new Coordinate(14.027611, 50.787777);
		assertThat(aCoordinates.iterator().next()).isEqualTo(expected);

	}

}
