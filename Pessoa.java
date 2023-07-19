public class Pessoa{
    private String nome;
    private int numeroTelefone;
    private int idade;

    public void nome(String nome){
        this.nome = nome;
   }

   public String getnome() {
        return nome;
    }

    public void numeroTelefone(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }
    public int getnumeroTelefone() {
        return numeroTelefone;
    }

    public void idade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void run(){
        System.out.println("Nome: " + getnome());
        System.out.println("Numero de telefone: " + getnumeroTelefone());
        System.out.println("Idade: " + getIdade());
    }

   
}