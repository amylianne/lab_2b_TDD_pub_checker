import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServerTest {

    private Server server;
    private Guest guest;

    @BeforeEach
    public void setUp() {
        server = new Server("Negroni");
        guest = new Guest("Bob", 19, 5.5, 75, false, '£', "Negroni");

    }

    // TODO: test that guest can only get served if over 18

//    @Test
//    public String getName() {
//        return guest.getName();
//    }


    @Test
    public void canServeGuest() {
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
        //assertThat(guest.getAge()).isGreaterThanOrEqualTo(18);
//        // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
//        assertThat(guest.getMoney()).isGreaterThanOrEqualTo(5);
//        // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
//        assertThat(guest.getSobriety()).isGreaterThanOrEqualTo(50);
//        // TODO: test that guest can only get served if guest is not banned from the pub
//        assertThat(guest.getBanned()).isEqualTo(false);
//        // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
//        assertThat(guest.getCurrency()).isEqualTo('£');
    }

//previous tries that didn't work:
//        boolean bob = true;
//        assertThat(bob).isEqualTo(true);
//  }
//        bob.getAge();
//        assertThat(bob).isGreaterThanOrEqualTo(18);
//    }
//        String age = guest.getAge();
//        assertThat(age).isGreaterThanOrEqualTo("18");
//    }


//    @Test
//    public void canServeGuestIfSober() {
//        boolean result = server.canServeGuest(bob);
//    }


// EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink

    //  (give server a list of drinks (strings) it can make)
    @Test
    public void canMakeDrinks(){
//    drink1 = new Drink("Martini");
//    drink2 = new Drink("Negroni");
//    drink3 = new Drink("Margarita");
//    server.addDrink(drink1);
//    server.addDrink(drink2);
//    server.addDrink(drink3);
    assertThat(server.getDrink()).isEqualTo(guest.getFavDrink());

    }
}
