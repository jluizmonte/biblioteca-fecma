package com.biblioteca.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

@SuppressWarnings("serial")
public class ColorirLinhaLivro extends DefaultTableCellRenderer {

    private final int colunaLivro;

    public ColorirLinhaLivro(int colunaTabela) {
        this.colunaLivro = colunaTabela;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus,
            int row, int col) {
        switch (table.getValueAt(row, colunaLivro).toString()) {

            case "0" -> {
                setForeground(Color.red);
                //     setBackground(new java.awt.Color(255,0,0));
                setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                setHorizontalAlignment(CENTER);
            }

            case "NOVO" -> {
                setForeground(new java.awt.Color(0, 110, 109));
                //      setBackground(new java.awt.Color(0, 110, 109));
                setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                setHorizontalAlignment(CENTER);
            }

            case "USADO" -> {
                setForeground(Color.red);
                //    setBackground(new java.awt.Color(0, 112, 192));       
                setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                setHorizontalAlignment(CENTER);
            }

            default -> {
                setForeground(Color.blue);
                //     setBackground(new java.awt.Color(0, 112,192));    
                setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                setHorizontalAlignment(CENTER);
            }
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return this;
    }

}
