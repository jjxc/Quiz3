package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Triangle;

	public class testTri {
	
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}
	
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}
	
		@Before
		public void setUp() throws Exception {
		}
	
		@After
		public void tearDown() throws Exception {
		}
	
		@Test
		public void AreaTrue1() {
			Triangle t = new Triangle(3, 4, 5);
			assertTrue(t.getArea() == 6);	
		}
		
		@Test
		public void AreaFalse1() {
			Triangle t = new Triangle(2, 3, 4);
			assertFalse(t.getArea() == 6);
		}
		
		@Test
		public void AreaTrue2() {
			Triangle t = new Triangle(5, 10, 10);
			assertTrue(t.getArea() == 12.5);
		}
		
		@Test
		public void AreaFalse2() {
			Triangle t = new Triangle(5, 10, 10);
			assertTrue(t.getArea() == 20);
		}
		
		@Test
		public void PerimeterTrue1(){
			Triangle t = new Triangle(4, 5, 6);
			assertTrue(t.getPerimeter() == 15);
		}
		
		@Test
		public void PerimeterFalse1(){
			Triangle t = new Triangle(4, 5, 6);
			assertTrue(t.getPerimeter() == 10);
		}
		
		@Test
		public void PerimeterTrue2(){
			Triangle t = new Triangle(7, 8, 9);
			assertTrue(t.getPerimeter() == 24);
		}
		
		@Test
		public void PerimeterFalse2(){
			Triangle t = new Triangle(10, 15, 20);
			assertTrue(t.getPerimeter() == 24);
		}
	}