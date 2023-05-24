package command;

public class TransferWindow {

    private String season;
    private String situation;

    public TransferWindow(String season) {
        this.season = season;
    }

    public String getSituation() {
        return situation;
    }

    public void openTransferWindow() {
        this.situation = "Transfer window open";
    }

    public void closeTransferWindow() {
        this.situation = "Transfer window closed";
    }

}
