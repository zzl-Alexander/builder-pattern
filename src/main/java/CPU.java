public class CPU implements Item {

    public String name() {
        return "CPU";
    }

    @Override
    public Parts parts() {
        return new Necessary();
    }

    public Parts part() {
        return new Necessary();
    }

}
