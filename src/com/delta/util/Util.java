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
import java.util.Iterator;
import javax.swing.JOptionPane;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author 01332
 */
public class Util {
    
    public static Config config = new Config();
    
    public static void lerArquivoExcel(String urlArquivo, String urlSalvar) throws IOException, BiffException{
        Workbook workbook = Workbook.getWorkbook(new File(urlArquivo));
        Sheet sheet = workbook.getSheet(0);
        int linhas = sheet.getRows();
        
        System.out.println("Iniciando a leitura da planilha XLS:");
        String ms = "";
                
        for(int i = 0; i < linhas; i++){
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);
            
            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            ms+= ":::" + as1 + ":" + as2 + "::::::"+ as3+"::\n";            
            gerarTxt(ms, urlSalvar);
        }
        workbook.close();
        JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
    }
    
    public static void gerarTxt(String texto, String url){
        FileWriter arquivo;
	try {
	    arquivo = new FileWriter(new File(url));
	    arquivo.write(texto);
	    arquivo.close();
	} catch (IOException e) {
	    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
	}
    }
    
     public static void lerArqXlxs(String urlExcel, String urlTxt) throws IOException {
        System.out.println("Lendo arquivo no formato XLXS dos Analistas");
        FileInputStream arquivo = new FileInputStream(urlExcel);

        XSSFWorkbook wb = new XSSFWorkbook(arquivo);
        Sheet sheet = (Sheet) wb.getSheetAt(0);
        int lin = sheet.getRows();
            //Iterator linhas = sheet.rowIterator();
        System.out.println("Iniciando a leitura da planilha XLS:");
        String ms = "";
                
        for(int i = 0; i < lin; i++){
            Cell a1 = sheet.getCell(0, i);
            Cell a2 = sheet.getCell(1, i);
            Cell a3 = sheet.getCell(2, i);
            
            String as1 = a1.getContents();
            String as2 = a2.getContents();
            String as3 = a3.getContents();
            ms+= ":::" + as1 + ":" + as2 + "::::::"+ as3+"::\n";            
            gerarTxt(ms, urlTxt);
        }
        wb.cloneSheet(lin);
        JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
    }
    
    
    
}
