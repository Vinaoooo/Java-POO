package pacote_1;

public class Cachorro {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;
    private String estadoDeEspirito2;


 //Getters e Setters da minha classe Cachorro


    // Get pega - Tipo da variavel + get+nome da variavel + retorno = this. + variavel / É posssivel alterar as regras do Get
    public String getNome(){
        return this.nome;
    }

    // Set coloca e não tem retorno - public + void + set+ nome da variavel / entre parenteses colocar o que você esta esperando receber na variavel + tipo da variavel + nome
    public void setNome(String nome){
        this.nome = nome;
        }
    


   
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    


    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }


    
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }


    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


    public void comer(){}
    public void latir(){
        System.out.println("Au Au");
    }
    public String pegar(){
        return "Bolinha";
    }

    //Final 


    //Usando o switch - necessario usar Break após o final do case.
    public String interagir(String acao){
   
        switch (acao) {
        case "carinho": this.estadoDeEspirito = "Feliz";
        break;
        case "Vai deitar": this.estadoDeEspirito = "Bravo";
        break;
        default: this.estadoDeEspirito = "Neutro";
        break;
        }
        return this.estadoDeEspirito;

        

    }
    public String interagir2(String acao2){
            // equals compara string - compara a string que foi colocada entre parenteses
            if(acao2.equals("carinho")){
                this.estadoDeEspirito2 = "Feliz";
            }else if(acao2.equals("Vai deitar")){
                this.estadoDeEspirito2 = "Bravo";
            }else {
                this.estadoDeEspirito2 = "Neutro";
            }
            return estadoDeEspirito2;
        }
}
