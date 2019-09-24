import javax.swing.*;

public class Calcularmediahtest {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Serie4 S1 = new Serie4();
        Curso c1 = new Curso();
        Disciplina d1 = new Disciplina();



        //Media Curso ADS

        c1.nome = "ADS";
        String Curso, n1c, n2c, n3c, n4c, n5c, nsubc;
        double nota1c = 3.45, nota2c = 9.8, nota3c = 7.8, nota4c =3.4,  subc, media;

        media = (nota1c+nota2c+nota3c+nota4c)/4;

        JOptionPane.showMessageDialog(null,"Curso " +c1.nome+"\n"+"A média do Curso é "+media+"\n"+"","",JOptionPane.INFORMATION_MESSAGE);




        //media Serie 4

        S1.Série = 4;
        String Série, n1S, n2S, nsubS;
        double nota1S = 3.45, nota2S = 9.8, subS, mediaSerie;

        media = (nota1S + nota2S) / 2;

        JOptionPane.showMessageDialog(null, "Serie " + S1.Série + "\n" + "A média da Série é " + media + "\n" + "", "", JOptionPane.INFORMATION_MESSAGE);




        //media anderson
        a1.nome = "Anderson";
        a1.Curso = "ADS";
        a1.Disciplina= "LTP IV";
        a1.Serie = 4;
        String nome, n1, n2, nsub;
        double nota1 = 1.5, nota2 = 5.4, sub, mediaAluno;

        media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null,"Aluno " +a1.nome+"\n"+"A média do aluno é "+media+"\n"+"","",JOptionPane.INFORMATION_MESSAGE);


        //Media Discplina SO

        d1.Disciplina = "SO";
        String Disciplina, n1d, n2d, nsubd;
        double nota1d = 7.8, nota2d = 3.4,nota3d = 5.4, subd, mediaDisciplina;

        media = (nota1d + nota2d + nota3d) / 2;

        JOptionPane.showMessageDialog(null, "Disciplina " + d1.Disciplina + "\n" + "A média da Disciplina é " + media + "\n" + "", "", JOptionPane.INFORMATION_MESSAGE);



}
}