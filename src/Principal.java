import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal {
        public static void main(String[] args) throws Exception {
                double investimentoInicial = Double
                                .parseDouble(JOptionPane.showInputDialog("Investimento Inicial"));
                double investimentoMensal = Double
                                .parseDouble(JOptionPane.showInputDialog("Investimento Mensal"));
                int quantidadeMeses = Integer
                                .parseInt(JOptionPane.showInputDialog("Quantidade de Meses Investindo"));
                double porcentagemRendimentoMensal = Double
                                .parseDouble(JOptionPane.showInputDialog("Porcentagem de Rendimento Mensal"));

                DecimalFormat df = new DecimalFormat();
                double resultado = CalculadoraInvestimento
                                .montanteFinal(investimentoInicial, investimentoMensal, quantidadeMeses,
                                                porcentagemRendimentoMensal);

                JOptionPane.showMessageDialog(null, " R$ " + df.format(resultado),
                                "Montante Final", JOptionPane.INFORMATION_MESSAGE);
        }
}
