import java.time.LocalDate;

class Ingrediente{
  private String nome;
  private LocalDate dataValidade;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setDataValidade(LocalDate dataValidade) {
    this.dataValidade = dataValidade;
  }

  public LocalDate getDataValidade() {
    return dataValidade;
  }
}