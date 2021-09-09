package data;

import domain.RawMaterial;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RawMaterialDAO {

    //SQL Staments
    private static final String SQL_SELECT = "SELECT * FROM raw_materials";

    private static final String SQL_INSERT
            = "INSERT INTO raw_materials (name, description, price, quantity, best_by, supplier_id) VALUES (?,?,?,?,?,?)";

    private static final String SQL_UPDATE
            = "UPDATE raw_materials SET name=?, description=?, price=?, quantity=?, best_by=?, supplier_id=? WHERE id=?";

    private static final String SQL_DELETE
            = "DELETE FROM raw_materials WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor 
    public RawMaterialDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<RawMaterial> select() throws SQLException {
        List<RawMaterial> rawMaterials = new ArrayList<RawMaterial>();

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_SELECT);
            results = statement.executeQuery();

            while (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String description = results.getString(3);
                double price = results.getDouble(4);
                int quantity = results.getInt(5);
                Date bestBy = results.getDate(6);
                Long supplierId = (Long) results.getObject(7);

                RawMaterial rawMaterial = new RawMaterial(id, name, description, price, quantity, bestBy, supplierId);

                rawMaterials.add(rawMaterial);
            }
        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return rawMaterials;
    }

    public RawMaterial select(int rawMaterialId) throws SQLException {
        RawMaterial rawMaterial = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM raw_materials WHERE id=?");
            statement.setInt(1, rawMaterialId);

            results = statement.executeQuery();

            if (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String description = results.getString(3);
                double price = results.getDouble(4);
                int quantity = results.getInt(5);
                Date bestBy = results.getDate(6);
                Long supplierId = (Long) results.getObject(7);

                rawMaterial = new RawMaterial(id, name, description, price, quantity, bestBy, supplierId);
            }
        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return rawMaterial;
    }

    //INSERT 
    public int insert(RawMaterial rawMaterial) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, rawMaterial.getName());
            statement.setString(2, rawMaterial.getDescription());
            statement.setDouble(3, rawMaterial.getPrice());
            statement.setInt(4, rawMaterial.getQuantity());
            statement.setDate(5, rawMaterial.getBestBy());
            statement.setObject(6, rawMaterial.getSupplierId());

            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }

    //UPDATE
    public int update(RawMaterial rawMaterial) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, rawMaterial.getName());
            statement.setString(2, rawMaterial.getDescription());
            statement.setDouble(3, rawMaterial.getPrice());
            statement.setInt(4, rawMaterial.getQuantity());
            statement.setDate(5, rawMaterial.getBestBy());
            statement.setObject(6, rawMaterial.getSupplierId());
            statement.setInt(7, rawMaterial.getId());

            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }

    //DELETE
    public int delete(RawMaterial rawMaterial) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, rawMaterial.getId());

            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }
}
