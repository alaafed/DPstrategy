public class App {
    public static void main(String[] args) {
         Context context= new Context();
         context.setStrategy(new IstrategyImpl2());
         context.appliquerStrategy();
        context.setStrategy(new IstrategyImpl1());
        context.appliquerStrategy();
        context.setStrategy(new IstrategyImpl3());
        context.appliquerStrategy();

    }
}
