package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.middlewares.CheckPermissionMiddlewares;
import behavioral.chainOfResponsibility.middlewares.CheckUsersMiddlewares;
import behavioral.chainOfResponsibility.middlewares.Middleware;
import behavioral.chainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Nesse Partern, transformamos comportamentos em objetos independentes chamados Handlers. Os Handlers fazem a verificação
 de alguma propridada, executa métodos, etc, de modo que se uma dessas verificações falharem, o processamento é descontinuado.
 */

public class MainChainOfResposibility {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init(){
        server = new Server();
        server.registerUser("master@teste.com.br", "BBK766$(@_on0");
        server.registerUser("email@test.com", "12345678");

        Middleware middleware = new CheckUsersMiddlewares(server);
        middleware.linkWith(new CheckPermissionMiddlewares());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean done;

        do{
            System.out.println("Digite o seu email: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.login(email, password);
        }while (!done);
    }

}
