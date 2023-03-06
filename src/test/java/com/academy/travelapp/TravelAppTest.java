package com.academy.travelapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

final class ProcessorTest implements Processor {
	public void process(ResultSet results) {
		try {
			// Would normally next in while loop
			assertTrue(results.next());
			
			// Test hello column data	
			String hello = results.getString("hello");
			assertTrue(hello.equals("Academy"));
			
			// Test world column data
			String world = results.getString("world");
			assertTrue(world.equals("Cool"));
			
			// Should be no more rows
			assertFalse(results.next());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(false);
		}
	}
}

public class TravelAppTest {
    /*@Test
    public void shouldReadAndWrite() {
		try (TravelAppDB db = new TravelAppDB(); TravelApp app = new TravelApp()) {			
			app.write("CREATE TABLE IF NOT EXISTS hi(hello VARCHAR(10), world VARCHAR(10))");
			app.write("INSERT INTO hi (hello, world) VALUES ('Academy', 'Cool')");
			app.read(new ProcessorTest(), "SELECT hello, world FROM hi");
			app.write("DROP TABLE hi");
	        assertTrue(true);
		}
    }*/
	@Test
	public void writeCustomer() {
		new Customers("Cat Orr", "Blackburn");
		assertTrue(true);
	}


	@Test
	public void sanityCheckNewTakeaway() {
		/*takeaways bigmama = new takeaways ("Big Mama's","Pizza","Clitheroe");
		takeaways pizzadelicious = new takeaways ("Pizza Delicious", "Pizza", "Falmouth");
		takeaways dinos = new takeaways ("Dino's", "Chip Shop", "Blackpool");
		Customers harvey = new Customers ("Harvey", "Skegness", "Favourites");*/
//	
//		harvey.addFavourite(bigmama);
//		harvey.addFavourite(pizzadelicious);
//		harvey.addFavourite(dinos);
		
		Customers john = new Customers("John", "Skegness");
		Customers peter = new Customers("Peter", "Blackpool");
		Customers reg = new Customers("Reginald", "Clitheroe");
		takeaways bigmamas = new takeaways("Big Mama's", "Pizza", "Clitheroe");
		
		john.addFavourite(bigmamas);
		peter.addFavourite(bigmamas);
		reg.addFavourite(bigmamas);
		
		List<Customers> customers =
		
//
//		List<takeaways> favourites = harvey.addFavourite();
//	
//	assertTrue(takeaways.size() == 3);
//	assertTrue(takeaways.get(index:0).getName().equal("Big Mama's");
//	assertTrue(takeaways.get(index:1).getName().equal("Peter");
//	assertTrue(takeaways.get(index:2).getName().equal("Reginald");
	}
}

	
