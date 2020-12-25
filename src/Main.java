public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(5000);
        System.out.println("You have been credited " + bonusMiles + " miles");
        }
      }


