import java.util.ArrayList;
import java.util.Arrays;
class Cozinha{
  private String tipo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;
  ArrayList<Ingrediente> ingredientes;
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
  public void setFuncionarios(int i, Funcionario funcionario) {
    funcionarios.add(i, funcionario);
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