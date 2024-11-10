public class Truck implements Vehicle{
    private String type;
    private int week;

    public Truck(String type, int week){
        this.type = type;
        this.week = week;
    }
    @Override
    public double calculateRentalCost() {
        return 500*week;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + getType()+"\nWeekly Rate Rate: $500.0 "+"\nRental Cost: $"+calculateRentalCost());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
