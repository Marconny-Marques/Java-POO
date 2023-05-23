package aula05;

public class aula05 {
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.estadoAtual();
        p1.abrirConta("CC");

        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
