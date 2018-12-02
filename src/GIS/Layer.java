package GIS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/**
 * @author Ortal and Tomer
 * Using HashSet functions
 */

public class Layer implements GIS_layer  {
	private HashSet<GIS_element> hs; //Creating a HashSet of elements

	/**
	 *Copy builder
	 */
	public Layer(HashSet<GIS_element> hs) {
		this.hs=hs;
	}

	/*
	 * Default builder
	 */
	public Layer() {
		this.hs=new HashSet<GIS_element>();
	}

	/**
	 * @param arg0
	 * @returns true if the element has been added 
	 */
	@Override
	public boolean add(GIS_element arg0) {
		return hs.add((Element)arg0);
	}

	/**
	 * @param arg0
	 * @returns true if all elements have been added 
	 */
	@Override
	public boolean addAll(Collection<? extends GIS_element> arg0) {
		return hs.addAll(arg0);
	}

	/**
	 *removes all elements from this HashSet 
	 */
	@Override
	public void clear() {
		hs.clear();
	}

	/**
	 *@param arg0
	 *@returns true if the element found in the hashset 
	 */
	@Override
	public boolean contains(Object arg0) {
		return hs.contains(arg0);
	}

	/**
	 * @param arg0
	 * @returns true if all the elements found in the hashset 
	 */
	@Override
	public boolean containsAll(Collection<?> arg0) {
		return hs.containsAll(arg0);
	}

	/**
	 * Checks if this HashSet got no elements in it 
	 */
	@Override
	public boolean isEmpty() {
		return hs.isEmpty();
	}

	/**
	 *@returns Iterator of this hashset
	 */
	@Override
	public Iterator<GIS_element> iterator() {
		return hs.iterator();
	}

	/**
	 * @param arg0
	 * @return true if arg0 element removed from this HashSet 
	 */
	@Override
	public boolean remove(Object arg0) {
		return hs.remove(arg0);
	}

	/**
	 * @param arg0
	 * @return true if all arg0 elements removed this HashSet 
	 */
	@Override
	public boolean removeAll(Collection<?> arg0) {
		return hs.removeAll(arg0);
	}

	/**
	 *@param arg0
	 * @return true if all arg0 elements retains in this HashSet 
	 */
	@Override
	public boolean retainAll(Collection<?> arg0) {
		return hs.retainAll(arg0);
	}

	/**
	 *Returns the size of this HashSet 
	 */
	@Override
	public int size() {
		return hs.size();
	}

	/**
	 *Convert to array this HashSet 
	 */
	@Override
	public Object[] toArray() {
		return hs.toArray();
	}

	/**
	 *Convert to T[]array this HashSet 
	 */
	@Override
	public <T> T[] toArray(T[] arg0) {
		return hs.toArray(arg0);
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


	@Override
	public String toString() {
		return "Layer :hs=" + hs +"\n"  ;
	}

}