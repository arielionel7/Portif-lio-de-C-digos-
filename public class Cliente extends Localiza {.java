public class Cliente extends Localiza {
    private String cpf;

    public void setDados(String n, String end, String tel, String cpf) {
        this.nome = n;
        this.endereco = end;
        this.telefone = tel;
        this.cpf = cpf;
    }
    
    public String getDados() {
        return "Cliente: " + nome + " | CPF: " + cpf + " | End: " + endereco;
    }
}