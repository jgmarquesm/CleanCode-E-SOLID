package structural.bridge.plataformas;

public class Facebook implements Plataforma{

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: A transmissão será iniciada em breve.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Últimas configurações...");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Facebook");
    }
}
