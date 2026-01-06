package pessoas;

public class Pessoas {

    private String nome;
    private Integer idade;
    private Double altura; 

    public Pessoas(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    int menor=0;
    double alturatotal=0.0, alturamedia,percentualmenor;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getMenor() {
        return menor;
    }
    public void setMenor(int menor) {
        this.menor = menor;
    }
    public double getAlturatotal() {
        return alturatotal;
    }
    public void setAlturatotal(double alturatotal) {
        this.alturatotal = alturatotal;
    }   
    public double getAlturamedia() {
        return alturamedia;
    }
    public void setAlturamedia(double alturamedia) {
        this.alturamedia = alturamedia;
    }
    public double getPercentualmenor() {
        return percentualmenor;
    }
    public void setPercentualmenor(double percentualmenor) {
        this.percentualmenor = percentualmenor;
    }
}
