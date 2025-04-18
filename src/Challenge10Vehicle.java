public abstract class Challenge10Vehicle {
    protected int numberOfWheels;
    protected String name;
    public int getNumberOfWheels(){
        // System.out.println(numberOfWheels);
        return numberOfWheels;
    }

    public String getName(){
        return name;
    }

    public void setNumberOfWheels(int wheels){
        this.numberOfWheels = wheels;
    }

    public void setName(String nameChoice){
        this.name = nameChoice;
    }
}
