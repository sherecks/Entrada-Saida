package principal;

import dados.Contato;
import negocios.ListaTel;

import java.util.List;
import java.util.Scanner;

public class Apresentacao {


    private static ListaTel sistema = new ListaTel();
    private static Scanner s = new Scanner(System.in);

    public static void menu(){
        System.out.println("°°°Menu°°°");
        System.out.println("1° - Adicionar Contato");
        System.out.println("2° - Remover Contato");
        System.out.println("3° - Exibir Contatos");
        System.out.println("0° - Sair");
    }


    public static Contato novoContato() {
        Contato contato = new Contato();

        System.out.println("Digite o Nome do Contato: ");
        contato.setNome(s.nextLine());
        System.out.println("Digite o telefone do contato: ");
        contato.setTelefone(s.nextLine());
        
        return contato;
    }

    public static void adicionarContato(Contato contato){
        sistema.adicionaContato(contato);
    }

    public static void removerContato(){
        System.out.print("Digite o nome do contato que deseja remover: ");

        String nomeRemover = s.nextLine();
        char letra = nomeRemover.toUpperCase().charAt(0);
        List<Contato> contatosTemp = sistema.buscarContato(letra);

        for(int i=0; i < contatosTemp.size(); i++){
            if(contatosTemp.get(i).getNome().equals(nomeRemover) == true){
                sistema.removerContato(contatosTemp.get(i));
            }
        }
    }

    public static void exibirContatos(){
        System.out.println(sistema.toString());
    }


    
    public static void main(String[] args) {
        
        int opcao = 0;
        do{
            menu();
            System.out.print("Digite o numero da Opção: ");
            opcao = Integer.valueOf(s.nextLine());
            switch (opcao) {
                case 1:
                    adicionarContato(novoContato());
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    exibirContatos();
                    break;
            }
        }while(opcao != 0);

    }

    
}
