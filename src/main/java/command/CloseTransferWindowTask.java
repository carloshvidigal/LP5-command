package command;

public class CloseTransferWindowTask implements Task{

    private TransferWindow transferWindow;

    public CloseTransferWindowTask(TransferWindow transferWindow) {
        this.transferWindow = transferWindow;
    }

    public void perform() {
        this.transferWindow.closeTransferWindow();
    }

    public void cancel() {
        this.transferWindow.openTransferWindow();
    }
}
