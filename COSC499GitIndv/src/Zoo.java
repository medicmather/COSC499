
public class Zoo {
	   private Animals[] animals;
	    private ZooKeeper keeper;
	    private String cageCode;

	    public Zoo(Animals[] animals, ZooKeeper keeper, String cageCode){
	        this.animals = animals;
	        this.keeper = keeper;
	        this.cageCode = cageCode;
	    }
	    
	    public ZooKeeper getKeeper(){
	        return keeper;
	    }
	    
	    public String getCageCode(){
	        return cageCode;
	    }

	    public Animals[] getAnimals(){
	        return animals;
	    }

	}