public class Menu {

    private final Conversor conversor;

    public Menu(Conversor conversor) {
        this.conversor = conversor;
    }

    public void exibeMenu() {
        System.out.println("\n*********** Conversor de moedas ***********");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Euro para Real");
        System.out.println("3 - Peso Argentino para Real");
        System.out.println("4 - Yuan para Real");
        System.out.println("5 - Won para Real");
        System.out.println("6 - Rublo Russo para Real");
        System.out.println("7 - Sair");
        System.out.println("Digite uma opção: ");
    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                conversor.converterMoeda("USD", "BRL");
                break;
            case 2:
                conversor.converterMoeda("EUR", "BRL");
                break;
            case 3:
                conversor.converterMoeda("ARS", "BRL");
                break;
            case 4:
                conversor.converterMoeda("CNY", "BRL");
                break;
            case 5:
                conversor.converterMoeda("KRW", "BRL");
                break;
            case 6:
                conversor.converterMoeda("RUB", "BRL");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
