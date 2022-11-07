package behavioral.chainOfResponsibility.middlewares;

import behavioral.chainOfResponsibility.server.Server;

public class CheckUsersMiddlewares extends Middleware{
    private Server server;

    public CheckUsersMiddlewares(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("Email inválido.");
            return false;
        }

        if (!server.isValidPassword(email, password)){
            System.out.println("Email ou senha incorretos.");
            return false;
        }

        return checkNext(email, password);
    }
}
