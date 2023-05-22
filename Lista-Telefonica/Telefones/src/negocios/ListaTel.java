package negocios;
import dados.Contato;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class ListaTel {
    
    //HashMap
    private Map<Character, List<Contato>> contatos = new HashMap<Character , List<Contato>>();

    //1°
    public ListaTel(){

        List<Contato> lista;
        for(char i = 'A'; i <= 'Z';i++){
            lista = new LinkedList<Contato>();
            contatos.put(i, lista);
        }
    }

    //2° -> Funçãozinha
    public void adicionaContato(Contato contato){

        String nome = contato.getNome().toUpperCase();
        List<Contato> contatosTemp = contatos.get(nome.charAt(0));
        contatosTemp.add(contato);
    }

    public void removerContato(Contato contato){
        
        String nome = contato.getNome().toUpperCase();
        List<Contato> contatosTemp = contatos.get(nome.charAt(0));
        int posicao = contatosTemp.indexOf(contato);
        contatosTemp.remove(posicao);
    }


    public List<Contato> buscarContato(char letra){

        List<Contato> buscaTemp = contatos.get(Character.toUpperCase(letra));
        return buscaTemp;
    }

    public Map<Character, List<Contato>> buscarContatos(){
        return contatos;
    }

    public String toString(){
        return "Contatos = " + contatos;
    }


}
