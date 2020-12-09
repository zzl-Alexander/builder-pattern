public class PhoneBuilder {

    public Phone prepareNecessary(){
        Phone phone = new Phone();
        phone.addItem(new CPU());
        phone.addItem(new Memory());
        phone.addItem(new Battery());
        phone.addItem(new Screen());
        return phone;
    }
    public Phone prepareCamera(){
        Phone phone = new Phone();
        phone.addItem(new CPU());
        phone.addItem(new Memory());
        phone.addItem(new Battery());
        phone.addItem(new Screen());
        phone.addItem(new Camera());
        return phone;
    }

    public Phone prepareFlagship_Edition(){
        Phone phone = new Phone();
        phone.addItem(new CPU());
        phone.addItem(new Memory());
        phone.addItem(new Battery());
        phone.addItem(new Screen());
        phone.addItem(new Camera());
        phone.addItem(new GPS());
        phone.addItem(new Fingerprint_identification());
        phone.addItem(new NFC());
        return phone;
    }

}
