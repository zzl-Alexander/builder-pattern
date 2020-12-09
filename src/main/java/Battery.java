public  class Battery implements Item{

    public String name() {
        return "Battery";
    }

    @Override
    public Parts parts() {
        return new Necessary();
    }

    public Parts part() {
        return new Necessary();
    }
}
