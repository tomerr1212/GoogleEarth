package Coords;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import Geom.Point3D;
/**
 * 
 * @author Ortal of Tomer
 *
 */
class MyCoordsTest {

	Point3D p0 = new Point3D(32.103315,35.209039,670);
	Point3D p1 = new Point3D(32.106352,35.205225,650);
	Point3D vecM = new Point3D(337.6989921,-359.2492069,-20);
	MyCoords vec = new MyCoords();


	@Test
	void testAdd() {
		Point3D ans = new Point3D(32.10635199999893,35.205225000003225,650);
		assertTrue(ans.equals(vec.add(p0, vecM)));
	}

	@Test
	void testDistance3d() {
		assertEquals(493.052,vec.distance3d(p0, p1),0.1);

	}

	@Test
	void testVector3D() {

		Point3D ans = new Point3D(337.69899206128815,-359.24920693881893,-20.0);

		assertTrue(ans.equals(vec.vector3D(p0, p1)));
	}

	@Test
	void testAzimuth_elevation_dist() {
		double ans[] =  {313.229882305353, -89.98603287888018, 493.0523318324134};
		double array[] =vec.azimuth_elevation_dist(p0, p1);
		assertEquals(Arrays.toString(ans),Arrays.toString(array));
	}

	@Test
	void testIsValid_GPS_Point() {
		assertTrue(vec.isValid_GPS_Point(p0)&&vec.isValid_GPS_Point(p0));
	}

}
