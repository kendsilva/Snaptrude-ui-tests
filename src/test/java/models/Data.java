package models;

/**
 * Created by kendsilva on 3/21/18.
 */
public class Data {

    private String snaptrudeUrl;
    private String emailId;
    private String myPassword;
    private String subscriptionMessage;

    public String getSnaptrudeUrl() {
        return snaptrudeUrl;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setSnaptrudeUrl(String snaptrudeUrl) {
        this.snaptrudeUrl = snaptrudeUrl;
    }

    public String getMyPassword() {
        return myPassword;
    }

    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }

    public String getSubscriptionMessage() {
        return subscriptionMessage;
    }

    public void setSubscriptionMessage(String subscriptionMessage) {
        this.subscriptionMessage = subscriptionMessage;
    }
}
