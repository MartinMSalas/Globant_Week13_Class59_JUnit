package entities;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.RectangleService;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    RectangleService rs;
    public RectangleTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }

//    @Before
//    public void setUp() {
//        rs = new RectangleService();
//    }
    @BeforeEach
    void setUp() {
        rs = new RectangleService();
    }

    @AfterEach
    void tearDown() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void haveInitialColor(){
        Rectangle rectangle = new Rectangle(10,10);
        //assertEquals("Red", rectangle.getColor());
        assertNotNull(rectangle.getColor());
    }
    @Test
    public void shouldCalculateArea(){
        Rectangle rectangle = new Rectangle(10,10);
        //rs = new RectangleService();
        System.out.println(rs);
        assertEquals(25, rs.calculateArea(new Rectangle(5,5)),0);
        assertEquals(100, rs.calculateArea(new Rectangle(10,10)),0);
        assertEquals(500, rs.calculateArea(new Rectangle(10,50)),0);
    }
    @Test
    public void shouldCalculatePerimeter(){
        Rectangle rectangle = new Rectangle(10,10);
        //rs = new RectangleService();
        assertEquals(20, rs.calculatePerimeter(new Rectangle(5,5)),0);
        assertEquals(40, rs.calculatePerimeter(new Rectangle(10,10)),0);
        assertEquals(120, rs.calculatePerimeter(new Rectangle(10,50)),0);
    }
    @Test
    public void shouldActivateOrDesactivate(){
        Rectangle rectangle = new Rectangle(10,10);
        //rs = new RectangleService();
        assertTrue(rectangle.isActive());
        rectangle.setActive(false);
        assertFalse(rectangle.isActive());
        rectangle.setActive(true);
        assertTrue(rectangle.isActive());
    }
}