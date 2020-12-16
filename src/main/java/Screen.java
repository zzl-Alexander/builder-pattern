public  class Screen implements Item{

    public String name() {
        return "Screen";
    }
    @Override
    public Parts parts() {
        return new Necessary();
    }

}
