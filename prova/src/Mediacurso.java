import javax.swing.JOptionPane;

public class Mediacurso
{
    public static void main (String[]args){


        String nome, n1, n2, n3, nsub;
        double nota1, nota2, nota3, sub, media;


        nome = JOptionPane.showInputDialog("Digite o nome do Curso ");


        n1 = JOptionPane.showInputDialog("Digite a Primeira Nota ");
        n2 = JOptionPane.showInputDialog("Digite a Segunda Nota");



        nota1 = Double.parseDouble(n1);
        nota2 = Double.parseDouble(n2);


        media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null,"Curso " +nome+"\n"+"A média do do curso é "+media+"\n"+"","",JOptionPane.INFORMATION_MESSAGE);
    }
}