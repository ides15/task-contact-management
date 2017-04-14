/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Component;
import java.awt.Container;
import java.util.Arrays;
import javax.swing.AbstractButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author reesmcdevitt
 */
public class MainView extends javax.swing.JPanel {

    private Database mainModel;
    private String date;
    private String[] searchNames;
    private int month;
    private int day;
    private int year;
    
    public MainView(Database mainModel) 
    {
        this.mainModel = mainModel;
        initComponents();
        
        //Calender 
        cal.getMonthChooser().removeAll();
        cal.getYearChooser().removeAll();
 
        month = cal.getMonthChooser().getMonth() + 1;
        day = cal.getDayChooser().getDay();
        year = cal.getYearChooser().getYear();
        date = month + "/" + day + "/" + year;
        dateLabel.setText(date);
        
        //Search Bar
        searchBar.removeAllItems();
        searchBar.addItem("Search");
        
        //searchNames = mainModel.getTaskNames(mainModel.getCurrentUserId());
        
//        for (String searchName : searchNames) {
//            searchBar.addItem(searchName);
//        }
        
        searchBar.setEditable(true);
        AutoCompleteDecorator.decorate(searchBar);
        
        removeButton(searchBar);
      
    }
    
    //Removes Button from JComboBox
    private void removeButton(Container container) {
      Component[] components = container.getComponents();
      for (Component component : components) {
         if (component instanceof AbstractButton) {
            container.remove(component);
         }
      }
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cal = new com.toedter.calendar.JCalendar();
        dateLabel = new javax.swing.JLabel();
        monthUp = new javax.swing.JButton();
        monthDown = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        searchBar = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        dateLabel.setText("DATE");

        monthUp.setText(">");
        monthUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthUpActionPerformed(evt);
            }
        });

        monthDown.setText("<");
        monthDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthDownActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Task", "Due"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        searchBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthDown)
                .addGap(25, 25, 25)
                .addComponent(dateLabel)
                .addGap(25, 25, 25)
                .addComponent(monthUp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthDown)
                    .addComponent(dateLabel)
                    .addComponent(monthUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monthDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthDownActionPerformed
        //Changes Lable
        month = getMonth() - 1;
        if (getMonth() == 0)
        {
            month = 12;
            year = getYear() - 1;
        }
        
        setDate(getMonth() + "/" + getDay() + "/" + getYear());
      
        getDateLabel().setText(getDate());
        
        getCal().getMonthChooser().setMonth(getMonth() - 1);
        
    }//GEN-LAST:event_monthDownActionPerformed

    private void monthUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthUpActionPerformed
       ////Changes Lable
        month = getMonth() + 1;
        if (getMonth() == 13)
        {
            month = 1;
            year = getYear() + 1;
        }
        
        setDate(getMonth() + "/" + getDay() + "/" + getYear());
      
        getDateLabel().setText(getDate());
        getCal().getMonthChooser().setMonth(getMonth() - 1);
    }//GEN-LAST:event_monthUpActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar cal;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton monthDown;
    private javax.swing.JButton monthUp;
    private javax.swing.JComboBox<String> searchBar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the mainModel
     */
    public Database getMainModel() {
        return mainModel;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the searchNames
     */
    public String[] getSearchNames() {
        return searchNames;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the cal
     */
    public com.toedter.calendar.JCalendar getCal() {
        return cal;
    }

    /**
     * @return the monthDown
     */
    public javax.swing.JButton getMonthDown() {
        return monthDown;
    }

    /**
     * @return the monthUp
     */
    public javax.swing.JButton getMonthUp() {
        return monthUp;
    }

    /**
     * @return the searchBar
     */
    public javax.swing.JComboBox<String> getSearchBar() {
        return searchBar;
    }

    /**
     * @return the dateLabel
     */
    public javax.swing.JLabel getDateLabel() {
        return dateLabel;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(javax.swing.JLabel dateLabel) {
        this.dateLabel = dateLabel;
    }
}
