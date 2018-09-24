package junitest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class CalcTest {
	
	
     
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
    @DisplayName("test 1") 
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Calc1 ob=new Calc1();
        Assertions.assertEquals( 4 , ob.add(2, 2));
        
    }
     
    @Test
    @DisplayName("test 2")
    void testCalcTwo()
    {
    	 Calc1 ob=new Calc1();
        System.out.println("======TEST TWO EXECUTED=======");
       // Assertions.assertNotEquals(5, ob.add(2, 2));
       // Assertions.assertNull(ob.add(2, 2));
          //Assertions.assertTrue(ob.add1(2, 2));
        Assertions.assertFalse(ob.add1(2, 2));
        
        
    }
     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
