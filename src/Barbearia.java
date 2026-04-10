import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Barbearia {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Barbeiro> barbeiros = new HashMap<>();

        int servicos, cadastro;
        barbeiros.put("Jonas", new Barbeiro("Jonas"));
        String nome, cpf, email, telefone;
        Cliente cliente = new Cliente();
        while (true) {
            System.out.println("=== === === === === === === === === === === ===");
            System.out.println("===" + "        SEJA BEM VINDO A BARBEARIA       " + "===");
            System.out.println("===" + "         QUAL SERVICO VOCE DESEJA        " + "===");
            System.out.println("===" + "              1.CADASTRO                 " + "===");
            System.out.println("===" + "              2.ATULIZAR CADASTRO        " + "===");
            System.out.println("===" + "              3.MARCAR UM HORARIO        " + "===");
            System.out.println("===" + "              4.SAIR                     " + "===");
            System.out.println("=== === === === === === === === === === === ===");
            System.out.println("Digite aqui:");
            servicos = read.nextInt();
            switch (servicos) {
                case 1:
                    System.out.println("=== === === === === === === === === === === ===");
                    System.out.println("===" + "               CADASTRO                  " + "===");
                    System.out.println("===" + "Para realizar seu cadastro na barbearia  " + "===");
                    System.out.println("===" + "iremos precisar de algumas informacoes.  " + "===");
                    System.out.println("===" + "  1.Nome(Apenas letras)                  " + "===");
                    System.out.println("===" + "  2.CPF(Apenas numeros)                  " + "===");
                    System.out.println("===" + "  3.Telefone(Apenas numeros)             " + "===");
                    System.out.println("===" + "  4.Email                                " + "===");
                    System.out.println("=== === === === === === === === === === === ===");
                    do {

                        System.out.println("Digite o seu nome aqui:");
                        nome = read.next();

                    } while (!cliente.atulizarNome(nome));

                    do {

                        System.out.println("Digite seu CPF aqui:");
                        cpf = read.next();

                    } while (!cliente.atualizarCpf(cpf));

                    do {

                        System.out.println("Digite seu Telefone aqui:");
                        telefone = read.next();

                    } while (!cliente.atualizarTelefone(telefone));

                    do {

                        System.out.println("Digite seu email aqui:");
                        email = read.next();

                    } while (cliente.atualizarEmail(email));

                    System.out.println("=== === === === === === === === === === === ===");
                    System.out.println("===" + "          CADASTRO FINALIZADO            " + "===");
                    System.out.println("===" + "             SEJA BEM VINDO              " + "===");
                    System.out.println("=== === === === === === === === === === === ===");
                    break;
                case 2:
                    System.out.println("=== === === === === === === === === === === ===");
                    System.out.println("===" + "          ALTERANDO O CADASTRO           " + "===");
                    System.out.println("===" + "  1.Nome(Apenas letras)                  " + "===");
                    System.out.println("===" + "  2.CPF(Apenas numeros)                  " + "===");
                    System.out.println("===" + "  3.Telefone(Apenas numeros)             " + "===");
                    System.out.println("===" + "  4.Email                                " + "===");
                    System.out.println("=== === === === === === === === === === === ===");
                    System.out.println("Digite aqui qual dado queira atulizar:");
                    cadastro = read.nextInt();

                    switch (cadastro) {
                        case 1:
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("Digite seu nome aqui");
                            nome = read.next();
                            while (!cliente.atulizarNome(nome));
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("===" + "              NOME ALTERADO            " + "===");
                            System.out.println("=== === === === === === === === === === === ===");
                            break;
                        case 2:
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("Digite seu CPF aqui");
                            cpf = read.next();
                            while (!cliente.atualizarCpf(cpf));
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("===" + "              CPF ALTERADO             " + "===");
                            System.out.println("=== === === === === === === === === === === ===");
                            break;
                        case 3:
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("Digite seu Telefone aqui:");
                            telefone = read.next();
                            while(!cliente.atualizarTelefone(telefone));
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("===" + "            TELEFONE ALTERADO          " + "===");
                            System.out.println("=== === === === === === === === === === === ===");
                        case 4:
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("Digite seu email aqui:");
                            email = read.next();
                            while(cliente.atualizarEmail(email));
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("===" + "            EMAIL ALTERADO             " + "===");
                            System.out.println("=== === === === === === === === === === === ===");
                        default:
                            System.out.println("=== === === === === === === === === === === ===");
                            System.out.println("===" + "         DIGITE UM NUMERO VALIDO       " + "===");
                            System.out.println("=== === === === === === === === === === === ===");

                    }
                    break;
                case 3:
                    System.out.println("=== === === === === === === === === === === ===");
                    System.out.println("===" + "         DIGITE O NOME DO BARBEIRO      " + "===");
                    System.out.println("===" + "            1.JONAS                     " + "===");
                    System.out.println("=== === === === === === === === === === === ===");
                    read.nextLine();

                    String nomeBarbeiro =" ";
                    nomeBarbeiro = read.nextLine();
                    Barbeiro barbeiro = barbeiros.get(nomeBarbeiro);
                    barbeiro.mostrarAgenda();
                    if (!barbeiro.agendaBarbeiro()){
                        System.out.println("Nao foi possivel agendar");
                    }else{
                        System.out.println("Seu horario foi agendado com sucesso");
                        System.out.println("Voltando ao menu principal...");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}