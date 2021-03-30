import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
class Cozinha{
  private String tipo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;
  private ArrayList<Ingrediente> ingredientes;
  private ArrayList<Funcionario> funcionarios;

  public Cozinha(String tip,int horaAber,int horafecha,String pratoPrin){
    tipo = tip;
    horaAbertura = horaAber;
    horaFechamento = horafecha;
    pratoPrincipal = pratoPrin;
    ingredientes = new ArrayList<>();
    funcionarios = new ArrayList<>();
  }
  //retorna funcionario no indice passado
  public Funcionario getFuncionario(int i) {
    return funcionarios.get(i);
  }
  //defini o funcionario no indice passado
  public void setFuncionario(int i,String nome, String atividade) {
    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setAtividade(atividade);
    funcionarios.add(i, funcionario);
  }

  public ArrayList<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public ArrayList<Ingrediente> getIngredientes() {
    return ingredientes;
  }
  public Ingrediente getIngrediente(int i){
    return ingredientes.get(i);
  }
  public void setIngrediente(int i, String nome, LocalDate dataValidade) {
    var ingrediente = new Ingrediente();
    ingrediente.setNome(nome);
    ingrediente.setDataValidade(dataValidade);
    ingredientes.add(i,ingrediente);
  }

  public String getTipo(){
    return  tipo;
  }
  public int getHoraAbertura(){
    return horaAbertura;
  }
  public int getHoraFechamento(){
    return horaFechamento;
  }
  public String getPratoPrincipal(){
    return pratoPrincipal;
  }
}