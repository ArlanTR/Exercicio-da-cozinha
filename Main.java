import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando os trabalhos do restaurante");
    //criando cozinha Mineira
    Cozinha cozMin = new Cozinha("Mineira", 14, 20, "Feijoada");
    //Definindo ingredientes cozinha mineira
    LocalDate dataValidade;
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(0,"Feijão",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(1,"Farinha",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(2,"Arroz",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(3,"Carne de Porco",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozMin.setIngrediente(4,"Linguiça",dataValidade);
    //Definindo funcionarios
    String atividade;
    atividade = "Cozinheiro chefe";
    cozMin.setFuncionario(0,"Carlos",atividade);
    atividade = "Ajudante de cozinha";
    cozMin.setFuncionario(1, "André", atividade);
    atividade = "Faxineiro";
    cozMin.setFuncionario(2, "Antonio", atividade);
    atividade = ("Caixa");
    cozMin.setFuncionario(3, "Ana", atividade);


    //criando cozinha Chinesa
    Cozinha cozChin = new Cozinha("Chinesa",10,21,"Yakissoba");
    //Definindo ingredientes cozinha Chinesa
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(0, "Champignon",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(1, "Brócolis",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(2, "Macarrão",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozChin.setIngrediente(3, "Carne",dataValidade);
    //Definindo funcionarios
    atividade = "Cozinheiro chefe";
    cozChin.setFuncionario(0,"Xan xing",atividade);
    atividade = "Ajudante de cozinha";
    cozChin.setFuncionario(1,"Funji fei",atividade);
    atividade = "Caixa";
    cozChin.setFuncionario(2,"Mei",atividade);

    //criando cozinha italiana
    Cozinha cozIta = new Cozinha("Italiana",13,22,"Espaguete");
    //Definindo ingredientes cozinha italiana
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(0,"Molho",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(1,"Macarão",dataValidade);
    dataValidade = LocalDate.of(2023, 8, 4);
    cozIta.setIngrediente(2,"Carne",dataValidade);
    //Definindo funcionarios
    atividade = "Cozinheiro chefe";
    cozIta.setFuncionario(0,"Don Sapore",atividade);
    atividade = "Ajudante";
    cozIta.setFuncionario(1,"Bambino",atividade);

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
    //exibir ingrediente do prato principal
    System.out.println("Ingredientes do prato principal:");
    for(int i = 0; i < cozMin.tamanhoListaIngredientes();i++){
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
    for(int i = 0; i < cozChin.tamanhoListaIngredientes();i++){
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

    for(int i = 0; i < cozIta.tamanhoListaIngredientes();i++){
      System.out.println(cozIta.getIngrediente(i).getNome()+" validade "+
              cozIta.getIngrediente(i).getDataValidade());
    }
    System.out.print("\n");
    System.out.println("Todos Funcionarios da cozinha Mineira:");
    for(int i = 0; i < cozMin.tamanhoListaFuncionarios(); i++){
      System.out.print("Nome: "+cozMin.getFuncionario(i).getNome()+" Atividade: "+
              cozMin.getFuncionario(i).getAtividade()+"\n");
    }
    System.out.print("\n");
    System.out.println("Todos Funcionarios da cozinha Chinesa:");
    for(int i = 0; i < cozChin.tamanhoListaFuncionarios(); i++){
      System.out.print("Nome: "+cozChin.getFuncionario(i).getNome()+" Atividade: "+
              cozChin.getFuncionario(i).getAtividade()+"\n");
    }
    System.out.print("\n");
    System.out.println("Todos Funcionarios da cozinha Italiana:");
    for(int i = 0; i < cozIta.tamanhoListaFuncionarios(); i++){
      System.out.print("Nome: "+cozIta.getFuncionario(i).getNome()+" Atividade: "+
              cozIta.getFuncionario(i).getAtividade()+"\n");
    }

  }
}
