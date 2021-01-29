/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delta.produto;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 *
 * @author 01332
 */
public class Produto {
    
    private String codigo;
    private String descricao;
    private String valor;
    private String ncm;
    private String peso;
    
    private List<Produto> listaProdutos = new ArrayList<>();

    public Produto() {
    
    }
    
    public Produto(String codigo, String descricao, String valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(String codigo, String descricao, String valor, String ncm, String peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.ncm = ncm;
        this.peso = peso;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
    
    public void setListaProdutos(List<Produto> listaChamados) {
        this.listaProdutos = listaChamados;
    }    

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

   
    
}
