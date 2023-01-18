package class9HomeWork;

public class HomeWork6 {
    public static void main(String[] args) {
       // 6) Create an array of countries.
        // While retrieving all values from an array print capital for each country choose any five countries.

        String [] countries={"USA","Ukraine","Italy","France","Turkey"};
        countries[0]="Washington";
        countries[1]="Kyiv";
        countries[2]="Rome";
        countries[3]="Paris";
        countries[4]="Istanbul";
                
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);


        }


    }
}
