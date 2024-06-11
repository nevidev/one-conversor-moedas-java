import java.util.Scanner;

public class Main {

    private static final String API_KEY = "sua-apikey-aqui";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conversor conversor = new Conversor(API_KEY);

        Menu menu = new Menu(conversor);

        try {
            while(true) {
                menu.exibeMenu();
                int codigo = Integer.parseInt(sc.nextLine());
                if (codigo == 7) {
                    System.out.println("Programa encerrado");
                    return;
                }
                menu.escolherOpcao(codigo);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
