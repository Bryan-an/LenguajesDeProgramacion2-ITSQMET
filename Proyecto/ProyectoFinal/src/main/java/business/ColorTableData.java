package business;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ColorTableData extends DefaultTableCellRenderer {

    private final int columna_patron;

    public ColorTableData(int Colpatron) {
        this.columna_patron = Colpatron;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        Font font = new Font("Dialogo", Font.BOLD, 12);
        if (Integer.parseInt(table.getValueAt(row, columna_patron).toString()) < 30) {
            setForeground(Color.RED);
            setFont(font);
        }else{
            setForeground(Color.BLACK);
            setFont(font);
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return this;
    }

}
