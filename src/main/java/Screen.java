public  class Screen implements Item{

    public String name() {
        return "Screen";
    }
    @Override
    public Parts parts() {
        return new Necessary();
    }
    public Parts part() {
        return new Necessary();
    }
}
