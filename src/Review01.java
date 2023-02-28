
public class Review01 {

    public static void main(String[] args) {
            double tax_price =taxprice(1200,0.1);
            System.out.println(tax_price);
    }
    

             private static double taxprice(int i, double d) {
        double result = i * d + i;
        
        return result;
    }


  
}