package structural.bridge.plataformas;

public class TwitchTV implements Plataforma{

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: A transmissão será iniciada em breve.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Últimas configurações...");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando TwitchTV");
    }
}
