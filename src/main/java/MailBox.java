import java.util.ArrayList;

public class MailBox {
    private MailTypes infos;
    private ArrayList<MailInfo> container;
    private ArrayList<Client> clients;

    public MailBox addClient(Client c) {
        this.clients.add(c);
        return this;
    }

    MailBox() {
        this.clients = new ArrayList<Client>();
        this.infos = new MailTypes();
        this.container = new ArrayList<MailInfo>();
        MailType bDayGirl = new MailType("b-day letter for girl");
        bDayGirl.setAgeRange(1, 14);
        bDayGirl.setSex(false);

        MailType businessLetter = new MailType("business letter");
        businessLetter.setAgeRange(22, 100);

        this.infos.addNewMailType(bDayGirl);
        this.infos.addNewMailType(businessLetter);
    }

    void addMailInfo(MailInfo mailInfo) {
        this.container.add(mailInfo);
    }

    void sendAll() {
        MailSender ms = new MailSender();
        for (MailInfo mail : this.container) {
            ms.sendMail(mail);
        }
    }

    public static void main(String[] args) {
        MailBox mb = new MailBox();
        MailType bDayBoy = new MailType("b-day letter for boy");
        Client boy = new Client("Bobby", 12, true, "littel boy");
        MailInfo mail = new MailInfo(bDayBoy, "wish you all the best!!", boy, "Happy b-day to YOU!");


        mb.addMailInfo(mail);
        mb.sendAll();
    }

}
