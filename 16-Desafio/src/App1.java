import java.time.LocalDate;

public class App1 {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso javascript para iniciantes");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Mentoria de projeto java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Vitor");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev1.getConteudoInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println(" ----------------- ");
        System.out.println("Conteudos inscritos" + dev1.getConteudoInscrito());
        System.out.println("Conteudos concluidos" + dev1.getConteudoConcluido());
        System.out.println("XP " + dev1.calcularTotalXp());

        System.out.println(" - ");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev2.getConteudoInscrito());
        dev2.progredir();
        System.out.println(" ----------------- ");
        System.out.println("Conteudos inscritos" + dev2.getConteudoInscrito());
        System.out.println("Conteudos concluidos" + dev2.getConteudoConcluido());
        System.out.println("XP " + dev2.calcularTotalXp());

    }
}
