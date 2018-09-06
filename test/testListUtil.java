import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

/**
 * Class for test ListUtil
 * @author Hayato Kawai
 */
public class testListUtil {

	@Test
	public void testEmtyList() {
	List <?> list = new ArrayList<>();
	assertEquals( 0 , ListUtil.countUnique(list) ) ;
	}

	@Test
	public void testListSizeOne() {
	assertEquals( 1 , ListUtil.countUnique( makeList("one") ) ) ;
	}

	@Test
	public void testListofTwoItemManyOrders() {
	assertEquals( 2, ListUtil.countUnique ( makeList ("a" ,"b" ) ) ) ;
	assertEquals( 2, ListUtil.countUnique ( makeList ("a" , "b" , "b" , "a", "b" ) ) ) ;
	}
	
	@Test
	public void testListofOneItemManyOrders() {
		assertEquals( 1, ListUtil.countUnique( makeList ("a", "a") ) ) ;
	}
	
	@Test
	public void testListofNumbert () {
		assertEquals( 3, ListUtil.countUnique(makeList (1 ,2 ,3 ,2 ,1) ) ) ;
	}
	
	@Test
	public void testAddNull () {
		List <?> list = new ArrayList <> () ;
		list.add(null);
		assertEquals( 1, ListUtil.countUnique(list) ) ;
	}
	
	@Test
	public void testAddDifferentType () {
		assertEquals( 3, ListUtil.countUnique(makeList ("a", "1" , 1) ) ) ;
	}
	
	private List <?> makeList (Object ... element ) {
		 return Arrays.asList(element);
	}
} 
