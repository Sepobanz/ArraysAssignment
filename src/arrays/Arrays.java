/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author jamccune
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double [] prices = new double[4];
        prices[0] = 14.95;
        prices[1] = 12.95;
        prices[2] = 11.95;
        prices[3] = 9.95;
        //prices[4] = 8.95;
        
        double sum = 0.0;
        /*for(int k = 0; k < prices.length; k++)
        {
            sum += prices[k];
        }*/
        for(int k = 0; k < prices.length; sum += prices[k++]);
        
        double average = sum / prices.length;
        System.out.println("Average: " + average);
        
        double [] prices2 = {14.95, 12.95, 11.95, 9.95};
        
        String [] names = new String[3];
        names[0] = "Ted Lewis";
        names[1] = "Sue Jones";
        names[2] = "Ray Thomas";
        
        String [] names2 = {"Ted Lewis", "Sue Jones", "Ray Thomas"};
        names2[0] = names2[0] + " JR";
        System.out.println(names2[0]);
        
        Product [] products = new Product [2];
        products[0] = new Product("java");
        products[1] = new Product("jsps");
        products[0].setDescription("Murach's Beginning Java");
        products[0] = new Product("txtp");
        
        int [] values = new int[10];
        
        for(int i = 0; i < values.length; i++)
        {
            values[i] = i;
        }
        
        for(int j = 0; j < values.length; j++)
        {
            System.out.print(values[j] + " ");
        }
        
        for(double price : prices)
        {
            System.out.println(price);
        }
    }
    
}
