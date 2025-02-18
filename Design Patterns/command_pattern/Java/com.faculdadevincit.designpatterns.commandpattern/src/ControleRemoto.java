public class ControleRemoto {
     private ICommand command;

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    } 

    public void pressionarBotao() {
        command.executar();
    }

    public void desfazerPressionar() {
        command.desfazer();
    }
}
