package com.istlc.backend.usuarios_api.usuario.dto;
import java.util.Set;

public class UsuarioDto {
    private Long id;
    private String nombre;
    private String correo;
    private Boolean activo;
    private Set<String> roles;

    public UsuarioDto() {
    }

    public UsuarioDto(Long id, String nombre, String correo, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }


}