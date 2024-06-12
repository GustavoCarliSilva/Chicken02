public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0;
        
        double segundaFeira = 100;
        double terçaFeira = 121;
        double quartaFeira = 117;
        
        
        dailyAverage = segundaFeira + terçaFeira + quartaFeira;
        dailyAverage /= 3; 
        
        monthlyAverage = segundaFeira + terçaFeira + quartaFeira;
        monthlyAverage *= 30;
        monthlyAverage /= 3;
        
        monthlyProfit = monthlyAverage;
        monthlyProfit *= 0.18; 
 
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
        
        //Teste
        int x = 25 - 5 * 4 / 2 - 10 + 4;
        System.out.println(x);
        
    }
    
}
