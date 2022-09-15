package com.sh.adapter.after2.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
