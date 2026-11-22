package rmiClient;

import javax.naming.InitialContext;
import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
    public static void main(String[] args) throws Exception {
        InitialContext ctx = new InitialContext();
        IBanque banque = (IBanque) ctx.lookup("BanqueService");

        System.out.println(banque.creeCompte(new Compte(1, 1000)));
        System.out.println(banque.creeCompte(new Compte(1, 500)));
        System.out.println(banque.getInfoCompte(1));
        System.out.println(banque.getInfoCompte(99));
    }
}