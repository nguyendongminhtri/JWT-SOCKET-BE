package com.example.demo.dto.response;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Set;

public class JwtResponse {
    private Long id;
    private String token;
    private String type = "Bearer";
    private String name;
    private String username;
    private String avatar;
    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse() {
    }

    public JwtResponse(Long id, String token, String type, String name, String username, String avatar, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.token = token;
        this.type = type;
        this.name = name;
        this.username = username;
        this.avatar = avatar;
        this.roles = roles;
    }

    public JwtResponse(String token, String name, String username, String avatar, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.name = name;
        this.username = username;
        this.avatar = avatar;
        this.roles = authorities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }
}
