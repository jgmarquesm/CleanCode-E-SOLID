package behavioral.chainOfResponsibility.middlewares;

public class CheckPermissionMiddlewares extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@teste.com.br")){
            System.out.println("Bem vindo: ADM");
            return true;
        }
        System.out.println("Bem vindo!");
        return checkNext(email, password);
    }
}
