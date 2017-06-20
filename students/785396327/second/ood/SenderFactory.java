package second.ood;

/**
 * Created by william on 2017/6/20.
 */
public class SenderFactory {
    public static BaseUtil createSenderByMethod(int method) {
        switch (method) {
            case Constant.Method.EMAIL_LOG:
                return new MailUtil();
            case Constant.Method.SMS_LOG:
                return new SMSUtil();
            case Constant.Method.PRINT_LOG:
                return new PrintUtil();
            default:
                return null;
        }
    }
}
