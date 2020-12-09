public class NFC implements Item{
    public String name() {
        return "NFC";
    }
    @Override
    public Parts parts() {
        return new Optional();
    }
    public Parts part() {
        return new Optional();
    }
}
