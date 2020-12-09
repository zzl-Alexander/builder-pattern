public class GPS implements Item{
    public String name() {
        return "GPS";
    }
    @Override
    public Parts parts() {
        return new Optional();
    }
    public Parts part() {
        return new Optional();
    }
}
