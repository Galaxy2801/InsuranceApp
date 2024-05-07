package com.example.insuranceapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                VehiclePolicyConst.POLICY_ID + VehiclePolicyConst.POLICY_CLIENT + ", " +
                VehiclePolicyConst.POLICY_MAKER + ", " + VehiclePolicyConst.POLICY_MODEL + ", " +
                VehiclePolicyConst.POLICY_TYPE + ", " + VehiclePolicyConst.POLICY_REG_NUMBER + ", " +
                VehiclePolicyConst.POLICY_VIN_NUMBER + ", " + VehiclePolicyConst.POLICY_ENGINE_CAPACITY + ", " +
                VehiclePolicyConst.POLICY_FUEL_TYPE + ", " + VehiclePolicyConst.POLICY_COLOR + ")" +
                "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, vehiclePolicy.getId());
            prSt.setString(2, vehiclePolicy.getClient());
            prSt.setString(3, vehiclePolicy.getMaker());
            prSt.setString(4, vehiclePolicy.getModel());
            prSt.setString(5, vehiclePolicy.getType());
            prSt.setString(6, vehiclePolicy.getRegNumber());
            prSt.setString(7, vehiclePolicy.getVinNumber());
            prSt.setString(8, vehiclePolicy.getEngineCapacity());
            prSt.setString(9, vehiclePolicy.getFuelType());
            prSt.setString(10, vehiclePolicy.getColor());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<VehiclePolicy> getVehiclePolicy() {
        List<VehiclePolicy> policies = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + VehiclePolicyConst.POLICY_TABLE;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                VehiclePolicy policy = new VehiclePolicy(
                        resultSet.getString(VehiclePolicyConst.POLICY_ID),
                        resultSet.getString(VehiclePolicyConst.POLICY_CLIENT),
                        resultSet.getString(VehiclePolicyConst.POLICY_MAKER),
                        resultSet.getString(VehiclePolicyConst.POLICY_MODEL),
                        resultSet.getString(VehiclePolicyConst.POLICY_TYPE),
                        resultSet.getString(VehiclePolicyConst.POLICY_REG_NUMBER),
                        resultSet.getString(VehiclePolicyConst.POLICY_VIN_NUMBER),
                        resultSet.getString(VehiclePolicyConst.POLICY_ENGINE_CAPACITY),
                        resultSet.getString(VehiclePolicyConst.POLICY_FUEL_TYPE),
                        resultSet.getString(VehiclePolicyConst.POLICY_COLOR)
                );
                policies.add(policy);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return policies;
    }

    public List<BuildPolicy> getBuildPolicy() {
        List<BuildPolicy> policies = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + BuildPolicyConst.POLICY_TABLE;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                BuildPolicy policy = new BuildPolicy(
                        resultSet.getString(BuildPolicyConst.POLICY_ID),
                        resultSet.getString(BuildPolicyConst.POLICY_CLIENT),
                        resultSet.getString(BuildPolicyConst.POLICY_ADDRESS),
                        resultSet.getString(BuildPolicyConst.POLICY_AREA),
                        resultSet.getString(BuildPolicyConst.POLICY_AREA_UNIT),
                        resultSet.getString(BuildPolicyConst.POLICY_BUILD_TYPE),
                        resultSet.getString(BuildPolicyConst.POLICY_NUM_OF_ROOMS),
                        resultSet.getString(BuildPolicyConst.POLICY_BUILD_TYPE)
                );
                policies.add(policy);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return policies;
    }

    public List<HumanPolicy> getHumanPolicy() {
        List<HumanPolicy> policies = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + HumanPolicyConst.POLICY_TABLE;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                HumanPolicy policy = new HumanPolicy(
                        resultSet.getString(HumanPolicyConst.POLICY_ID),
                        resultSet.getString(HumanPolicyConst.POLICY_CLIENT),
                        resultSet.getString(HumanPolicyConst.POLICY_FIRSTNAME),
                        resultSet.getString(HumanPolicyConst.POLICY_SECONDNAME),
                        resultSet.getString(HumanPolicyConst.POLICY_MIDDLENAME),
                        resultSet.getString(HumanPolicyConst.POLICY_AGE),
                        resultSet.getString(HumanPolicyConst.POLICY_GENDER),
                        resultSet.getString(HumanPolicyConst.POLICY_HEALTH)
                );
                policies.add(policy);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return policies;
    }

    public List<ItemsPolicy> getItemsPolicy() {
        List<ItemsPolicy> policies = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + ItemsPolicyConst.POLICY_TABLE;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ItemsPolicy policy = new ItemsPolicy(
                        resultSet.getString(ItemsPolicyConst.POLICY_ID),
                        resultSet.getString(ItemsPolicyConst.POLICY_CLIENT),
                        resultSet.getString(ItemsPolicyConst.POLICY_NAME),
                        resultSet.getString(ItemsPolicyConst.POLICY_COST),
                        resultSet.getString(ItemsPolicyConst.POLICY_PROP_CONDITION),
                        resultSet.getString(ItemsPolicyConst.POLICY_COMPENSATION)
                );
                policies.add(policy);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return policies;
    }

    public List<BusinessPolicy> getBusinessPolicy() {
        List<BusinessPolicy> policies = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + BusinessPolicyConst.POLICY_TABLE;

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                BusinessPolicy policy = new BusinessPolicy(
                        resultSet.getString(BusinessPolicyConst.POLICY_ID),
                        resultSet.getString(BusinessPolicyConst.POLICY_CLIENT),
                        resultSet.getString(BusinessPolicyConst.POLICY_NAME),
                        resultSet.getString(BusinessPolicyConst.POLICY_SERV_INDUSTRIES),
                        resultSet.getString(BusinessPolicyConst.POLICY_BUSINESS_COST),
                        resultSet.getString(BusinessPolicyConst.POLICY_PROFIT_PER_YEAR),
                        resultSet.getString(BusinessPolicyConst.POLICY_COMPENSATION),
                        resultSet.getString(BusinessPolicyConst.POLICY_RESPONS)
                );
                policies.add(policy);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return policies;
    }

    public List<String> getItemsFromDatabase() {
        List<String> items = new ArrayList<>();

        String selectQuery = "SELECT username FROM users WHERE permission = 'Клієнт'";

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String item = resultSet.getString("username");
                items.add(item);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return items;
    }

    public void signUpBuildPolicy(BuildPolicy buildPolicy) {
        String insert = "INSERT INTO " + BuildPolicyConst.POLICY_TABLE + "(" +
                BuildPolicyConst.POLICY_ID + ", " + BuildPolicyConst.POLICY_CLIENT + ", " +
                BuildPolicyConst.POLICY_ADDRESS + ", " + BuildPolicyConst.POLICY_AREA + ", " +
                BuildPolicyConst.POLICY_AREA_UNIT + ", " + BuildPolicyConst.POLICY_BUILD_TYPE + ", " +
                BuildPolicyConst.POLICY_NUM_OF_ROOMS + ", " + BuildPolicyConst.POLICY_COST + ")" +
                "VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, buildPolicy.getId());
            prSt.setString(2, buildPolicy.getClient());
            prSt.setString(3, buildPolicy.getAddress());
            prSt.setString(4, buildPolicy.getArea());
            prSt.setString(5, buildPolicy.getAreaUnit());
            prSt.setString(6, buildPolicy.getBuildType());
            prSt.setString(7, buildPolicy.getNumOfRooms());
            prSt.setString(8, buildPolicy.getCost());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void signUpHumanPolicy(HumanPolicy humanPolicy) {
        String insert = "INSERT INTO " + HumanPolicyConst.POLICY_TABLE + "(" +
                HumanPolicyConst.POLICY_ID + ", " + HumanPolicyConst.POLICY_CLIENT + ", " +
                HumanPolicyConst.POLICY_FIRSTNAME + ", " + HumanPolicyConst.POLICY_SECONDNAME + ", " +
                HumanPolicyConst.POLICY_MIDDLENAME + ", " + HumanPolicyConst.POLICY_AGE + ", " +
                HumanPolicyConst.POLICY_GENDER + ", " + HumanPolicyConst.POLICY_HEALTH + ")" +
                "VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, humanPolicy.getId());
            prSt.setString(2, humanPolicy.getClient());
            prSt.setString(3, humanPolicy.getFirstName());
            prSt.setString(4, humanPolicy.getSecondName());
            prSt.setString(5, humanPolicy.getMiddleName());
            prSt.setString(6, humanPolicy.getAge());
            prSt.setString(7, humanPolicy.getGender());
            prSt.setString(8, humanPolicy.getHealth());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void signUpItemsPolicy(ItemsPolicy itemsPolicy) {
        String insert = "INSERT INTO " + ItemsPolicyConst.POLICY_TABLE + "(" +
                ItemsPolicyConst.POLICY_ID + ", " + ItemsPolicyConst.POLICY_CLIENT + ", " +
                ItemsPolicyConst.POLICY_NAME + ", " + ItemsPolicyConst.POLICY_COST + ", " +
                ItemsPolicyConst.POLICY_PROP_CONDITION + ", " + ItemsPolicyConst.POLICY_COMPENSATION + ")" +
                "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, itemsPolicy.getId());
            prSt.setString(2, itemsPolicy.getClient());
            prSt.setString(3, itemsPolicy.getName());
            prSt.setString(4, itemsPolicy.getCost());
            prSt.setString(5, itemsPolicy.getPropCondition());
            prSt.setString(6, itemsPolicy.getCompensation());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void signUpBusinessPolicy(BusinessPolicy businessPolicy) {
        String insert = "INSERT INTO " + BusinessPolicyConst.POLICY_TABLE + "(" +
                BusinessPolicyConst.POLICY_ID + ", " + BusinessPolicyConst.POLICY_CLIENT + ", " +
                BusinessPolicyConst.POLICY_NAME + ", " + BusinessPolicyConst.POLICY_SERV_INDUSTRIES + ", " +
                BusinessPolicyConst.POLICY_BUSINESS_COST + ", " + BusinessPolicyConst.POLICY_PROFIT_PER_YEAR + ", " +
                BusinessPolicyConst.POLICY_COMPENSATION + ", " + BusinessPolicyConst.POLICY_RESPONS + ")" +
                "VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, businessPolicy.getId());
            prSt.setString(2, businessPolicy.getClient());
            prSt.setString(3, businessPolicy.getName());
            prSt.setString(4, businessPolicy.getServIndustries());
            prSt.setString(5, businessPolicy.getBusinessCost());
            prSt.setString(6, businessPolicy.getProfitPerYear());
            prSt.setString(7, businessPolicy.getCompensation());
            prSt.setString(8, businessPolicy.getRespons());

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
