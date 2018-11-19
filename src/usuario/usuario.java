package usuario;

public abstract class usuario {
    protected String nome;
    protected int idade;
    protected String CPF;
    protected String telefone;
    protected String CEP;
    protected boolean admin = false;

    public usuario(String nome, int idade, String CPF, String telefone, String CEP) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.telefone = telefone;
        this.CEP = CEP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public boolean isAdmin() {
        return admin;
    }
}
