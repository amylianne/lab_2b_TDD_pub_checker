public class Guest {

    private String name;
    private int age;
    private Double money;
    private int sobriety;
    private Boolean banned;
    private char currency;
    private String favDrink;

    public Guest(String name,int age, Double money, int sobriety, Boolean banned, char currency, String drink) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.sobriety = sobriety;
        this.banned =  banned;
        this.currency = currency;
        this.favDrink = favDrink;

    }

//getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Double getMoney() {
        return money;
    }

    public int getSobriety() {
        return sobriety;
    }

    public Boolean getBanned() {
        return banned;
    }

    public char getCurrency() {
        return currency;

    }

    public String getFavDrink() {
        return favDrink;
    }
}
