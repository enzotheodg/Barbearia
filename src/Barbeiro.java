public class Barbeiro {
    private String nomeBarbeiro;
    private int[][] agenda;

    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }

    public void setNomeBarbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
    }

    public Barbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
        this.agenda = new int[5][11];
    }

    public boolean agendaBarbeiro(){
        int dia, hora, servicos;
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("===" + "          ESCOLHA UM DIA DA SEMANA       " + "===");
        System.out.println("===" + "             1.SEGUNDA                   " + "===");
        System.out.println("===" + "             2.TERCA                     " + "===");
        System.out.println("===" + "             3.QUARTA                    " + "===");
        System.out.println("===" + "             4.QUINTA                    " + "===");
        System.out.println("===" + "             5.SEXTA                     " + "===");
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("Digite um numero de 1 a 5:");
        dia = Barbearia.read.nextInt();
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("===" + "          ESCOLHA UM HORARIO             " + "===");
        System.out.println("===" + "          9h as 19h                      " + "===");
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("Digite o horario que voce deseja: ");
        hora = Barbearia.read.nextInt();
        dia = dia - 1;
        hora = hora - 9;
        agenda[dia][hora] = 1;
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("===" + "          ESCOLHA UM SERVICO             " + "===");
        System.out.println("===" + "             1.CORTE                     " + "===");
        System.out.println("===" + "             2.BARBA                     " + "===");
        System.out.println("===" + "             3.BARBOTERAPIA              " + "===");
        System.out.println("===" + "             4.SOBRANCELHA               " + "===");
        System.out.println("=== === === === === === === === === === === ===");
        servicos = Barbearia.read.nextInt();
        return true;
    }

    public void mostrarAgenda(){
        for (int i = 0; i < agenda[0].length; i++) {
            for (int j = 0; j < agenda.length; j++) {
                System.out.print("  " + agenda[j][i]);
            }
            System.out.println();
        }

    }
}
