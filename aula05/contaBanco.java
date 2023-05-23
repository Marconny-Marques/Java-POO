package aula05;

public class contaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    // Métodos Personalizados
    /**
     * 
     */
    public void estadoAtual() { 
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:"+ this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo()<0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com suceso!");
        }
    }
    private int getSaldo() {
        return 0;
    }

    /**
     * @param i
     * 
     */
    public void depositar(int i) {
        if (this.getStatus()) {
            int v;
            int var;
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Deposito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    private boolean getStatus() {
        return false;
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insufuciente para saque!"); 

            }
         } else {
                System.out.println("Impóssível sacar de uma conta fechada!");
            }
        }
    /**
     * 
     */
    public void pagarMensal() {
         int v = 0;
         if (this.getTipo() =="CC") {
            v = 12;
         } else if (this.getTipo() == "CP"){
            v = 20;
         }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
         
    }

    //Métodos especiais
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    private void setStatus(boolean b) {
    }
    private void setSaldo(float f) {
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public String getDono() {
        return this.dono;
    }

    public void setDono(String string) {
    }
}
