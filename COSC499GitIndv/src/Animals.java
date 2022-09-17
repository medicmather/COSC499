
public class Animals {
    private int age;
    private String name;
    private String[] species;

    public Animals(int age,String name, String[] species){
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public String[] getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
    	return name;
    }
}