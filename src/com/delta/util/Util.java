/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delta.util;

import com.delta.produto.Produto;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author 01332
 */
public class Util {

    public static Config config = new Config();

    public static String configurarValor(String valor) {
        Locale meuLocal = new Locale( "pt", "BR" );
        NumberFormat nfVal = NumberFormat.getCurrencyInstance(meuLocal);
        String novoValor = nfVal.format(Double.parseDouble(valor));
        //String novoValor = String.valueOf(valor);
        return novoValor.replace("R$ ", "").replace(".", "").replace(",", ".").trim();
    }

    public static void duasColunas(Sheet sheet, int linhas, String urlSalvar) {
        String ms = "";
        for (int i = 0; i < linhas; i++) {
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);

            String as1 = a1.getContents();
            String as2 = a2.getContents();
            //ms += "::" + as1 + ":" + as2 + "::::::" + as3.replace(",", ".") + "::\n";
            ms += "::" + as1 + "::::::" + as2 + ":::\n";
            gerarTxt(ms, urlSalvar);
        }
    }

    public static void tresColunas(Sheet sheet, int linhas, String urlSalvar) {
        String ms = "";
        for (int i = 0; i < linhas; i++) {
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);

            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            ms += "::" + as1 + ":" + as2 + "::::::" + Util.configurarValor(as3) + "::\n";
            gerarTxt(ms, urlSalvar);
        }
    }

    public static void quatroColunas(Sheet sheet, int linhas, String urlSalvar) {
        String ms = "";
        for (int i = 0; i < linhas; i++) {
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);
            Cell a4 = sheet.getCell(3, i);
            Cell a5 = sheet.getCell(4, i);

            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            String as4 = a4.getContents();
            String as5 = a5.getContents();
            //1-codigo/2-descricao/3-classe_fiscal/4-peso_unitario/5-preco_publico
            ms += "::" + as1 + ":" + as2 + ":::" + as3 + "::" + as4 + ":" + Util.configurarValor(as5) + "::\n";
            gerarTxt(ms, urlSalvar);
        }
    }

    public static void cincoColunas(Sheet sheet, int linhas, String urlSalvar) {
        StringBuilder ms = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);
            Cell a4 = sheet.getCell(3, i);
            Cell a5 = sheet.getCell(4, i);

            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            String as4 = a4.getContents();
            String as5 = a5.getContents();
            //1-codigo/2-descricao/3-classe_fiscal/4-peso_unitario/5-preco_publico
            //ms += "::" + as1 + ":" + as2 + ":::" + as3 + "::" + as4 + ":" + Util.configurarValor(Double.parseDouble(as5)) + "::\n";
            ms.append("::").append(as1).append(":").append(as2).append(":::").append(as3).append("::").append(as4).append(":").append(Util.configurarValor(as5)).append("::\n");
            gerarTxt(ms.toString(), urlSalvar);
        }
    }

    public static void lerArquivoXLS(String urlArquivo, String urlSalvar, int qtdColunas) throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook(new File(urlArquivo));
        Sheet sheet = workbook.getSheet(0);
        int linhas = sheet.getRows();

        System.out.println("Iniciando a leitura da planilha XLS:");
        String ms = "";
        if (qtdColunas == 2) {
            tresColunas(sheet, linhas, urlSalvar);
        }

        if (qtdColunas == 3) {
            tresColunas(sheet, linhas, urlSalvar);
        }

        if (qtdColunas == 5) {
            cincoColunas(sheet, linhas, urlSalvar);
        }

        workbook.close();
        JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
    }

    public static void gerarTxt(String texto, String url) {
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File(url));
            arquivo.append(texto);
            arquivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public static void lerArquivoXLXS(String urlExcel, String urlTxt) throws IOException {
        System.out.println("Lendo arquivo no formato XLXS dos Analistas");
        FileInputStream arquivo = new FileInputStream(urlExcel);
        XSSFWorkbook wb = new XSSFWorkbook(arquivo);
        Sheet sheet = (Sheet) wb.getSheet("");
        int lin = sheet.getRows();
        //Iterator linhas = sheet.rowIterator();
        System.out.println("Iniciando a leitura da planilha XLS:");
        String ms = "";

        for (int i = 0; i < lin; i++) {
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);

            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            ms += "::" + as1 + ":" + as2 + "::::::" + as3 + "::\n";
            gerarTxt(ms, urlTxt);
        }
        wb.cloneSheet(lin);
        JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
    }

    public static void lerArquivoXLXS3Colunas(BufferedInputStream buf, String urlSalvar) {
        System.out.println("Lendo arquivo no formato XLXS dos Chamados 3 colunas");
        try {
            XSSFWorkbook wb = new XSSFWorkbook(buf);
            org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
            Iterator linhas = sheet.rowIterator();
            List<Produto> listaProdutos = new ArrayList<>();
            String msg = "";
            System.out.println("Aberto arquivo XLXS dos Chamados.\nSerá iniciado a leitura dos registros.");
            while (linhas.hasNext()) {
                XSSFRow linha = (XSSFRow) linhas.next();
                Iterator celulas = linha.cellIterator();
                Produto call = new Produto();
                while (celulas.hasNext()) {
                    XSSFCell celula = (XSSFCell) celulas.next();
                    int z = celula.getColumnIndex();
                    
                    switch (z) {
                        case 0:
                            call.setCodigo(celula.toString());
                            break;
                        case 1:
                            call.setDescricao(celula.toString());
                            break;
                        case 2:
                            call.setValor(celula.toString());
                            break;
                        default:
                            break;
                    }

                }
                listaProdutos.add(call);
            }
            int tamanho = listaProdutos.size();
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println(listaProdutos.get(i).toString());
                msg += "::" + listaProdutos.get(i).getCodigo().replace(".0", "") + ":" + listaProdutos.get(i).getDescricao() + "::::::" + Util.configurarValor(listaProdutos.get(i).getValor()) + "::\n";
                gerarTxt(msg, urlSalvar);
                if (i == tamanho) {                        
                    break;
                }
            }

            System.out.println(listaProdutos.size());
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
            System.out.println("Leitura do arquivo de xls realizada com sucesso.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: na hora de abrir dos processos no formato XLXS");
            System.out.println("Deu erro no arquivo XLXS dos Chamados");
            System.out.println(e.getMessage());
        }
    }

    public static void lerArquivoXLXS2Colunas(BufferedInputStream buf, String urlSalvar) {
        System.out.println("Lendo arquivo no formato XLXS dos Chamados 3 colunas");
        try {

            XSSFWorkbook wb = new XSSFWorkbook(buf);
            org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
            Iterator linhas = sheet.rowIterator();
            List<Produto> listaProdutos = new ArrayList<>();
            String msg = "";
            System.out.println("Aberto arquivo XLXS dos Chamados.\nSerá iniciado a leitura dos registros.");
            while (linhas.hasNext()) {
                XSSFRow linha = (XSSFRow) linhas.next();
                Iterator celulas = linha.cellIterator();

                Produto call = new Produto();

                while (celulas.hasNext()) {
                    XSSFCell celula = (XSSFCell) celulas.next();
                    int z = celula.getColumnIndex();

                    switch (z) {
                        case 0:
                            call.setCodigo(celula.toString());
                            break;
                        case 1:
                            call.setPeso(celula.toString());
                            break;
                        default:
                            break;
                    }

                }
                // System.out.println(call);
                listaProdutos.add(call);
            }
            for (Produto produto : listaProdutos) {
                //msg += "::" + produto.getCodigo() + ":" + produto.getDescricao() + "::::::" + produto.getValor().replace(",", ".") + "::\n";
                msg += "::" + produto.getCodigo() + "::::::" + produto.getPeso() + ":::\n";
                gerarTxt(msg, urlSalvar);
            }
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
            System.out.println("Leitura do arquivo de xls realizada com sucesso.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: na hora de abrir dos processos no formato XLXS");
            System.out.println("Deu erro no arquivo XLXS dos Chamados");
            System.out.println(e.getMessage());
        }
    }

    public static void lerArquivoXLXS5Colunas(BufferedInputStream buf, String urlSalvar) {
        System.out.println("Lendo arquivo no formato XLXS dos Chamados 5 colunas");
        try {
            XSSFWorkbook wb = new XSSFWorkbook(buf);
            org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(0);
            Iterator linhas = sheet.rowIterator();
            List<Produto> listaProdutos = new ArrayList<>();
            String msg = "";
            System.out.println("Aberto arquivo XLXS dos Chamados.\nSerá iniciado a leitura dos registros.");
            while (linhas.hasNext()) {
                XSSFRow linha = (XSSFRow) linhas.next();
                Iterator celulas = linha.cellIterator();
                Produto call = new Produto();

                while (celulas.hasNext()) {
                    XSSFCell celula = (XSSFCell) celulas.next();
                    int z = celula.getColumnIndex();

                    switch (z) {
                        case 0:
                            call.setCodigo(celula.toString());
                            break;
                        case 1:
                            call.setDescricao(celula.toString());
                            break;
                        case 2:
                            call.setNcm(celula.toString());
                            break;
                        case 3:
                            call.setPeso(celula.toString());
                            break;
                        case 4:
                            call.setValor(celula.toString());
                            break;
                        default:
                            break;
                    }

                }
                // System.out.println(call);
                listaProdutos.add(call);
            }
            for (Produto produto : listaProdutos) {
                msg += "::" + produto.getCodigo() + ":" + produto.getDescricao() + ":::" + produto.getNcm() + "::" + produto.getPeso() + ":" + Util.configurarValor(produto.getValor()) + "::\n";
                gerarTxt(msg, urlSalvar);
            }
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
            System.out.println("Leitura do arquivo de xls realizada com sucesso.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: na hora de abrir dos processos no formato XLXS");
            System.out.println("Deu erro no arquivo XLXS dos Chamados");
            System.out.println(e.getMessage());
        }
    }
}
