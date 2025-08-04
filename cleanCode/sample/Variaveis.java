public class Variaveis {
    public static void main(String[] args) {
        //String nome = "João";
        String UserName = "João";

        double tax = 0.1; //muito subjetivo
        double SendingTax = 0.1; //mais específico
        double sendingTaxBase = 0.1; //mais específico e com base
        double sendingTaxMaximum = 0.1;


        //numeros magicos sao numeros jogados no código sem explicação
        final double TAX_LIMIT_BY_COUNTRY = 0.2; // limite de taxa por país

        //if (tax < 2) {
        if (tax < TAX_LIMIT_BY_COUNTRY) {
            // ... faz algo
        }

        double myST = 3.0; // abreviação de sendingTax
        double userPersonalSendingTax = 2.0; //certo

        double rng = 1 //abreviação de random number generator
        double rangeNumberGenerator = 1; //certo
        double rangeOfDaysSending = 1; //mais certo ainda
    }
}