
package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

    // declare myArrayAndArrayList which is the object for testing
    ArrayAndArrayList myArrayAndArrayList;

    @BeforeEach
    void setUp() throws Exception {
        // initialize myArrayAndArrayList for testing
        this.myArrayAndArrayList = new ArrayAndArrayList();
    }

    /**
     * Test howMany method in ArrayAndArrayList.
     */
    @Test
    void testHowMany() {
        // element in the array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));

        // TODO write at least 3 additional test cases
        int[] first = {7,7,7};
        assertEquals(3,this.myArrayAndArrayList.howMany(first,7));

        assertEquals(0,this.myArrayAndArrayList.howMany(first, 3));

        int[] second = {1,0,2,0,3,0,4,0,5,0};
        assertEquals(5,this.myArrayAndArrayList.howMany(second, 0));
    }

    /**
     * Test findMax method in ArrayAndArrayList.
     */
    @Test
    void testFindMax() {
        // findMax in an nonEmpty array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(9, this.myArrayAndArrayList.findMax(array));

        // TODO write at least 3 additional test cases
        int[] first = new int[0];
        assertEquals(-1,this.myArrayAndArrayList.findMax(first));

        int[] second = {100, 10000, 2,10,111};
        assertEquals(10000, this.myArrayAndArrayList.findMax(second));

        assertNotEquals(111, this.myArrayAndArrayList.findMax(second));

        int[] third = {1,1,1,1,1,1,};
        assertEquals(1, this.myArrayAndArrayList.findMax(third));
    }

    /**
     * Test maxArray method in ArrayAndArrayList.
     */
    @Test
    void testMaxArray() {
        // test a valid array.
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));

        // TODO write at least 3 additional test cases
        int [] first = {0,0,0,1};
        ArrayList<Integer> testFirst = new ArrayList<Integer>();
        testFirst.add(1);
        assertEquals(testFirst, this.myArrayAndArrayList.maxArray(first));

        int [] second = {0,1,0,0,1};
        ArrayList<Integer> testSecond = new ArrayList<Integer>();
        testSecond.add(1);
        testSecond.add(1);
        assertEquals(testSecond, this.myArrayAndArrayList.maxArray(second));

        int[] third = {1,2,3,4,5,6,7,10};
        ArrayList<Integer> testThird = new ArrayList<Integer>();
        testThird.add(10);
        assertEquals(testThird,this.myArrayAndArrayList.maxArray(third));





    }

    /**
     * Test swapZero method in ArrayAndArrayList.
     */
    @Test
    void testSwapZero() {
        // test an array containing 0
        int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
        int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
        this.myArrayAndArrayList.swapZero(array);
        assertArrayEquals(testArray, array);


        // TODO write at least 3 additional test cases
        int [] first = {1,0,0,1,1,0,1};
        int [] testFirst = {1,1,1,1,0,0,0};
        this.myArrayAndArrayList.swapZero(first);
        assertArrayEquals(testFirst,first);

        int [] second = {0,0,0,3};
        int [] testSecond = {3,0,0,0};
        this.myArrayAndArrayList.swapZero(second);
        assertArrayEquals(testSecond, second);

        int [] third = {1,2,3};
        int [] testThird = {1,2,3};
        this.myArrayAndArrayList.swapZero(third);
        assertArrayEquals(testThird, third);
    }
}