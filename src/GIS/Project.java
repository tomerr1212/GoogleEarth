package GIS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/**
 * @author Ortal and Tomer
 */
public class Project implements GIS_project {

	private HashSet<GIS_layer> la; //Creating a HashSet of Layers

	/**
	 *Copy builder 
	 */
	public Project(HashSet<GIS_layer> la) {
		this.la=la;
	}

	/**
	 * Default builder
	 */
	public Project() {

		this.la = new HashSet<GIS_layer>();
	}


	@Override
	public String toString() {
		return "Project [la=" + la + "]\n";
	}


	public HashSet<GIS_layer> getLa() {
		return la;
	}

	/**
	 * @param e
	 * @returns true if the Layer has been added 
	 */
	@Override
	public boolean add(GIS_layer e) {
		return la.add(e);
	}

	/**
	 * @param c
	 * @returns true if all Layers have been added 
	 */
	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return la.addAll(c);
	}

	/**
	 *removes all Layers from this HashSet 
	 */
	@Override
	public void clear() {
		la.clear();
	}

	/**
	 *@param o
	 *@returns true if the Layer found in the hashset 
	 */
	@Override
	public boolean contains(Object o) {
		return la.contains(o);
	}

	/**
	 * @param c
	 * @returns true if all the Layers found in the hashset 
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		return la.containsAll(c);
	}
	/**
	 * Checks if this HashSet got no Layers in it 
	 */
	@Override
	public boolean isEmpty() {
		return la.isEmpty();
	}

	/**
	 *Creates iterator for this HashSet 
	 */
	@Override
	public Iterator<GIS_layer> iterator() {
		return la.iterator();
	}

	/**
	 * @param o
	 * @return true if o Layer removed from this HashSet 
	 */
	@Override
	public boolean remove(Object o) {
		return la.remove(o);
	}

	/**
	 * @param c
	 * @return true if all c Layers removed this HashSet 
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		return la.removeAll(c);
	}

	/**
	 *@param c
	 * @return true if all c Layers retains in this HashSet 
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		return la.retainAll(c);
	}

	/**
	 *Returns the size of this HashSet 
	 */
	@Override
	public int size() {
		return la.size();
	}

	/**
	 *Convert to array this HashSet 
	 */
	@Override
	public Object[] toArray() {
		return la.toArray();
	}

	/**
	 *Convert to T[]array this HashSet 
	 */
	@Override
	public <T> T[] toArray(T[] a) {
		return la.toArray(a);
	}

	/**
	 *time is how long it took to open the kml
	 *String s is representing the name 
	 */
	@Override
	public Meta_data get_Meta_data() {
		MData md = new MData ();
		String s="";
		s=s+md.getName();
		long time = 0;
		time = time + md.getTimestamp();

		return md;
	}

}