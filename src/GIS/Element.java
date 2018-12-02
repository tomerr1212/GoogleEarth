package GIS;


import Geom.Geom_element;
import Geom.Point3D;
/**
 * @author Ortal and Tomer
 */
public class Element implements GIS_element {
	private MData md ;
	private Point3D p;

	@Override
	public Geom_element getGeom() {
		return p;
	}

	/**
	 * Printing the MData and the Point3D of this element
	 */
	public String toString() {
		return "Element [md=" + md + ", p=" + p + "]";
	}

	public Element(MData md, Point3D p) {
		this.md = md;
		this.p = p;
	}
	public Element() {
		md = new MData();
		p = new Point3D();
	}

	@Override
	public Meta_data getData() {
		return md;
	}
	/**
	 * @param vec
	 * @return adding point to vector
	 */
	@Override
	public void translate(Point3D vec) {
		vec.add(p);
	}


	public MData getMd() {
		return md;
	}


	public void setMd(MData md) {
		this.md = md;
	}


	public Point3D getP() {
		return p;
	}

	public void setP(Point3D p) {
		this.p = p;
	}
	/**
	 * @param el
	 * @return true the two elements are equals
	 */
	public boolean equals(Element el) {
		if(this.md.equals(el.md) && this.p.equals(el.p))return true;
		return false;
	}
}