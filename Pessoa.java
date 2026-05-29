import java.util.Scanner;

public class Pessoa{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int idade;
    private String CPF;
    private String email;
    private String lanche;


    public Pessoa(String nome, int idade, String CPF, String email, String lanche){
        this.nome = nome;   
        this.idade = idade;  
        this.CPF = CPF;  
        this.email = email;  
        this.lanche = lanche;  

    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getLanche(){
        return lanche;
    }

    public void setLanche(String lanche){
        this.lanche = lanche;
    }

    public void falar(){
        System.out.println("Olá!");
    }

    public void comer(){
        System.out.println("Está comendo!");
    }

    public void come(String lanche){
        System.out.println("Informe a comida: ");
        setLanche(sc.nextLine());
        System.out.println("Comendo "+ getLanche());
    }

    public void dormir(){
        System.out.println("Dormindo!");
    }

    public void andar(int metros){
        System.out.println("Andando " + metros + " Metros" );
    }


}