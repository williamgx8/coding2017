package second.ood;

/**
 * Created by william on 2017/6/20.
 */
public class MessageFactory {

    public static String createMessageByType(int type, String message) {
        switch (type) {
            case Constant.Type.RAW_LOG:
                return message;
            case Constant.Type.RAW_LOG_WITH_DATE:
                String txtDate = DateUtil.getCurrentDateAsString();
                message = txtDate + ": " + message;
                return message;
            default:
                return null;
        }
    }
}
