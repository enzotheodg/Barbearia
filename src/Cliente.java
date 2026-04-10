public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public String getCpf() {
        return cpf;
    }

    public boolean atualizarCpf(String cpf) {
        if (cpf == null || !(cpf.matches("\\d+") && cpf.length() == 11)){
            return false;
        }
        this.cpf = cpf;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean atualizarEmail(String email) {
        if (email == null || !(email.contains("@") && email.contains(".com"))){
            return false;
        }
        this.email = email;
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean atualizarTelefone(String telefone) {
        if (telefone == null || !(telefone.matches("\\d+") && telefone.length() == 11)){
            return false;
        }
        this.telefone = telefone;
        return true;
    }

    public boolean atulizarNome(String nome) {
        if (nome == null || !nome.matches("[a-zA-ZÀ-ÿ]+")) {
            return false;
        }else{
            this.nome= nome;
            return true;

        }
    }

    public String getNome() {
        return nome;
    }
}
