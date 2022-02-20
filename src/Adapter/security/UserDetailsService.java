package Adapter.security;


// adaptee
public interface UserDetailsService {

    UserDetails loadUser(String username);
}
