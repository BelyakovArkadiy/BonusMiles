public class Main {
    public static void main(String[] args) {
        int ticketPrice =140;
        int bonusMiles;

        if (ticketPrice >= 20) {
           bonusMiles = ticketPrice / 20;
            System.out.println("You have been credited " + bonusMiles + " miles");
        } else {
            System.out.println("Miles not credited");
        }


        }
    }

