package ru.zapryagaev.lab5.classes;
import org.junit.Test;
import static org.junit.Assert.*;
/**Класс для тестирования класса Quadrangle
*/

public class QuadrangleTest {
    
   @Test
           public void testValues(){
    Quadrangle q=new Quadrangle(1,1,5,8,7,9,4,1,5,6,7,2);
        assertEquals(1,q.getX0(),0.0000001);
        assertEquals(1,q.getY0(),0.0000001);
        assertEquals(5,q.getZ0(),0.0000001);
        assertEquals(8,q.getX1(),0.0000001);
        assertEquals(7,q.getY1(),0.0000001);
        assertEquals(9,q.getZ1(),0.0000001);
        assertEquals(4,q.getX2(),0.0000001);
        assertEquals(1,q.getY2(),0.0000001);
        assertEquals(5,q.getZ2(),0.0000001);
        assertEquals(6,q.getX3(),0.0000001);
        assertEquals(7,q.getY3(),0.0000001);
        assertEquals(2,q.getZ3(),0.0000001);
        assertEquals(27.329985510401407,q.getPerimeter(),0.0000001);
        assertEquals("Четырехугольник",q.getName());
    }
    
    @Test
    public void testMove() {
       Quadrangle q=new Quadrangle(1,1,5,8,7,9,4,1,5,6,7,2); 
      Point p=new Point(1,1,1);
        q.move(p);      
        assertEquals(-2.75,q.getX0(),0.0000001);
        assertEquals(-2.0,q.getY0(),0.0000001);
        assertEquals(0.75,q.getZ0(),0.0000001);
        assertEquals(4.25,q.getX1(),0.0000001);
        assertEquals(4.0,q.getY1(),0.0000001);
        assertEquals(4.75,q.getZ1(),0.0000001);
        assertEquals(0.25,q.getX2(),0.0000001);
        assertEquals(-2.0,q.getY2(),0.0000001);
        assertEquals(0.75,q.getZ2(),0.0000001);
        assertEquals(2.25,q.getX3(),0.0000001);
        assertEquals(4.0,q.getY3(),0.0000001);
        assertEquals(-2.25,q.getZ3(),0.0000001);
    }
    
    @Test
    public void testSymmetry(){
       Quadrangle q=new Quadrangle(1,1,5,8,7,9,4,1,5,6,7,2); 
        q.simetry();
        assertEquals(-1,q.getX0(),0.0000001);
        assertEquals(-1,q.getY0(),0.0000001);
        assertEquals(-5,q.getZ0(),0.0000001);
        assertEquals(-8,q.getX1(),0.0000001);
        assertEquals(-7,q.getY1(),0.0000001);
        assertEquals(-9,q.getZ1(),0.0000001);
        assertEquals(-4,q.getX2(),0.0000001);
        assertEquals(-1,q.getY2(),0.0000001);
        assertEquals(-5,q.getZ2(),0.0000001);
        assertEquals(-6,q.getX3(),0.0000001);
        assertEquals(-7,q.getY3(),0.0000001);
        assertEquals(-2,q.getZ3(),0.0000001);   
    }
}
