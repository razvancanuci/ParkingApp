package com.example;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Main
{
    static Park park=new Park();

    public static JFrame frame;

    static JButton buttonAdd;
    static JLabel labelAddName;
    static JLabel labelAddVehicle;
    static JComboBox textAddVehicle;
    static JTextField textAddName;
    static JRadioButton buttonVip;
    static JButton buttonRemove;
    static JLabel labelRemoveName;
    static JTextField textRemove;
    
    private static class AddPerson implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            if(textAddName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Put a name");
            }
            else
            {
                if(park.takenName(textAddName.getText()))
                {
                    JOptionPane.showMessageDialog(frame,"The name is taken");
                }
                else
                {
                    if(park.placeInThePark(new Person(textAddName.getText(),(VehicleType)textAddVehicle.getSelectedItem(),buttonVip.isSelected())))
                    {
                        JOptionPane.showMessageDialog(frame,"The person has been added");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"There is no place left");
                    }
                }
                
                
            }
            
        }
        
    }
    private static class RemovePerson implements ActionListener
    {

        public void actionPerformed(ActionEvent e) 
        {
            if(textRemove.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Put a name");
            }
            else
            {
                if(park.freePlace(textRemove.getText()))
                {
                    JOptionPane.showMessageDialog(frame,"The person has been removed");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"There is no person with this name");
                }
            }
            
        }
        
    }

    public static void loadFrame()
    {
        frame=new JFrame("Parking app");
        buttonAdd=new JButton();
        buttonAdd.setText("Add");
        buttonAdd.setBounds(100,160,100,30);
        buttonAdd.addActionListener(new AddPerson());

        labelAddName=new JLabel();
        labelAddName.setText("Name:");
        labelAddName.setBounds(50,100,50,20);

        labelAddVehicle=new JLabel();
        labelAddVehicle.setText("Vehicle type:");
        labelAddVehicle.setBounds(20,120,80,20);

        textAddVehicle=new JComboBox();
        textAddVehicle.addItem(VehicleType.motorcycle);
        textAddVehicle.addItem(VehicleType.car);
        textAddVehicle.addItem(VehicleType.truck);

        textAddVehicle.setBounds(100,120,100,20);

        textAddName=new JTextField();
        textAddName.setBounds(100,100,100,20);

        buttonVip=new JRadioButton();
        buttonVip.setText("VIP");
        buttonVip.setBounds(100,140,100,20);

        buttonRemove=new JButton();
        buttonRemove.setText("Remove");
        buttonRemove.setBounds(300,160,100,30);
        buttonRemove.addActionListener(new RemovePerson());

        labelRemoveName=new JLabel();
        labelRemoveName.setText("Name:");
        labelRemoveName.setBounds(250,100,50,20);

        textRemove=new JTextField();
        textRemove.setBounds(300,100,100,20);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.add(buttonAdd);
        frame.add(textAddName);
        frame.add(labelAddName);
        frame.add(labelAddVehicle);
        frame.add(textAddVehicle);
        frame.add(buttonVip);
        frame.add(buttonRemove);
        frame.add(textRemove);
        frame.add(labelRemoveName);

        
    }
    

    public static void main(String[] args)
    {   
       loadFrame();
    }
}
    

    
