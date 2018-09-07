import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

/**
 * Class for test ListUtil
 * 
 * @author Hayato Kawai
 */
public class testListUtil {

	@Test
	public void testEmtyList() {
		List<?> list = new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}

	@Test
	public void testListSizeOne() {
		assertEquals(1, ListUtil.countUnique(makeList("one")));
	}

	@Test
	public void testListofTwoItemManyOrders() {
		assertEquals(2, ListUtil.countUnique(makeList("a", "b")));
		assertEquals(2, ListUtil.countUnique(makeList("a", "b", "b", "a", "b")));
	}

	@Test
	public void testListofOneItemManyOrders() {
		assertEquals(1, ListUtil.countUnique(makeList("a", "a")));
	}

	@Test
	public void testListofNumbert() {
		assertEquals(3, ListUtil.countUnique(makeList(1, 2, 3, 2, 1)));
	}

	@Test
	public void testListContainNull() {
		List<?> list = new ArrayList<>();
		list.add(null);
		assertEquals(1, ListUtil.countUnique(list));
	}

	@Test
	public void testAddDifferentType() {
		assertEquals(3, ListUtil.countUnique(makeList("a", "1", 1)));
	}

	@Test
	public void testNormalBinarySearh() {
		String[] array = { "d", "r", "a", "o" };
		Integer[] array2 = { 2, 1, 3, 4, 5 };
		String[] array3 = { "a", "d", "o", "r" };
		Integer[] array4 = { 1, 2, 3, 4, 5 };
		assertEquals(2, ListUtil.binarySearch(array, "o"));
		assertEquals(1, ListUtil.binarySearch(array2, 2));
		assertEquals(1, ListUtil.binarySearch(array3, "d"));
		assertEquals(1, ListUtil.binarySearch(array4, 2));
	}

	@Test
	public void testNotFoundBinarySearh() {
		String[] array = { "d", "r", "a", "o" };
		Integer[] array2 = { 2, 1, 3, 4, 5 };
		String[] array3 = { "a", "d", "o", "r" };
		Integer[] array4 = { 1, 2, 3, 4, 5 };
		assertEquals(-1, ListUtil.binarySearch(array, "z"));
		assertNotEquals(1, ListUtil.binarySearch(array, "z"));
		assertEquals(-1, ListUtil.binarySearch(array2, 123));
		assertEquals(-1, ListUtil.binarySearch(array3, "z"));
		assertEquals(-1, ListUtil.binarySearch(array4, 123));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindNull() {
		String[] array = { "a", "o", "g" };
		assertEquals("d", ListUtil.binarySearch(array, null));
		Integer[] array2 = { 9, 2, 5 };
		assertEquals("d", ListUtil.binarySearch(array, null));
	}

	private List<?> makeList(Object... element) {
		return Arrays.asList(element);
	}
}
