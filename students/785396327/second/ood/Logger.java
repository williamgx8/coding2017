package second.ood;

/**
 * Created by IBM on 2017/6/20.
 */
public class Logger {

    private int type = 0;
    int method = 0;

    public Logger(int logType, int logMethod) {
        this.type = logType;
        this.method = logMethod;
    }

    public void log(String msg) {
        String message = MessageFactory.createMessageByType(this.type, msg);
        BaseUtil senderByMethod = SenderFactory.createSenderByMethod(this.method);
        Sender.send(senderByMethod, message);
    }
}
