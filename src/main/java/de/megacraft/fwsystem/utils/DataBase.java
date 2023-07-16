package de.megacraft.fwsystem.utils;

import de.megaessentialsrecode.utils.MySQLConnection;
import org.bukkit.OfflinePlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

    private static Connection connection = MySQLConnection.getConnection();

    public static void savePlayerJob(OfflinePlayer offlinePlayer, String job) {
        try (PreparedStatement statement = connection.prepareStatement(
                "UPDATE jobs SET job = ? WHERE uuid = ?")) {
            statement.setString(1, job);
            statement.setString(2, offlinePlayer.getUniqueId().toString());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getPlayerJob(OfflinePlayer offlinePlayer) {
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT job FROM jobs WHERE uuid = ?")) {
            statement.setString(1, offlinePlayer.getUniqueId().toString());
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("job");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static boolean exist(OfflinePlayer offlinePlayer) {
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM jobs WHERE uuid = ?")) {
            statement.setString(1, offlinePlayer.getUniqueId().toString());
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM jobs WHERE name = ?")) {
            statement.setString(1, offlinePlayer.getName());
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void setup(OfflinePlayer offlinePlayer) {
        if (!exist(offlinePlayer)) {
            try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO jobs (uuid, name, job) VALUES (?, ?, ?)")) {
                statement.setString(1, offlinePlayer.getUniqueId().toString());
                statement.setString(2, offlinePlayer.getName());
                statement.setString(3, null);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
