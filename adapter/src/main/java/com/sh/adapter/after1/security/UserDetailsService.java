package com.sh.adapter.after1.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
