package Adapter.security;

import Adapter.AccontUserDetailsService;
import Adapter.AccountService;

public class App {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        UserDetailsService userDetailsService = new AccontUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("jinsoo", "jinsoo");
        System.out.println(login);
    }
}
