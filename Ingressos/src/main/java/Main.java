public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");

        MeiaEntrada meiaEntrada = new MeiaEntrada();
        meiaEntrada.setPrice(40);
        System.out.println(meiaEntrada.getValorMetade());
        System.out.println(meiaEntrada.getPrice());

        // =====================

        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        ingressoFamilia.setQuantidadePessoas(5);
        System.out.println("\n\n=========================");
        System.out.println(ingressoFamilia.getQuantidadePessoas());
        ingressoFamilia.setQuantidadePessoas(8);
        ingressoFamilia.setPrice(40);
        System.out.println(ingressoFamilia.getValorComDesconto());
    }
}
