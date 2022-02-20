package Adapter;

import Adapter.security.UserDetails;
import Adapter.security.UserDetailsService;


//ADAPTER
public class AccontUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccontUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }

}
