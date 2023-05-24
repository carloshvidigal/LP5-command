package command;

public class OpenTransferWindowTask implements Task{

    private TransferWindow transferWindow;

    public OpenTransferWindowTask(TransferWindow transferWindow) {
        this.transferWindow = transferWindow;
    }

    public void perform() {
        this.transferWindow.openTransferWindow();
    }

    public void cancel() {
        this.transferWindow.closeTransferWindow();
    }
}
