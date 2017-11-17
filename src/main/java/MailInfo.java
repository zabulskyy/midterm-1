public class MailInfo {
    private Client client;
    private MailType mailType;
    private String mailText;
    private String mailHeader;

    public MailInfo(MailType type, String text, Client client, String topic) {
        this.client = client;
        this.mailType = type;
        this.mailText = text;
        this.mailHeader = topic;
    }



    public Client getClient() {
        return client;
    }

    public MailInfo setClient(Client client) {
        this.client = client;
        return this;
    }

    public MailType getMailCode() {
        return mailType;
    }

    public MailInfo setMailCode(MailType mailCode) {
        this.mailType = mailCode;
        return this;
    }

    public String getMailText() {
        return mailText;
    }

    public MailInfo setMailText(String mailText) {
        this.mailText = mailText;
        return this;
    }

    public String getMailHeader() {
        return mailHeader;
    }

    public MailInfo setMailHeader(String mailHeader) {
        this.mailHeader = mailHeader;
        return this;
    }
}
