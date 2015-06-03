/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonathanfinger.financeiro.entidades;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Finger
 */
@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioBean {

    /**
     * All the fields
     * @author JonathanFinger
     * @Data 3/06/2015
     */
    private String nome;
    private String email;
    private String senha;
    private String confirmaSenha;

    public String novo(){
        return "usuario";
    }
    public String salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if (!getSenha().equalsIgnoreCase(getConfirmaSenha())) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha confirmada incorretamente!", ""));
            return "usuario";
        }
        //salva o usuario
        return "mostraUsuario";
    }
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }

    
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
