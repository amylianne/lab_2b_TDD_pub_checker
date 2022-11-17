import java.util.ArrayList;

public class Server {
    private ArrayList<String> drink;

    public Server(String drink) {
        this.drink = new ArrayList<>() ;
    }

//guest served if ...
    public boolean canServeGuest(Guest guest) {

//they are aged 18+
        if (guest.getAge() >= 18) {
            return true;
        }
     //they have money  over £5.00
        if (guest.getMoney() >= 5.00) {
            return true;
        }
//their sober test is between 50-100
        if(guest.getSobriety() >= 50 && guest.getSobriety() <=100){
            return true;
        }
        //they're not banned
        if(guest.getBanned() == false){
            return true;
        }
        //their currency is in £.
        if(guest.getCurrency() == '£') {
            return true;
        }
        //server can make their fav drink.
        if(guest.getFavDrink() == "Negroni"){
            return true;
        }
        else
            return false;
    }

    //extension


    public ArrayList<String> getDrink() {
        return drink;
    }

//    public void setStock(ArrayList<drink> stock) {
//        this.drink = stock;
//    }

//    public void addDrink(favDrink) {
//
//        this.drink.add(favDrink);
//    }


}
