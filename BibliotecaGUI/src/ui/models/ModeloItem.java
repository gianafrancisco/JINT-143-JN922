package ui.models;

import biblioteca.items.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloItem extends AbstractTableModel
{

    private String[] mColumnas = {"Titulo", "Tipo","Datos Extras"};
    private LinkedList<Item> mItems;

    public ModeloItem()
    {
        mItems = new LinkedList<Item>();
    }

    public ModeloItem(LinkedList<Item> lista)
    {
        mItems = lista;
    }

    @Override
    public int getRowCount()
    {
        int wRes = 25;
        if (mItems.size() > 25)
        {
            wRes = mItems.size();
        }
        return wRes;
    }

    @Override
    public int getColumnCount()
    {
        return mColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        String res = "";
        if (rowIndex < mItems.size())
        {
            Item aux = mItems.get(rowIndex);
            switch (columnIndex)
            {
                case 0:
                    res = aux.getTitulo();
                    break;
                case 1:
                    res = aux.getClass().getSimpleName();
                    break;
                case 2:
                    res = aux.toString();
                    break;
            }
        }
        return res;
    }

    @Override
    public String getColumnName(int column)
    {
        return mColumnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

    public Item getItem(int pRowIndex)
    {
        Item wResp = null;
        if(pRowIndex < mItems.size())
            wResp = mItems.get(pRowIndex);
        return wResp;
    }
}
