/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author reesmcdevitt
 */
public class NavCntl {
    
    private NavModel navModel;
    private NavView navView;
    
    
    private MainView mainView;
    private SettingsView setView;
    
    private Database taskModel;
    private TaskView taskView;
    private TaskCntl taskCntl;
    
    ContactView contactView;
    ContactCntl contactCntl;
    Database contactModel;
    
    private int userID;
    
    NavCntl(NavModel navModel, NavView navView)
    {
        this.navModel = navModel;
        this.navView = navView;
        
        mainView = new MainView();
        setView = new SettingsView();
        
        taskModel = new Database("tcm.db");
        taskView = new TaskView(taskModel);
        taskCntl = new TaskCntl(taskModel, taskView);
        
        contactModel = new Database("tcm.db");
        contactView = new ContactView(contactModel);
        contactCntl = new ContactCntl(contactModel, contactView);
        
        taskCntl.setUserID(userID); // = 0
        System.out.println("Nav: " + userID);
        
        navView.addMainButtonListener(new MainButtonListener());
        navView.addContactButtonListener(new ContactButtonListener());
        navView.addTaskButtonListener(new TaskButtonListener());
        navView.addSettingsButtonListener(new SettingsButtonListener());
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
     class MainButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            navView.switchToMainPanel(mainView);
        }
    }
     
     class ContactButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            navView.switchToContactPanel(contactView);
        }
    }
     
     class TaskButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            navView.switchToTaskPanel(taskView);
            System.out.print(taskModel.getCurrentUserId()); //Testing Current User On Task Click
        }
    }
     
     class SettingsButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
           navView.switchToSettingsPanel(setView);
        }
    }
    
}
