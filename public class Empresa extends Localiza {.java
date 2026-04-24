public class Empresa extends Localiza {
    private String cnpj;

    public void setDados(String n, String end, String tel, String cnpj) {
        this.nome = n;
        this.endereco = end;
        this.telefone = tel;
        this.cnpj = cnpj;
    }

    public String getDados() {
        return "Empresa: " + nome + " | CNPJ: " + cnpj + " | End: " + endereco;
    }
}