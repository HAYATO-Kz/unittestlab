import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class for count elements and find index of element
 * @author Hayato Kawai
 */
public class ListUtil {
	/**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
	public static int countUnique ( List < ? > list ) {
		List<Object> list2 = new ArrayList<> () ;
		for(int i = 0 ; i < list.size() ; i++) {
			Object value =   list.get(i) ;
			if( list2.indexOf(value) == -1 ) list2.add( value);
		}
		int count = list2.size();
		return count ;
		}

	/**
	 * Sort array and return index of element that input
	 * @param array a array of elements
	 * @param element element that user want to find index
	 * @return index of element
	 */
	public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
		final int notFound = -1 ;
		if(element == null) throw new IllegalArgumentException("Search element must not be null");
		Arrays.sort(array);
		int low = 0;
		int high = array.length - 1 ;
		int mid ;
		T ele ;
		while(low <= high) {
			mid = (low + high) / 2 ;
			ele =  array[mid];
			int compare = element.compareTo(ele);
			if( compare > 0) low = mid + 1;
			else if ( compare < 0  ) high = mid -1 ;
			else {
				return mid ;
			}
		}
		return notFound;
	}
	
	public static void main (String args[]) {
		String i = "a";
		String j = "b" ;
		Integer x = 1;
		Integer y = 2;
		System.out.println(i.compareTo(j));
		System.out.println(x.compareTo(y));
	}
}

	
