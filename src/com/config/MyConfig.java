/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

/**
 *
 * @author Hp
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyConfig {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultSet;

     public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL , DB_USER , DB_PASS );
            System.out.println("Connection : Succes");
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
    public static void insertData(String namaBaru, int hargaBaru, int jumlahBaru){
//        String namaBaru;
//        long hargaBaru;
//        int jumlahBaru;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Nama  : ");
//        namaBaru = input.nextLine();
//
//        System.out.print("Harga : ");
//        hargaBaru = input.nextLong();
//
//        System.out.print("Jumlah : ");
//        jumlahBaru = input.nextInt();

        MyConfig.connection();

        try {
            statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `tb_barang` (`ID`, `Nama`, `Jumlah`) VALUES (NULL, '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");

            statement.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
