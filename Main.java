import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando os trabalhos do restaurante");
    //criando cozinha Mineira
    Cozinha cozMin = new Cozinha("Mineira", 14, 20, "Feijoada");
    //Definindo ingredientes cozinha mineira
    var ingrediente = new Ingrediente();
    ingrediente.nome = "Feijão";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.ingredientes.add(ingrediente);
    ingrediente.nome = "Farinha";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.ingredientes.add(ingrediente);
    ingrediente.nome = "Arroz";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.ingredientes.add(ingrediente);
    ingrediente.nome = "Carne de Porco";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.ingredientes.add(ingrediente);
    ingrediente.nome = "Linguiça";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.ingredientes.add(ingrediente);
    //Definindo funcionarios
    var funcionario = new Funcionario();
    funcionario.setNome("Carlos");
    funcionario.setAtividade("Cozinheiro chefe");
    cozMin.setFuncionarios(0, funcionario);
    funcionario.setNome ("André");
    funcionario.setAtividade("Ajudante de cozinha");
    cozMin.setFuncionarios(1,funcionario);
    funcionario.setNome ("Antonio");
    funcionario.setAtividade("Faxineiro");
    cozMin.setFuncionarios(2,funcionario);
    funcionario.setNome ("Ana");
    funcionario.setAtividade ("Caixa");
    cozMin.setFuncionarios(3,funcionario);


    //criando cozinha Chinesa
    Cozinha cozChin = new Cozinha("Chinesa",10,21,"Yakissoba");
    //Definindo ingredientes cozinha Chinesa
    ingrediente.nome = "Champignon";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.ingredientes.add(ingrediente);
    ingrediente.nome = "Brócolis";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.ingredientes.add(ingrediente);
    ingrediente.nome = "Macarrão";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.ingredientes.add(ingrediente);
    ingrediente.nome = "Carne";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.ingredientes.add(ingrediente);
    //Definindo funcionarios
    funcionario.setNome("Xan xing");
    funcionario.setAtividade("Cozinheiro chefe");
    cozChin.setFuncionarios(0,funcionario);
    funcionario.setNome("Funji fei");
    funcionario.setAtividade("Ajudante de cozinha");
    cozChin.setFuncionarios(1,funcionario);
    funcionario.setNome("Mei");
    funcionario.setAtividade("Caixa");
    cozChin.setFuncionarios(2,funcionario);

    //criando cozinha italiana
    Cozinha cozIta = new Cozinha("Italiana",13,22,"Espaguete");
    //Definindo ingredientes cozinha italiana
    ingrediente.nome = "Molho";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.ingredientes.add(ingrediente);
    ingrediente.nome = "Macarão";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.ingredientes.add(ingrediente);
    ingrediente.nome = "Carne";
    ingrediente.dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.ingredientes.add(ingrediente);
    //Definindo funcionarios
    funcionario.setNome ("Don Sapore");
    funcionario.setAtividade("Cozinheiro chefe");
    cozIta.setFuncionarios(0,funcionario);
    funcionario.setNome ("Bambino");
    funcionario.setAtividade ("Ajudante");
    cozIta.setFuncionarios(1,funcionario);

    //Exibir dados das Cozinha cadastratas
    System.out.print("Cozinha ");
    System.out.println(cozMin.getTipo());
    System.out.print("Horario de Funcionamento é das ");
    System.out.print(cozMin.getHoraAbertura());
    System.out.print(" hrs até ");
    System.out.print(cozMin.getHoraFechamento());
    System.out.println(" hrs ");
    System.out.print("E o prato principal é ");
    System.out.println(cozMin.getPratoPrincipal()+ "\n");

    System.out.print("Cozinha ");
    System.out.println(cozChin.getTipo());
    System.out.print("Horario de Funcionamento é das ");
    System.out.print(cozChin.getHoraAbertura());
    System.out.print(" hrs até ");
    System.out.print(cozChin.getHoraFechamento());
    System.out.println(" hrs ");
    System.out.print("E o prato principal é ");
    System.out.println(cozChin.getPratoPrincipal() + "\n");

    System.out.print("Cozinha ");
    System.out.println(cozIta.getTipo());
    System.out.print("Horario de Funcionamento é das ");
    System.out.print(cozIta.getHoraAbertura());
    System.out.print(" hrs até ");
    System.out.print(cozIta.getHoraFechamento());
    System.out.println(" hrs ");
    System.out.print("E o prato principal é ");
    System.out.println(cozIta.getPratoPrincipal()+ "\n");
    //Primeiro funcionario de cada cozinha
    //porem não está funcionando corretamente e não sei como corrigir
    System.out.print(cozMin.getFuncionario(0).getNome()+" Atividade "+ cozMin.getFuncionario(0).getAtividade()+"\n");
    System.out.print(cozIta.getFuncionario(0).getNome()+" Atividade "+ cozIta.getFuncionario(0).getAtividade()+"\n");
    System.out.print(cozChin.getFuncionario(0).getNome()+" Atividade "+ cozChin.getFuncionario(0).getAtividade()+"\n");

  }
}
