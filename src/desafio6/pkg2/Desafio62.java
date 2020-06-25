package desafio6.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio62 {
    public static void main(String[] args) {
        int idade, maiorIdade, menorIdade, genero, m, pessoas;
        double salario, mediaDeSalarios, salarioTotal;
        
        idade = 1;
        genero = 0;
        m = 0;
        salario = 0;
        pessoas = 0;
        salarioTotal = 0;
        maiorIdade = 0;
        menorIdade = 0;
        while ( idade >= 0) {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Uma idade negativa encerra o processo\nIdade:"));
        genero = Integer.parseInt(JOptionPane.showInputDialog("Gênero:\n1 - Feminino    2 - Masculino"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
        pessoas += 1;
        salarioTotal += salario;
        }
        
        if (genero == 1 && salario <= 100) {
                m += 1;
        }
        if (idade >= 0) {
            if (pessoas == 0) {
                maiorIdade = idade;
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }
        
        mediaDeSalarios = salarioTotal/pessoas;
        
        JOptionPane.showMessageDialog(null, "A media de salário do grupo é: R$"+mediaDeSalarios+"\nMaior idade: "+maiorIdade+"      Menor idade: "+menorIdade+"\nQuantidade de mulheres com salário até R$100,00: "+m);
    }    
}