package persistencia;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dados.Contato;

public class ContatoDAO {

    public void insert(Contato contato){
        arquivoContatoDAO.salvaContatos(contato);
    }

    public void delete(Contato contato){
        List<Contato> contatos = arquivoContatoDAO.leContatos();
        int index = 0;
        for(int i = 0; i < contatos.size();i++){
            if(contatos.get(i).getNome() == contato.getNome())){
                index = i;
            }
        }
        contatos.remove(index);
        arquivosContatoDAO.salvaContatos(contatos);
    }
}




