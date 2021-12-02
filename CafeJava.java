public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 70;
        double cappuccinoPrice = 3;
        
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        double sumSam = lattePrice + lattePrice;
        double sumJimmy = lattePrice - dripCoffeePrice;
        System.out.println(generalGreeting + customer1 + pendingMessage);
        if(isReadyOrder4){
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        System.out.println(generalGreeting + customer2 + displayTotalMessage + sumSam);
        if(isReadyOrder2){
            System.out.println(readyMessage);
        }
        else{
            System.out.println(pendingMessage);
        }
        System.out.println("We are very sorry"+ customer3 + ", your new total is $" + sumJimmy);
        // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
