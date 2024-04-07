/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginform;
import javax.swing.*;
import javax.swing.JToggleButton;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



/**
 *
 * @author Pc
 */
public class Attendance extends javax.swing.JFrame {
private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java_app";
private static final String USERNAME = "root";
private static final String PASSWORD = "";
private String rollNo;
private String attendanceStatus;
    
    public Attendance(String rollNo, String attendanceStatus) {
        initComponents();
        //ImageIcon icon = new ImageIcon("C:\\Users\\Dhanesh\\Documents\\NetBeansProjects\\LoginForm\\src\\main\\java\\com\\mycompany\\loginform\\Images\\icons8-student-96.png");
       // setIconImage(icon.getImage());
       setTitle("Attendance");
            this.rollNo = rollNo;
            this.attendanceStatus = attendanceStatus;
        
    }
    public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getAttendanceStatus() {
            return attendanceStatus;
        }

        public void setAttendanceStatus(String attendanceStatus) {
            this.attendanceStatus = attendanceStatus;
        }
        private List<Attendance> fetchAttendanceDataFromDatabase() {
    List<Attendance> attendanceData = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
        String sql = "SELECT `Roll no`, `Attendance` FROM atten";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String rollNo = resultSet.getString("Roll no");
                    String attendanceStatus = resultSet.getString("Attendance");
                    attendanceData.add(new Attendance(rollNo, attendanceStatus));
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return attendanceData;
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jToggleButton51 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jToggleButton53 = new javax.swing.JToggleButton();
        jToggleButton54 = new javax.swing.JToggleButton();
        jToggleButton55 = new javax.swing.JToggleButton();
        jToggleButton56 = new javax.swing.JToggleButton();
        jToggleButton57 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton59 = new javax.swing.JToggleButton();
        jToggleButton60 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton62 = new javax.swing.JToggleButton();
        jToggleButton63 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jToggleButton1.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton1.setText("B001");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton2.setText("B002");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton3.setText("B003");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton4.setText("B004");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton5.setText("B005");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton6.setText("B006");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton7.setText("B007");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton8.setText("B008");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton9.setText("B009");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton10.setText("B010");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton11.setText("B011");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton12.setText("B012");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton13.setText("B013");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton14.setText("B014");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton15.setText("B015");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton16.setText("B016");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton17.setText("B017");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton18.setText("B018");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton19.setText("B019");
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton20.setText("B020");
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton21.setText("B021");
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton22.setText("B022");
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton23.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton23.setText("B023");
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton24.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton24.setText("B024");
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton25.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton25.setText("B025");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton26.setText("B026");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton27.setText("B027");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton28.setText("B028");
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        jToggleButton29.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton29.setText("B029");
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });

        jToggleButton30.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton30.setText("B030");
        jToggleButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton30ActionPerformed(evt);
            }
        });

        jToggleButton31.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton31.setText("B031");
        jToggleButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton31ActionPerformed(evt);
            }
        });

        jToggleButton32.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton32.setText("B032");
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });

        jToggleButton33.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton33.setText("B033");
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });

        jToggleButton34.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton34.setText("B034");
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jToggleButton35.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton35.setText("B035");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jToggleButton36.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton36.setText("B036");
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });

        jToggleButton37.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton37.setText("B037");
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });

        jToggleButton38.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton38.setText("B038");
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });

        jToggleButton39.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton39.setText("B039");
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });

        jToggleButton40.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton40.setText("B040");
        jToggleButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton40ActionPerformed(evt);
            }
        });

        jToggleButton41.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton41.setText("B041");
        jToggleButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton41ActionPerformed(evt);
            }
        });

        jToggleButton42.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton42.setText("B042");
        jToggleButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton42ActionPerformed(evt);
            }
        });

        jToggleButton43.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton43.setText("B043");
        jToggleButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton43ActionPerformed(evt);
            }
        });

        jToggleButton44.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton44.setText("B044");
        jToggleButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton44ActionPerformed(evt);
            }
        });

        jToggleButton45.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton45.setText("B045");
        jToggleButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton45ActionPerformed(evt);
            }
        });

        jToggleButton46.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton46.setText("B046");
        jToggleButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton46ActionPerformed(evt);
            }
        });

        jToggleButton47.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton47.setText("B047");
        jToggleButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton47ActionPerformed(evt);
            }
        });

        jToggleButton48.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton48.setText("B048");
        jToggleButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton48ActionPerformed(evt);
            }
        });

        jToggleButton49.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton49.setText("B049");
        jToggleButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton49ActionPerformed(evt);
            }
        });

        jToggleButton50.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton50.setText("B050");
        jToggleButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton50ActionPerformed(evt);
            }
        });

        jToggleButton51.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton51.setText("B051");
        jToggleButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton51ActionPerformed(evt);
            }
        });

        jToggleButton52.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton52.setText("B052");
        jToggleButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton52ActionPerformed(evt);
            }
        });

        jToggleButton53.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton53.setText("B053");
        jToggleButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton53ActionPerformed(evt);
            }
        });

        jToggleButton54.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton54.setText("B054");
        jToggleButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton54ActionPerformed(evt);
            }
        });

        jToggleButton55.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton55.setText("B055");
        jToggleButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton55ActionPerformed(evt);
            }
        });

        jToggleButton56.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton56.setText("B056");
        jToggleButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton56ActionPerformed(evt);
            }
        });

        jToggleButton57.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton57.setText("B057");
        jToggleButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton57ActionPerformed(evt);
            }
        });

        jToggleButton58.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton58.setText("B058");
        jToggleButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton58ActionPerformed(evt);
            }
        });

        jToggleButton59.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton59.setText("B059");
        jToggleButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton59ActionPerformed(evt);
            }
        });

        jToggleButton60.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton60.setText("B060");
        jToggleButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton60ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CLICK ON THE BUTTON TO MARK PRESENT");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("SAVE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton61.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton61.setText("B061");
        jToggleButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton61ActionPerformed(evt);
            }
        });

        jToggleButton62.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton62.setText("B062");
        jToggleButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton62ActionPerformed(evt);
            }
        });

        jToggleButton63.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton63.setText("B063");
        jToggleButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton63ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 0));
        jComboBox1.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRJ", "DST", "FCN", "EDUP", "LXL", "DEX", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jButton2.setText("<-----");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setText("X");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton51)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton52)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton53)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton54)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton55)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton56)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton57)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton58)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton59)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton41)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton42)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton33)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton34)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton35)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton43)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton44)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton45)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton46)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton47)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton48)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton49)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton50))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton37)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton39)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton40))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton13)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton16)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton18)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton19)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton61)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton62)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton21)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton22)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton23)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton24)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton25)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton26)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton28)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton29)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton8)))
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton10)))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton17)
                    .addComponent(jToggleButton18)
                    .addComponent(jToggleButton19)
                    .addComponent(jToggleButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton21)
                    .addComponent(jToggleButton22)
                    .addComponent(jToggleButton23)
                    .addComponent(jToggleButton24)
                    .addComponent(jToggleButton25)
                    .addComponent(jToggleButton26)
                    .addComponent(jToggleButton27)
                    .addComponent(jToggleButton28)
                    .addComponent(jToggleButton29)
                    .addComponent(jToggleButton30))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton31)
                    .addComponent(jToggleButton32)
                    .addComponent(jToggleButton33)
                    .addComponent(jToggleButton34)
                    .addComponent(jToggleButton35)
                    .addComponent(jToggleButton36)
                    .addComponent(jToggleButton37)
                    .addComponent(jToggleButton38)
                    .addComponent(jToggleButton39)
                    .addComponent(jToggleButton40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton41)
                        .addComponent(jToggleButton42)
                        .addComponent(jToggleButton43)
                        .addComponent(jToggleButton44)
                        .addComponent(jToggleButton45)
                        .addComponent(jToggleButton46)
                        .addComponent(jToggleButton49)
                        .addComponent(jToggleButton50)
                        .addComponent(jToggleButton48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton51)
                    .addComponent(jToggleButton52)
                    .addComponent(jToggleButton53)
                    .addComponent(jToggleButton54)
                    .addComponent(jToggleButton55)
                    .addComponent(jToggleButton56)
                    .addComponent(jToggleButton57)
                    .addComponent(jToggleButton58)
                    .addComponent(jToggleButton59)
                    .addComponent(jToggleButton60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton61)
                    .addComponent(jToggleButton62)
                    .addComponent(jToggleButton63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
  public static void Changeclr(JToggleButton toggleButton, String rollno) {
    String query, attendance;
    if (toggleButton.isSelected()) {
        toggleButton.setBackground(new java.awt.Color(0, 204, 51));
        attendance = "Present";
    } else {
        toggleButton.setBackground(new java.awt.Color(255, 102, 102));
        attendance = "Absent";
    }

    // Use a different SQL query format with placeholders
    query = "UPDATE atten SET Attendance = ? WHERE `Roll no` = ?"; // Use backticks for column name

    try {
        // Add code to save the state to the database
        saveToDatabase(query, attendance, rollno);
    } 
    catch (Exception ex) {
        // Handle database exceptions
        ex.printStackTrace();
        // You can also log the exception here
        // logger.error("Database error: " + ex.getMessage(), ex);
    }
}



private static void saveToDatabase(String query, String attendance, String rollno) {
    Connection conn = null;
    try {
        conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, attendance);
            pstmt.setString(2, rollno);
            int rowsUpdated = pstmt.executeUpdate(); // Get the number of rows updated
            if (rowsUpdated > 0) {
                System.out.println("Update successful");
            } else {
                System.out.println("No rows updated");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


    // Excel generation and download method
    private void generateExcelFile(List<Attendance> attendanceData) {
        try {
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet("Attendance");

            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Student Name");
            cell = row.createCell(1);
            cell.setCellValue("Attendance Status");

            int rowIndex = 1;
            for (Attendance record : attendanceData) {
                row = sheet.createRow(rowIndex++);
                cell = row.createCell(0);
                cell.setCellValue(record.getRollNo());
                cell = row.createCell(1);
                cell.setCellValue(record.getAttendanceStatus());
            }

            try (FileOutputStream fileOut = new FileOutputStream("D:/Users/91816/Downloads/attendance.xls")) {
                workbook.write(fileOut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
      Changeclr(jToggleButton10,"B010");
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        SwingUtilities.invokeLater(() -> {
        Changeclr(jToggleButton11, "B011");
         jToggleButton11.repaint();
    });
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
          Changeclr(jToggleButton35,"B035");
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Changeclr(jToggleButton1,"B001");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       Changeclr(jToggleButton2,"B002");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        Changeclr(jToggleButton3,"B003");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        Changeclr(jToggleButton4,"B004");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        Changeclr(jToggleButton5,"B005");
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
       Changeclr(jToggleButton6,"B006");
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
       Changeclr(jToggleButton7,"B007");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        Changeclr(jToggleButton8,"B008");
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        Changeclr(jToggleButton9,"B009");
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        Changeclr(jToggleButton12,"B012");
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
       Changeclr(jToggleButton13,"B013");
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        Changeclr(jToggleButton14,"B014");
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        Changeclr(jToggleButton15,"B015");
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        Changeclr(jToggleButton16,"B016");
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        Changeclr(jToggleButton17,"B017");
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        Changeclr(jToggleButton18,"B018");
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        Changeclr(jToggleButton19,"B019");
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        Changeclr(jToggleButton20,"B020");
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        Changeclr(jToggleButton21,"B021");
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        Changeclr(jToggleButton22,"B022");
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        Changeclr(jToggleButton23,"B023");
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        Changeclr(jToggleButton24,"B024");
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        Changeclr(jToggleButton25,"B025");
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        Changeclr(jToggleButton26,"B026");
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        Changeclr(jToggleButton27,"B027");
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        Changeclr(jToggleButton28,"B028");
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
       Changeclr(jToggleButton29,"B029");
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton30ActionPerformed
        Changeclr(jToggleButton30,"B030");
    }//GEN-LAST:event_jToggleButton30ActionPerformed

    private void jToggleButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton31ActionPerformed
        Changeclr(jToggleButton31,"B031");
    }//GEN-LAST:event_jToggleButton31ActionPerformed

    private void jToggleButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton52ActionPerformed
        Changeclr(jToggleButton52,"B052");
    }//GEN-LAST:event_jToggleButton52ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        Changeclr(jToggleButton32,"B032");
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
       Changeclr(jToggleButton33,"B033");
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        Changeclr(jToggleButton34,"B034");
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        Changeclr(jToggleButton36,"B036");
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        Changeclr(jToggleButton37,"B037");
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
        Changeclr(jToggleButton38,"B038");
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        Changeclr(jToggleButton39,"B039");
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton40ActionPerformed
        Changeclr(jToggleButton40,"B040");
    }//GEN-LAST:event_jToggleButton40ActionPerformed

    private void jToggleButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton41ActionPerformed
        Changeclr(jToggleButton41,"B041");
    }//GEN-LAST:event_jToggleButton41ActionPerformed

    private void jToggleButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton42ActionPerformed
        Changeclr(jToggleButton42,"B042");
    }//GEN-LAST:event_jToggleButton42ActionPerformed

    private void jToggleButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton43ActionPerformed
        Changeclr(jToggleButton43,"B043");
    }//GEN-LAST:event_jToggleButton43ActionPerformed

    private void jToggleButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton44ActionPerformed
        Changeclr(jToggleButton44,"B044");
    }//GEN-LAST:event_jToggleButton44ActionPerformed

    private void jToggleButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton45ActionPerformed
        Changeclr(jToggleButton45,"B045");
    }//GEN-LAST:event_jToggleButton45ActionPerformed

    private void jToggleButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton46ActionPerformed
        Changeclr(jToggleButton46,"B046");
    }//GEN-LAST:event_jToggleButton46ActionPerformed

    private void jToggleButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton47ActionPerformed
        Changeclr(jToggleButton47,"B047");
    }//GEN-LAST:event_jToggleButton47ActionPerformed

    private void jToggleButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton48ActionPerformed
        Changeclr(jToggleButton48,"B048");
    }//GEN-LAST:event_jToggleButton48ActionPerformed

    private void jToggleButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton49ActionPerformed
        Changeclr(jToggleButton49,"B049");
    }//GEN-LAST:event_jToggleButton49ActionPerformed

    private void jToggleButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton50ActionPerformed
        Changeclr(jToggleButton50,"B050");
    }//GEN-LAST:event_jToggleButton50ActionPerformed

    private void jToggleButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton51ActionPerformed
        Changeclr(jToggleButton51,"B051");
    }//GEN-LAST:event_jToggleButton51ActionPerformed

    private void jToggleButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton53ActionPerformed
        Changeclr(jToggleButton53,"B053");
    }//GEN-LAST:event_jToggleButton53ActionPerformed

    private void jToggleButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton54ActionPerformed
        Changeclr(jToggleButton54,"B054");
    }//GEN-LAST:event_jToggleButton54ActionPerformed

    private void jToggleButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton55ActionPerformed
       Changeclr(jToggleButton55,"B055");
    }//GEN-LAST:event_jToggleButton55ActionPerformed

    private void jToggleButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton56ActionPerformed
        Changeclr(jToggleButton56,"B056");
    }//GEN-LAST:event_jToggleButton56ActionPerformed

    private void jToggleButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton57ActionPerformed
        Changeclr(jToggleButton57,"B057");
    }//GEN-LAST:event_jToggleButton57ActionPerformed

    private void jToggleButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton58ActionPerformed
        Changeclr(jToggleButton58,"B058");
    }//GEN-LAST:event_jToggleButton58ActionPerformed

    private void jToggleButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton59ActionPerformed
        Changeclr(jToggleButton59,"B059");
    }//GEN-LAST:event_jToggleButton59ActionPerformed

    private void jToggleButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton60ActionPerformed
        Changeclr(jToggleButton60,"B060");
    }//GEN-LAST:event_jToggleButton60ActionPerformed

    private void jToggleButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton61ActionPerformed
        Changeclr(jToggleButton61,"B061");
    }//GEN-LAST:event_jToggleButton61ActionPerformed

    private void jToggleButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton62ActionPerformed
        Changeclr(jToggleButton62,"B062");
    }//GEN-LAST:event_jToggleButton62ActionPerformed

    private void jToggleButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton63ActionPerformed
        Changeclr(jToggleButton63,"B063");
    }//GEN-LAST:event_jToggleButton63ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JOptionPane.showMessageDialog(null,"Attendance Marked");
        
         List<Attendance> attendanceData = fetchAttendanceDataFromDatabase();
        generateExcelFile(attendanceData);
        JOptionPane.showMessageDialog(this, "Excel file generated and ready for download.");
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main mf=new Main();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            JOptionPane.showMessageDialog(this, "THANK YOU");
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

   
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton51;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton53;
    private javax.swing.JToggleButton jToggleButton54;
    private javax.swing.JToggleButton jToggleButton55;
    private javax.swing.JToggleButton jToggleButton56;
    private javax.swing.JToggleButton jToggleButton57;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton59;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton60;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton62;
    private javax.swing.JToggleButton jToggleButton63;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
