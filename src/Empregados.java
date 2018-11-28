public class Empregados {

    private String nome;
    private String endereco;
    private String tipoSalario;
    private double salario;
    private double taxaSindical;
    private double servicosAdicioanais;
    private double comissao;
    private int horas = 0;

    public void ho(int hor)
    {
        this.horas += hor;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTaxaSindical() {
        return taxaSindical;
    }

    public void setTaxaSindical(double taxaSindical) {
        this.taxaSindical = taxaSindical;
    }

    public double getServicosAdicioanais() {
        return servicosAdicioanais;
    }

    public void setServicosAdicioanais(double servicosAdicioanais) {
        this.servicosAdicioanais = servicosAdicioanais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }
}
