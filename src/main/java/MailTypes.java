import java.util.HashMap;

public class MailTypes {
    private HashMap<Integer, MailType> container;
    private int index;

    public MailTypes() {
        this.container = new HashMap<Integer, MailType>();
    }

    public MailType getMailType(int index) {
        try {
            return this.container.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such index");
        }
        return this.container.get(index);
    }


    public void addNewMailType(MailType mailType) {
        this.container.put(this.index++, mailType);
        System.out.println(mailType + " added with index " + this.index);
    }
}
