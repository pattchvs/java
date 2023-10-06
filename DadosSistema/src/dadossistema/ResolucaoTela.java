package dadossistema;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tools = Toolkit.getDefaultToolkit();
        Dimension tela = tools.getScreenSize();
        System.out.println("A resolução da tela atual é:");
        System.out.print(tela.width);
        System.out.print(" x ");
        System.out.print(tela.height);
    }
}
