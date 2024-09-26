public class Cliente {
   public String nome;
    public String Genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Genero=" + Genero +
                ", idade=" + idade +
                '}';
    }

    private Integer idade;

    public Cliente(String nome, String genero) {
        this.nome = nome;
        this.idade = idade;
        Genero = genero;
    }
}