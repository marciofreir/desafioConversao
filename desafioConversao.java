package cursojava;

import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("digite seu primeiro salario: ");
        String pSal = entrada.next().replace(",", ".");

        System.out.println("digite seu segundo salario: ");
        String sSal = entrada.next().replace(",", ".");

        System.out.println("digite seu terceiro salario: ");
        String tSal = entrada.next().replace(",", ".");

        double Salario1 = Double.parseDouble(pSal);
        double Salario2 = Double.parseDouble(sSal);
        double Salario3 = Double.parseDouble(tSal);

        double soma = (Salario1 + Salario2 + Salario3);
        double media = (Salario1 + Salario2 + Salario3) / 3;

        System.out.println("a soma dos salarios é "+ soma);
        System.out.println("a media dos salarios é "+ media);

        entrada.close();
    }
}
