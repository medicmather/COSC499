import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//testing 
public class AnimalTest {
	  static Animals bill, ben, bob;

	    @BeforeAll
	    static void initialize(){
	        bob = new Animals(18, "bob", new String []{"monkey"});
	        bill = new Animals(19, "bill", new String []{"hippo"});
	        ben = new Animals(24, "ben", new String []{"grator"});
	    }
	    
		@Test
		void testGetName() {
			assertEquals(bob.getName(),"bob");
			assertEquals(bill.getName(),"bill");
			assertEquals(ben.getName(),"ben");
		}

		@Test
		void testGetAge() {
			assertEquals(bob.getAge(),18);
			assertEquals(bill.getAge(),19);
			assertEquals(ben.getAge(),24);
		}
		
	}