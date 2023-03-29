package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void testArrayList1(){
        ArrayList<Integer> list = new ArrayList<>();
        Integer addThing = 0;
        list.add(addThing);

        Assert.assertTrue(list.contains(addThing));
    }


    @Test
    public void testHashSet(){
        HashSet<String> set = new HashSet<>();
        String addThing ="David is cool";
        set.add(addThing);

        Assert.assertTrue(set.contains(addThing));
    }

    @Test
    public void testHashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("David", 1);

        Assert.assertTrue(map.containsKey("David") && map.containsValue(1));
    }
    @Test
    public void testLinkedList(){
        LinkedList<Integer> Seth = new LinkedList<>();
        Seth.add(1);

        Assert.assertTrue(Seth.contains(1));
    }
    @Test
    public void testDeque(){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        Integer expected = 3;

        Assert.assertEquals(expected, deque.getLast());
    }

    @Test
    public void testVector(){
        Vector<String> vec = new Vector<>();
        vec.add("Tim");
        vec.add("Jim");
        vec.add("Kim");
        vec.add("Tim1");
        vec.add("Jim1");
        vec.add("Kim1");
        vec.add("Tim2");
        vec.add("Jim2");
        vec.add("Kim2");
        vec.add("Tim3");
        vec.add("Jim3");
        int expected = 20;
        // Equals 20 because Vector grows capcity in increments of 10
        Assert.assertEquals(expected, vec.capacity());
    }
    
}
