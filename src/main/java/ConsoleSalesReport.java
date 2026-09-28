public class ConsoleSalesReport {
    public static void main(String[] args) {
        // Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Two-dimensional arrays for [city][console]
        
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Print Header
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");

        int maxSales = 0;
        String topCity = "";

        // Loop
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            
            // Print City Name
            System.out.printf("%-15s", cities[i]);

            // Loop through consoles for the current city
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                cityTotal += sales[i][j];
            }
            
            // Print total for the city 
            System.out.printf("| Total: %d%n", cityTotal);

            // Check for highest selling city
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("City with the most gaming console sales: " + topCity + " (" + maxSales + " units)");
    }
}