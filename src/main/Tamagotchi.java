package main;

public class Tamagotchi {
    private int energiaMAX;
    private int energiaAtual;
    private int saciedadeMAX;
    private int saciedadeAtual;
    private int limpezaMAX;
    private int idadeMAX;
    private int limpezaAtual;
    private int idade_atual;
    private boolean esta_vivo=true;
    private int diamantes= 0;
    
    public Tamagotchi (int energiaMAX, int saciedadeMAX, int limpezaMAX, int limpezaAtual){
        this.energiaMAX = energiaMAX;
        this.energiaAtual = energiaMAX;
        this.saciedadeAtual = saciedadeMAX;
        this.saciedadeMAX = saciedadeMAX;
        this.limpezaMAX = limpezaAtual;
        this.limpezaMAX = limpezaMAX;
        System.out.println("Parabéns, seu amigo foi criado com sucesso. Eis seus atributos iniciais:");
} //criando um novo tamagotch//

public Tamagotchi(int idadeMAX) {
        this.idadeMAX = idadeMAX;
    }

//criando os metodos pedidos na atividade//

    public int getEnergiaMAX (){
        return energiaMAX;
    }
    public int getSaciedadeMAX (){
        return saciedadeMAX;
    }
    public int getLimpezaMAX(){
        return limpezaMAX;
    }
    public int getIdadeMAX (){
        return idadeMAX;
    }
    public int getEnergiaAtual (){
        return energiaAtual;
    }
    public int getSaciedadeAtual (){
        return saciedadeAtual;
    }
    public int getLimpezaAtual(){
        return limpezaAtual;
    }
    public int getIdadeAtual (){
        return idade_atual;
    }
    public int getDiamantes (){
        return diamantes;
    }
    public boolean getEsta_vivo (){
        return esta_vivo;
    }
//função para verificar o nivel de energia do bichinho// 
    
    public boolean setEnergiaTAMA (int EnergiaTAMA){
        if (this.energiaAtual <=0) {
         this.esta_vivo = false;
    }   else if (this.energiaAtual <= this.energiaMAX){
        this.energiaAtual += EnergiaTAMA;
    }   else if (this.energiaAtual > energiaMAX){
        this.energiaAtual = this.energiaMAX;
    
        return true; 
    }
        { return false;
    }
}
//função para verificar o nivel de saciedade//
    public boolean setSaciedade (int saciedade){
        if (this.saciedadeAtual <=0) {
         return false;
    }   else if (this.saciedadeAtual <= this.saciedadeMAX){
        this.saciedadeAtual += saciedade;
    }   else if (this.saciedadeAtual > saciedadeMAX){
        this.saciedadeAtual = this.saciedadeMAX;
    }
        return true;
}
//função para verificar o nivel de limpeza de seu tamagotchi//
    public boolean banhar (int Limpeza){
        if (this.limpezaAtual<=0) {
         this.limpezaAtual = Limpeza;
    }   else if (this.limpezaAtual <= this.limpezaMAX){
        this.limpezaAtual += Limpeza;
    }   else if (this.limpezaAtual > limpezaMAX){
        this.limpezaAtual = this.limpezaMAX;
    return true;
    } 
        return false;
    }
//função para definir a idade//
    public boolean setIdade(int Idade){
      if (this.idade_atual <= this.idadeMAX){
        this.idade_atual += Idade;
    }   else if (this.idade_atual > idadeMAX){
        this.idade_atual= idadeMAX;
    }
        return true;
}
    //colocando o seu bichinho para brincar//
    public boolean brincar (){
        if (getEsta_vivo()){
            setEnergiaAtual(-2);
            setSaciedadeAtual(-1);
            setLimpezaAtual(-3);
            setDiamantes(1);
            setIdade_atual(1);
            return true;
        } 
        else {
            System.out.println("Seu bichinho está morto :C");
            return false;
        }
    }
    private void setIdade_atual(int i) {
    }

    private void setDiamantes(int i) {
    }

    private void setLimpezaAtual(int i) {
    }

    private void setSaciedadeAtual(int i) {
    }

    //agora ele irá se alimentar//
    private void setEnergiaAtual(int i) {
    }

    public boolean comer (){
        if (getEsta_vivo()){
            setEnergiaAtual(-1);
            setSaciedadeAtual(4);
            setLimpezaAtual(-2);
            setIdade_atual(1);
            return true;
        }  else {
            System.out.println("O que está fazendo? Voce demorou e ele morreu de fome :@");
            return false;
        }
    }
    //colocando ele para dormir//
        public boolean dormir (){
            if (getEsta_vivo()) {
                if (this.energiaAtual <= (this.energiaMAX - 5)){
                    setSaciedade(-2);
                    setIdade(this.energiaMAX - this.energiaAtual);
                    this.energiaAtual = this.energiaMAX;
                    return true;
            } 
            else {
                System.out.println("Ele já está descansando eternamente.");
                return false;
    }
}
            return esta_vivo;
        }
    //função para hora do banho//
        public boolean banho (){
            if (getEsta_vivo()){
                setEnergiaAtual(-3);
                setSaciedadeAtual(-1);
                setLimpezaAtual(limpezaMAX);
                setIdade_atual(2);
            return true;
        } else {
            System.out.println("Desista, ele não está mais entre nós!:c.");
            return false;
        }
    }
}

