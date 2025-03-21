package com.mycompany.gold99;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class myRTable extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        Object valorColuna2 = table.getValueAt(row, 2);
        if (valorColuna2 != null) {
            String status = valorColuna2.toString();
            if (status.equals("C")) {
                cell.setBackground(Color.GREEN);
                cell.setForeground(Color.BLACK);
            } else if (status.equals("D")) {
                cell.setBackground(Color.YELLOW);
                cell.setForeground(Color.BLACK);
            } else {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        } else {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }

        if (isSelected) {
            cell.setBackground(Color.BLUE);
            cell.setForeground(Color.WHITE);
        }

        return cell;
    }
}
