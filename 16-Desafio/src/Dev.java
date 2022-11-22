import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getDevsInscritos().add(this);
        //adiciona os conteudos do bootcamp ao usuario inscrito
        this.conteudoInscrito.addAll(bootcamp.getConteudo());
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteudo");;
        }
    }

    public double calcularTotalXp() {
        return this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

}
