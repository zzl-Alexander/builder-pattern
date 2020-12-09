public class Camera implements Item{

    public String name() {
        return "Camera";
    }

    @Override
    public Parts parts() {
        return new Optional();
    }

    public Parts part() {
        return new Optional();
    }
}
