public class Car implements Vehicle {
    private int days;
    private String model;
    private int dailyRate=50;
    public Car(String model, int days) {
        this.days = days;
        this.model = model;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDays() {
        return days;
    }
    public String getModel() {
        return model;
    }

    @Override
    public double calculateRentalCost() {
        return 50*getDays();
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + getModel()+"\nDaily Rental Rate: $50 "+"\nRental Cost: $"+calculateRentalCost());
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
