package com.example.insuranceapp;

import java.sql.*;

public class DatabaseHandler extends Configs {
    Connection dbConnection;
    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + ", " + Const.USER_SECONDNAME + ", " +
                Const.USER_THIRDNAME + ", " + Const.USER_USERNAME + ", " +
                Const.USER_PASSWORD + ", " + Const.USER_PERMISSION + ")" +
                "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getSecondName());
            prSt.setString(3, user.getThirdName());
            prSt.setString(4, user.getUserName());
            prSt.setString(5, user.getPassword());
            prSt.setString(6, user.getPermission());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet getUser(User user) {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + " = ? AND " + Const.USER_PASSWORD + " = ?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUserName());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resSet;
    }

    public boolean checkIfUserExists(String userName) {
        ResultSet resultSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USER_USERNAME + " = ?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, userName);

            resultSet = prSt.executeQuery();

            return resultSet.next();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void signUpVehiclePolicy(VehiclePolicy vehiclePolicy) {
        String insert = "INSERT INTO " + VehiclePolicyConst.POLICY_TABLE + "(" +
                VehiclePolicyConst.POLICY_CLIENT + ", " + VehiclePolicyConst.POLICY_MAKER + ", " +
                VehiclePolicyConst.POLICY_MODEL + ", " + VehiclePolicyConst.POLICY_TYPE + ", " +
                VehiclePolicyConst.POLICY_REG_NUMBER + ", " + VehiclePolicyConst.POLICY_VIN_NUMBER + ", " +
                VehiclePolicyConst.POLICY_ENGINE_CAPACITY + ", " + VehiclePolicyConst.POLICY_FUEL_TYPE + ", " +
                VehiclePolicyConst.POLICY_COLOR + ")" + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, vehiclePolicy.getClient());
            prSt.setString(2, vehiclePolicy.getMaker());
            prSt.setString(3, vehiclePolicy.getModel());
            prSt.setString(4, vehiclePolicy.getType());
            prSt.setString(5, vehiclePolicy.getRegNumber());
            prSt.setString(6, vehiclePolicy.getVinNumber());
            prSt.setString(7, vehiclePolicy.getEngineCapacity());
            prSt.setString(8, vehiclePolicy.getFuelType());
            prSt.setString(9, vehiclePolicy.getColor());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
