import java.util.ArrayList;
import java.util.List;

/**
 * Class for count elements
 * @author Hayato Kawai
 */
public class ListUtil {
	/**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * TODO: can the list contain null values? Does null count as a unique element?
     *
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
}

	
