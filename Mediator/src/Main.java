public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.setButton(new Button());
        mediator.setFan(new Fan());
        mediator.setPowerSupplier(new PowerSupplier());
        mediator.start();
        mediator.stop();
    }
}
