import java.util.ArrayList;
import java.util.List;

public class Elevador {

    private double cargaMaxima;
    private int numeroDeAndares;
    private double cargaAtual;
    private int andarAtual;
    private List<Pessoa> listaDePessoas = new ArrayList<>();

    public Elevador() {
    }

    public Elevador(double cargaMaxima, int numeroDeAndares, double cargaAtual, int andarAtual, List<Pessoa> listaDePessoas) {
        this.cargaMaxima = cargaMaxima;
        this.numeroDeAndares = numeroDeAndares;
        this.cargaAtual = cargaAtual;
        this.andarAtual = andarAtual;
        this.listaDePessoas = listaDePessoas;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumeroDeAndares() {
        return numeroDeAndares;
    }

    public void setNumeroDeAndares(int numeroDeAndares) {
        this.numeroDeAndares = numeroDeAndares;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public void setListaDePessoas(List<Pessoa> listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        listaDePessoas.add(pessoa);
        this.cargaAtual += pessoa.getPeso();
       // this.statusAtual();
    }

    public void removerPessoa(String nome) {
        Pessoa pessoASerRemovida = null;
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                this.cargaAtual -= pessoa.getPeso();
                pessoASerRemovida = pessoa;
                break;
            }
        }
        if (pessoASerRemovida != null) {
            listaDePessoas.remove(pessoASerRemovida);
        }
        this.statusAtual();
    }

    public void subir() {
        if (this.andarAtual < this.numeroDeAndares && this.cargaAtual <= this.cargaMaxima) {
            this.andarAtual++;
        } else if (this.cargaAtual > this.cargaMaxima) {
            System.out.println("Carga excedida! O elevador não pode se mover até que a carga se normalize.");
        }
        this.statusAtual();
    }

    public void descer() {
        if (this.andarAtual > 0 && this.cargaAtual <= this.cargaMaxima) {
            this.andarAtual--;
        } else if (this.cargaAtual > this.cargaMaxima) {
            System.out.println("Carga excedida! O elevador não pode se mover até que a carga se normalize.");
        }
        this.statusAtual();
    }

    public void statusAtual() {
        System.out.println("NÚMERO DE ANDARES: " + this.numeroDeAndares);
        System.out.println("CARGA MÁXIMA: " + this.cargaMaxima);
        System.out.println("CARGA ATUAL: " + this.cargaAtual);
        System.out.println("PESSOAS: " + this.listaDePessoas);
        System.out.println("ANDAR ATUAL: " + this.andarAtual );
    }
}

