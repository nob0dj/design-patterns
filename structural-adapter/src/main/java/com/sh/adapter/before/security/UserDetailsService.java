package com.sh.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
