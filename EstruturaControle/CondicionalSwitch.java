public class CondicionalSwitch {
    public static void main(String[] args) {
        int numero = 7;

        String message = switch (numero) {
            case 1 -> "segunda";
            case 2 -> "terça";
            case 3 -> "quarta";
            case 4 -> "quinta";
            case 5 -> "sexta";
            case 6, 7 -> {
                String day = (numero == 6) ? "sábado" : "domingo";
                yield day;
                //quando tiver aninhado, usar yield para fazer o retorno
            }
            default -> "dia inválido";
        };
        System.out.println(message);
    }
}
