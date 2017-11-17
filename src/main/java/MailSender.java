public class MailSender {

    void sendMail(MailInfo mailInfo){
        System.out.println(generateMessage(mailInfo));
    }

    private String generateMessage(MailInfo info){
        String gender = info.getClient().getSex() ? "mr" : "ms";
        String header = info.getMailHeader();
        String name = info.getClient().getName();

        return "message " + header + " sent to " + gender + " " + name;

    }
}
