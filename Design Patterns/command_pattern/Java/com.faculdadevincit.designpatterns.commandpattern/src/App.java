public class App {
    public static void main(String[] args) throws Exception {
        Luz luz = new Luz();
        LuzLigarCommand luzLigarCmd = new LuzLigarCommand(luz);
        LuzDesligarCommand luzDesligarCmd = new LuzDesligarCommand(luz);

        ControleRemoto controle = new ControleRemoto();

        controle.setCommand(luzLigarCmd);
        controle.pressionarBotao();

        controle.setCommand(luzDesligarCmd);
        controle.pressionarBotao();

        controle.desfazerPressionar();
    }
}
