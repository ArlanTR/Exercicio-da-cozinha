import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando os trabalhos do restaurante");
    //criando cozinha Mineira
    Cozinha cozMin = new Cozinha("Mineira", 14, 20, "Feijoada");
    //Definindo ingredientes cozinha mineira
    String nomeIngrediente;
    LocalDate dataValidade;
    nomeIngrediente = "Feijão";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(0,nomeIngrediente,dataValidade);
    nomeIngrediente = "Farinha";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(1,nomeIngrediente,dataValidade);
    nomeIngrediente = "Arroz";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(2,nomeIngrediente,dataValidade);
    nomeIngrediente = "Carne de Porco";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(3,nomeIngrediente,dataValidade);
    nomeIngrediente = "Linguiça";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(4,nomeIngrediente,dataValidade);
    //Definindo funcionarios
    String nome;
    String atividade;
    nome = "Carlos";
    atividade = "Cozinheiro chefe";
    cozMin.setFuncionario(0,nome,atividade);
    nome = "André";
    atividade = "Ajudante de cozinha";
    cozMin.setFuncionario(1, nome, atividade);
    nome = "Antonio";
    atividade = "Faxineiro";
    cozMin.setFuncionario(2, nome, atividade);
    nome = ("Ana");
    atividade = ("Caixa");
    cozMin.setFuncionario(3, nome, atividade);


    //criando cozinha Chinesa
    Cozinha cozChin = new Cozinha("Chinesa",10,21,"Yakissoba");
    //Definindo ingredientes cozinha Chinesa
    nomeIngrediente = "Champignon";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(0, nomeIngrediente,dataValidade);
    nomeIngrediente = "Brócolis";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(1, nomeIngrediente,dataValidade);
    nomeIngrediente = "Macarrão";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(2, nomeIngrediente,dataValidade);
    nomeIngrediente = "Carne";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(3, nomeIngrediente,dataValidade);
    //Definindo funcionarios
    nome = "Xan xing";
    atividade = "Cozinheiro chefe";
    cozChin.setFuncionario(0,nome,atividade);
    nome = "Funji fei";
    atividade = "Ajudante de cozinha";
    cozChin.setFuncionario(1,nome,atividade);
    nome = "Mei";
    atividade = "Caixa";
    cozChin.setFuncionario(2,nome,atividade);

    //criando cozinha italiana
    Cozinha cozIta = new Cozinha("Italiana",13,22,"Espaguete");
    //Definindo ingredientes cozinha italiana
    nomeIngrediente = "Molho";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(0,nomeIngrediente,dataValidade);
    nomeIngrediente = "Macarão";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(1,nomeIngrediente,dataValidade);
    nomeIngrediente = "Carne";
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(2,nomeIngrediente,dataValidade);
    //Definindo funcionarios
    nome = "Don Sapore";
    atividade = "Cozinheiro chefe";
    cozIta.setFuncionario(0,nome,atividade);
    nome = "Bambino";
    atividade = "Ajudante";
    cozIta.setFuncionario(1,nome,atividade);

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
    // exibir ingrediente do prato principal
    System.out.println("Ingredientes do prato principal:");
    for(int i = 0; i < cozMin.getIngredientes().size();i++){
      System.out.println(cozMin.getIngrediente(i).getNome()+" validade "+
              cozMin.getIngrediente(i).getDataValidade());
    }
    System.out.print("\n");
    System.out.print("Cozinha ");
    System.out.println(cozChin.getTipo());
    System.out.print("Horario de Funcionamento é das ");
    System.out.print(cozChin.getHoraAbertura());
    System.out.print(" hrs até ");
    System.out.print(cozChin.getHoraFechamento());
    System.out.println(" hrs ");
    System.out.print("E o prato principal é ");
    System.out.println(cozChin.getPratoPrincipal() + "\n");
    System.out.println("Ingredientes do prato principal:");
    for(int i = 0; i < cozChin.getIngredientes().size();i++){
      System.out.println(cozChin.getIngrediente(i).getNome()+" validade "+
              cozChin.getIngrediente(i).getDataValidade());
    }
    System.out.print("\n");
    System.out.print("Cozinha ");
    System.out.println(cozIta.getTipo());
    System.out.print("Horario de Funcionamento é das ");
    System.out.print(cozIta.getHoraAbertura());
    System.out.print(" hrs até ");
    System.out.print(cozIta.getHoraFechamento());
    System.out.println(" hrs ");
    System.out.print("E o prato principal é ");
    System.out.println(cozIta.getPratoPrincipal()+ "\n");
    System.out.println("Ingredientes do prato principal:");

    for(int i = 0; i < cozIta.getIngredientes().size();i++){
      System.out.println(cozIta.getIngrediente(i).getNome()+" validade "+
              cozIta.getIngrediente(i).getDataValidade());
    }
    System.out.print("\n");
    //Exibir funcionarios
    System.out.println("Todos Funcionarios da cozinha Mineira:");
    for(int i = 0; i < cozMin.getFuncionarios().size(); i++){
      System.out.print(cozMin.getFuncionario(i).getNome()+" Atividade: "+
              cozMin.getFuncionario(i).getAtividade()+"\n");
    }
    System.out.print("\n");
    System.out.println("Todos Funcionarios da cozinha Chinesa:");
    for(int i = 0; i < cozChin.getFuncionarios().size(); i++){
      System.out.print(cozChin.getFuncionario(i).getNome()+" Atividade: "+
              cozChin.getFuncionario(i).getAtividade()+"\n");
    }
    System.out.print("\n");
    System.out.println("Todos Funcionarios da cozinha Italiana:");
    for(int i = 0; i < cozIta.getFuncionarios().size(); i++){
      System.out.print(cozIta.getFuncionario(i).getNome()+" Atividade: "+
              cozIta.getFuncionario(i).getAtividade()+"\n");
    }

  }
}
