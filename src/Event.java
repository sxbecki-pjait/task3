public class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats = 100;
    private int availableSeats = 100;
    private double price;
    Event(String name, double price){
        this.name = name;
        this.price = price;
    }
    Event(String name, double price, String date){
        this.name = name;
        this.price = price;
        this.date = date;
    }

    Event(String name, double price, String date, String location){
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
    }

    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getLocation(){
        return location;
    }
    public int getMaxNumberOfSeats(){
        return maxNumberOfSeats;
    }
    public int getAvailableSeats(){
        return availableSeats;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setMaxNumberOfSeats(int maxNumberOfSeats){
        this.maxNumberOfSeats = maxNumberOfSeats;
    }
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        String returning = "";
        if(name != null){
            returning += "Name: " + name + "\n";
        }
        if(date != null){
            returning += "Date: " + date + "\n";
        }
        if(location != null){
            returning += "Location: " + location + "\n";
        }
        if(maxNumberOfSeats > 0){
            returning += "Max seats: " + maxNumberOfSeats + "\n";
        }
        if(availableSeats > 0){
            returning += "Available seats: " + availableSeats + "\n";
        }
        if(price > 0){
            returning += "Price: " + price + "\n";
        }
        return returning;
    }

    public void reserveSeat(boolean remove){
        if (remove){
            availableSeats++;
        }
        else{
            availableSeats--;
        }
    }



}
