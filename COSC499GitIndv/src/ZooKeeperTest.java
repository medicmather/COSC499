import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ZooKeeperTest {
	   static ZooKeeper james, jim, joe;

	    @BeforeAll
	    static void initialize(){
	    	james = new ZooKeeper(34, "James Maher", new String []{"monkey"});
	    	jim = new ZooKeeper(54, "Jim Cosby", new String []{"hippo"});
	    	joe = new ZooKeeper(36, "Joe Mckenny", new String []{"grator"});
	    }
	    
		@Test
		void testGetNames() {
			assertEquals(james.getName(),"James Maher");
			assertEquals(jim.getName(),"Jim Cosby");
			assertEquals(joe.getName(),"Joe Mckenny");
		}
		@Test
		void testGetAge() {
			assertEquals(james.getAge(),34);
			assertEquals(jim.getAge(),54);
			assertEquals(joe.getAge(),36);
		}
}