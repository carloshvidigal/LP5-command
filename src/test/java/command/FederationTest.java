package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FederationTest {

    Federation federation;
    TransferWindow transferWindow;

    @BeforeEach
    void setUp() {
        federation = new Federation();
        transferWindow = new TransferWindow("2022/2");
    }

    @Test
    void shouldOpenTransferWindow() {
        Task TransferWindowOpening = new OpenTransferWindowTask(transferWindow);
        federation.performTask(TransferWindowOpening);

        assertEquals("Transfer window open", transferWindow.getSituation());
    }

    @Test
    void shouldCloseTransferWindow() {
        Task TransferWindowClosure = new CloseTransferWindowTask(transferWindow);
        federation.performTask(TransferWindowClosure);

        assertEquals("Transfer window closed", transferWindow.getSituation());
    }

    @Test
    void shouldCancelTransferWindowClosure() {
        Task transferWindowOpening = new OpenTransferWindowTask(transferWindow);
        Task transferWindowClosure = new CloseTransferWindowTask(transferWindow);

        federation.performTask(transferWindowOpening);
        federation.performTask(transferWindowClosure);

        federation.cancelLastTask();

        assertEquals("Transfer window open", transferWindow.getSituation());
    }

}
