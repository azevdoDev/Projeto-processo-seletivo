import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();

    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "IGOR", "MATHEUS", "GRAZI", "EDGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice + 1) + " é o " + candidatos[indice]);

        }

        System.out.println("Forma abreviada de interação for each ");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "IGOR", "MATHEUS", "GRAZI", "EDGUSTO" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        Double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double pretencao) {

        Double salario = 2000.0;

        if (salario > pretencao) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }

        else if (salario == pretencao) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }

        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }

    }

}
