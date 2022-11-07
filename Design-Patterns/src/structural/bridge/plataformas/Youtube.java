package structural.bridge.plataformas;

public class Youtube implements Plataforma{

    public Youtube() {
        configureRMTP();
        System.out.println("YouTube: A transmissão será iniciada em breve.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: Últimas configurações...");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando YouTube");
    }
}
