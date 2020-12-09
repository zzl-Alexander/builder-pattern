public class BuilderPatternDemo {
    public static void main(String[] args) throws NullPointerException{
        PhoneBuilder phoneBuilder = new PhoneBuilder();

        Phone Necessary = phoneBuilder.prepareNecessary();
        System.out.println("老年机");
        Necessary.showItems();

        System.out.println();

        Phone Camera = phoneBuilder.prepareCamera();
        System.out.println("有相机功能");
        Camera.showItems();

        System.out.println();

        Phone Flagship_Edition = phoneBuilder.prepareFlagship_Edition();
        System.out.println("旗舰版");
        Flagship_Edition.showItems();
    }
}
