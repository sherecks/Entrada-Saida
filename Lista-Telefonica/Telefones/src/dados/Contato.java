package dados;

public class Contato{

 private String nome;
 private String telefone;


 //1°
 public void setNome(String nome){
    this.nome = nome;
 }

 public void setTelefone(String telefone){
    this.telefone = telefone;
 }


 //2°
 public String getNome(){
    return nome;
 }
 public String getTelefone(){
    return telefone;
 }


 //toString
 public String toString(){
    return "Nome = " + nome + "Telefone = " + telefone;
 }

}