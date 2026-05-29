import java.util.Scanner;

public class app {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa ("Eric", 16, "012.901.210-31" , "eric.lemos@gmail.com", "Carne");
        
        System.out.println("Olá " + pessoa.getNome() + ", você tem " + pessoa.getIdade() + " anos");
        System.out.println("Seu email: " + pessoa.getEmail());
        System.out.println("Seu CPF: " + pessoa.getCPF()+ "\n");

        pessoa.falar();
        pessoa.come("lanche");
        pessoa.andar(10);
        pessoa.dormir();

        



    }
}
