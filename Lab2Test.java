import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;


class Lab2Test {
	
	assertNotEqualsClass a = new assertNotEqualsClass();
	ArraySorter as = new ArraySorter();
	EvenChecker ec = new EvenChecker();
	ListRemover lr = new ListRemover();
	AssertNullClass anc = new AssertNullClass();
	ListExercise le = new ListExercise();
	
	@Test
	void assertNotEqualsTest() {
		String user1 = a.idGenerator();
		String user2 = a.idGenerator();
		assertNotEquals(user1, user2);
	}
	
	@Test
	void arraySorterTest() {
		int array1[] = {3,4,2,5};
		int array2[] = Arrays.copyOf(array1, array1.length);
		as.sortArray(array2);
		assertNotEquals(array1, array2);
	}
	
	@Test 
	void assertTrueTest() {
		assertTrue(ec.isEven(10));
	}
	
	@Test 
	void assertFalseTest() {
		List<String> list1 = new ArrayList<>();	
		list1.add("java");
		list1.add("python");
		list1.add("java");
		lr.removeItem(list1, "python");
		assertFalse(list1.contains("python"));
	}
	
	@Test
	void assertNullTest() {
		anc.assertN(anc);
	}
	
	@Test
	void assertNotNullTest() {
		anc.assertNotN(anc);
	}
	
	@Test
	void ListRemovalTest() {
		List<String> list2 = new ArrayList<>();
		list2.add("test");
		list2.add("test1");
		list2.add("test2");
		list2.add("test3");
		List<String> listcopy = new ArrayList<>();
		listcopy.addAll(list2);
		assertNotEquals(listcopy, le.ListRemoval(list2));
	}
	
	@Test
	void UserExerciseTest1() {
		User user1 = new User();
		String name = user1.getName();
		assertNull(name);
	}
	
	@Test
	void UserExerciseTest2() {
		User user2 = new User();
		assertNull(user2.getName());
	}
	

	@Test
	void UserExerciseTest3() {
		List<User> users = null;
		assertNull(users);
	}
	
	

}
