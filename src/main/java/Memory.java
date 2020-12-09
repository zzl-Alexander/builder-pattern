public  class Memory implements Item{

    public String name() {
        return "Memory";
    }
    @Override
    public Parts parts() {
        return new Necessary();
    }
    public Parts part() {
        return new Necessary();
    }
}
