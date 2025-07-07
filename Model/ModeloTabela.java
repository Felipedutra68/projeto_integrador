package Model;

import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADM
 */
public class ModeloTabela extends AbstractTableModel {

    private static final String[] colunas = {"id", "Nome", "Sexo", "Classe"};
    private ArrayList<Cliente> clientes;

    public ModeloTabela(ArrayList<Cliente> clientes) {
        super();
        this.clientes = clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];

    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getId();
        } else if (columnIndex == 1) {
            return cliente.getNome();
        } else if (columnIndex == 2) {
            return cliente.getSexo();
        } else if (columnIndex == 3) {
            return cliente.getClasse();
        } else {
            return null;
        }

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public void removerClientePorID(String id) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.remove(i);
                fireTableRowsDeleted(i, i);
                break;
            }

        }

    }

    public void atualizarCliente(Cliente clienteAtualizado) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(clienteAtualizado.getId())) {
                clientes.set(i, clienteAtualizado);//substitue
                fireTableRowsDeleted(i, i);//atualiza so a linha alterada
                break;
            }

        }

    }

}
