/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delta.util;

/**
 *
 * @author 01332
 */
public class Config {
    
    private String urlArquivo;
    private String urlSalvar;

    public Config() {
    
    }

    public Config(String urlArquivo, String urlSalvar) {
        this.urlArquivo = urlArquivo;
        this.urlSalvar = urlSalvar;
    }

    public String getUrlArquivo() {
        return urlArquivo;
    }

    public void setUrlArquivo(String urlArquivo) {
        this.urlArquivo = urlArquivo;
    }

    public String getUrlSalvar() {
        return urlSalvar;
    }

    public void setUrlSalvar(String urlSalvar) {
        this.urlSalvar = urlSalvar;
    }
    
    
}
