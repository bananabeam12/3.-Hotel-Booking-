package ccs103MidtermProj;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.Dialog.ModalExclusionType;

public class hotelBooking extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNameField;
	private JTextField txtNumOfStayField;

	int singleRoom = 100, doubleRoom = 200, suiteRoom = 300;
	int addDryCleaning = 20, addBreakfast = 50, addWifi = 60, addGym = 40, addTvCable = 30;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelBooking frame = new hotelBooking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hotelBooking() {
		setType(Type.POPUP);
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setTitle("Hotel Booking System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ROOM AVAILABILITY 
		JLabel lblRoomAvailable = new JLabel("Room Available");
		lblRoomAvailable.setForeground(new Color(255, 255, 255));
		lblRoomAvailable.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRoomAvailable.setOpaque(true);
		lblRoomAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomAvailable.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 15));
		lblRoomAvailable.setBackground(new Color(0, 78, 152));
		lblRoomAvailable.setBounds(10, 331, 263, 24);
		contentPane.add(lblRoomAvailable);
		
		//ROOM AVAILABILITY RADIO BTN
		JRadioButton rdbtnRoomOne = new JRadioButton("R101");
		rdbtnRoomOne.setBackground(new Color(255, 255, 255));
		rdbtnRoomOne.setEnabled(false);
		rdbtnRoomOne.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRoomOne.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnRoomOne.setBounds(53, 375, 80, 35);
		contentPane.add(rdbtnRoomOne);
		
		JRadioButton rdbtnRoomTwo = new JRadioButton("R201");
		rdbtnRoomTwo.setBackground(new Color(255, 255, 255));
		rdbtnRoomTwo.setEnabled(false);
		rdbtnRoomTwo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRoomTwo.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnRoomTwo.setBounds(146, 375, 80, 35);
		contentPane.add(rdbtnRoomTwo);
		
		JRadioButton rdbtnRoomThree = new JRadioButton("R320");
		rdbtnRoomThree.setBackground(new Color(255, 255, 255));
		rdbtnRoomThree.setEnabled(false);
		rdbtnRoomThree.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRoomThree.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnRoomThree.setBounds(26, 416, 80, 35);
		contentPane.add(rdbtnRoomThree);
		
		JRadioButton rdbtnRoomFour = new JRadioButton("R322");
		rdbtnRoomFour.setBackground(new Color(255, 255, 255));
		rdbtnRoomFour.setEnabled(false);
		rdbtnRoomFour.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRoomFour.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnRoomFour.setBounds(108, 416, 80, 35);
		contentPane.add(rdbtnRoomFour);
		
		JRadioButton rdbtnRoomFive = new JRadioButton("R325");
		rdbtnRoomFive.setBackground(new Color(255, 255, 255));
		rdbtnRoomFive.setEnabled(false);
		rdbtnRoomFive.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRoomFive.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnRoomFive.setBounds(190, 416, 72, 35);
		contentPane.add(rdbtnRoomFive);
		
		//ROOM TYPE RADIO BTN GROUP FOR SINGLE SELECTION
		ButtonGroup roomNumberGroup = new ButtonGroup();
		roomNumberGroup.add(rdbtnRoomOne);
		roomNumberGroup.add(rdbtnRoomTwo);
		roomNumberGroup.add(rdbtnRoomThree);
		roomNumberGroup.add(rdbtnRoomFour);
		roomNumberGroup.add(rdbtnRoomFive);
		
		
	
		//RADIO BTN FOR SINGLE ROOM TYPE
		JRadioButton rdbtnSingleRoom = new JRadioButton("Single");
		rdbtnSingleRoom.setBackground(new Color(255, 255, 255));
		rdbtnSingleRoom.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//if selected, enable the rooms available
				rdbtnRoomOne.setEnabled(true);
				rdbtnRoomTwo.setEnabled(true);
				rdbtnRoomThree.setEnabled(false);
				rdbtnRoomFour.setEnabled(false);
				rdbtnRoomFive.setEnabled(false);
			
			}
		});
		rdbtnSingleRoom.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSingleRoom.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnSingleRoom.setBounds(26, 136, 80, 35);
		contentPane.add(rdbtnSingleRoom);
		
		
		//RADIO BTN FOR DOUBLE ROOM TYPE
		JRadioButton rdbtnDoubleRoom = new JRadioButton("Double");
		rdbtnDoubleRoom.setBackground(new Color(255, 255, 255));
		rdbtnDoubleRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if selected, enable the rooms available
				rdbtnRoomOne.setEnabled(false);
				rdbtnRoomTwo.setEnabled(false);
				rdbtnRoomThree.setEnabled(true);
				rdbtnRoomFour.setEnabled(true);
				rdbtnRoomFive.setEnabled(false);
			
				
			}
		});
		rdbtnDoubleRoom.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDoubleRoom.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnDoubleRoom.setBounds(108, 136, 80, 35);
		contentPane.add(rdbtnDoubleRoom);
		
		//RADIO BTN FOR SUITE ROOM TYPE
		JRadioButton rdbtnSuiteRoom = new JRadioButton("Suite");
		rdbtnSuiteRoom.setBackground(new Color(255, 255, 255));
		rdbtnSuiteRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if selected, enable the rooms available
				rdbtnRoomOne.setEnabled(false);
				rdbtnRoomTwo.setEnabled(false);
				rdbtnRoomThree.setEnabled(false);
				rdbtnRoomFour.setEnabled(false);
				rdbtnRoomFive.setEnabled(true);
				
			}
		});
		rdbtnSuiteRoom.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSuiteRoom.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		rdbtnSuiteRoom.setBounds(190, 136, 72, 35);
		contentPane.add(rdbtnSuiteRoom);
		
		//ROOM TYPE RADIO BTN GROUP FOR SINGLE SELECTION
		ButtonGroup roomTypeGroup = new ButtonGroup();
		roomTypeGroup.add(rdbtnSingleRoom);
		roomTypeGroup.add(rdbtnDoubleRoom);
		roomTypeGroup.add(rdbtnSuiteRoom);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		lblNewLabel.setBounds(304, 134, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNameField = new JTextField();
		txtNameField.setBounds(360, 127, 180, 29);
		contentPane.add(txtNameField);
		txtNameField.setColumns(10);
		
		
		JLabel lblNights = new JLabel("Nights of stay:");
		lblNights.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		lblNights.setBounds(305, 175, 94, 14);
		contentPane.add(lblNights);
		
		txtNumOfStayField = new JTextField();
		txtNumOfStayField.setColumns(10);
		txtNumOfStayField.setBounds(406, 168, 134, 29);
		contentPane.add(txtNumOfStayField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(192, 192, 192));
		separator.setBackground(new Color(192, 192, 192));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(283, 92, 11, 359);
		contentPane.add(separator);
		
		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRoomType.setOpaque(true);
		lblRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomType.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 15));
		lblRoomType.setBackground(new Color(0, 78, 152));
		lblRoomType.setBounds(10, 92, 263, 24);
		contentPane.add(lblRoomType);
		
		JLabel lblAdditionalServices = new JLabel("Additional Services");
		lblAdditionalServices.setForeground(new Color(255, 255, 255));
		lblAdditionalServices.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAdditionalServices.setOpaque(true);
		lblAdditionalServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdditionalServices.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 15));
		lblAdditionalServices.setBackground(new Color(0, 78, 152));
		lblAdditionalServices.setBounds(10, 195, 263, 24);
		contentPane.add(lblAdditionalServices);
		
		JCheckBox chckbxWifi = new JCheckBox("Wifi");
		chckbxWifi.setBackground(new Color(255, 255, 255));
		chckbxWifi.setForeground(Color.BLACK);
		chckbxWifi.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxWifi.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		chckbxWifi.setBounds(198, 283, 64, 23);
		contentPane.add(chckbxWifi);
		
		JCheckBox chckbxBreakfast = new JCheckBox("Breakfast");
		chckbxBreakfast.setBackground(new Color(255, 255, 255));
		chckbxBreakfast.setForeground(Color.BLACK);
		chckbxBreakfast.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxBreakfast.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		chckbxBreakfast.setBounds(144, 243, 105, 23);
		contentPane.add(chckbxBreakfast);
		
		JCheckBox chckbxGym = new JCheckBox("Gym");
		chckbxGym.setBackground(new Color(255, 255, 255));
		chckbxGym.setForeground(Color.BLACK);
		chckbxGym.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxGym.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		chckbxGym.setBounds(19, 283, 71, 23);
		contentPane.add(chckbxGym);
		
		JCheckBox chckbxDryCleaning = new JCheckBox("Dry Cleaning");
		chckbxDryCleaning.setBackground(new Color(255, 255, 255));
		chckbxDryCleaning.setForeground(Color.BLACK);
		chckbxDryCleaning.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxDryCleaning.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		chckbxDryCleaning.setBounds(36, 243, 115, 23);
		contentPane.add(chckbxDryCleaning);
		
		JCheckBox chckbxTvCable = new JCheckBox("TV Cable");
		chckbxTvCable.setBackground(new Color(255, 255, 255));
		chckbxTvCable.setForeground(Color.BLACK);
		chckbxTvCable.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTvCable.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		chckbxTvCable.setBounds(94, 283, 94, 23);
		contentPane.add(chckbxTvCable);
		
		JLabel lblGuestInfo = new JLabel("Guest Information");
		lblGuestInfo.setForeground(new Color(255, 255, 255));
		lblGuestInfo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGuestInfo.setOpaque(true);
		lblGuestInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuestInfo.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 15));
		lblGuestInfo.setBackground(new Color(0, 78, 152));
		lblGuestInfo.setBounds(296, 92, 258, 24);
		contentPane.add(lblGuestInfo);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Neue Haas Grotesk Display Pro", Font.PLAIN, 14));
		lblMessage.setBounds(304, 208, 165, 29);
		contentPane.add(lblMessage);
		
		JTextArea txtMessageArea = new JTextArea();
		txtMessageArea.setBackground(SystemColor.control);
		txtMessageArea.setLineWrap(true);
		txtMessageArea.setBounds(303, 237, 237, 161);
		contentPane.add(txtMessageArea);
		
		//ERROR AND BUGS, CHECK GPT FOR SOLUTIONS
		
		//check out button
		JButton btnConfirm = new JButton("Check out");
		btnConfirm.setForeground(new Color(255, 255, 255));
		btnConfirm.setBackground(new Color(0, 78, 152));
		btnConfirm.setFont(new Font("Neue Haas Grotesk Display Pro", Font.BOLD, 14));
		btnConfirm.setOpaque(true);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//checking for name
				String userName = txtNameField.getText();
				if (userName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter your name.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//checking for number of nights 
				String nightOfStay = txtNumOfStayField.getText();
				int totalNightOfStay = Integer.parseInt(nightOfStay);
				
				if (totalNightOfStay <= 0) {
					JOptionPane.showMessageDialog(null, "Number of nights must be greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//store message in text area in a variable
				String userMessage = new String(txtMessageArea.getText());
				
				//check for room cost
				int roomCost = 0;
				String roomSelected = "";
				if (rdbtnSingleRoom.isSelected()) {
					roomCost = singleRoom * totalNightOfStay;
					roomSelected = "Single Room";
				}
				else if (rdbtnDoubleRoom.isSelected()) {
					roomCost = doubleRoom * totalNightOfStay;
					roomSelected = "Double Room";
				}
				else if (rdbtnSuiteRoom.isSelected()) {
					roomCost = suiteRoom * totalNightOfStay;
					roomSelected = "Suite Room";
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a room type.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//check for additional services cost
				String serviceSelected = "";
				int addServicesCost = 0;
				if (chckbxDryCleaning.isSelected()) {
					addServicesCost += addDryCleaning * totalNightOfStay;
					serviceSelected += "Dry Cleaning" + "\n";
				}
				if (chckbxBreakfast.isSelected()) {
					addServicesCost += addBreakfast * totalNightOfStay;
					serviceSelected += "Breakfast" + "\n";
				}
				if (chckbxGym.isSelected()) {
					addServicesCost += addGym * totalNightOfStay;
					serviceSelected += "Gym" + "\n";
				}
				if (chckbxTvCable.isSelected()) {
					addServicesCost += addTvCable * totalNightOfStay;
					serviceSelected += "Tv Cable" + "\n";
				}
				if (chckbxWifi.isSelected()) {
					addServicesCost += addWifi * totalNightOfStay;
					serviceSelected += "Wifi" + "\n";
				}
				
				//get room number
				//check for room cost
				String roomNumber = "";
				if (rdbtnRoomOne.isSelected()) {
					roomNumber = "R101";
				}
				else if (rdbtnRoomTwo.isSelected()) {
	
					roomNumber = "R201";
				}
				else if (rdbtnRoomThree.isSelected()) {
					roomNumber = "R320";
				}
				
				else if (rdbtnRoomFour.isSelected()) {
					roomNumber = "R322";
				}
				else if (rdbtnRoomFive.isSelected()) {
					roomNumber = "R325";
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a room number.");
					return;
				}
				
				
				//calculate the total cost
				int totalCost = roomCost + addServicesCost;
				
				int confirmCheckOut = JOptionPane.showConfirmDialog(null, "Total Cost: $" + totalCost, "Confirm Check Out?",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (confirmCheckOut == JOptionPane.YES_NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Name: " + userName + 
														"\nNight of stays: " + totalNightOfStay + "\n" +
														"\nRoom Type: " + roomSelected +
														"\nRoom Number: " + roomNumber + 
														"\nAdditional Services: " + "\n" + serviceSelected +
														"\nMessage: " + "\n" + userMessage + "\n" +
														"\nRoom Cost: $" + roomCost + 
														"\nAdditional Services Cost: $" + addServicesCost +
														"\nTotal Cost: $" + totalCost, "Booking Details", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (confirmCheckOut == JOptionPane.NO_OPTION) {
					
				}
			}
		});
		btnConfirm.setBounds(349, 422, 105, 29);
		contentPane.add(btnConfirm);
				
		//clear button
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(255, 69, 0));
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				txtNameField.setText("");
				txtNumOfStayField.setText("");
				txtMessageArea.setText("");
				roomTypeGroup.clearSelection();
				roomNumberGroup.clearSelection();
				chckbxDryCleaning.setSelected(false);
				chckbxBreakfast.setSelected(false);
				chckbxGym.setSelected(false);
				chckbxTvCable.setSelected(false);
				chckbxWifi.setSelected(false);
				
			}
		});
		btnClear.setFont(new Font("Neue Haas Grotesk Display Pro", Font.BOLD, 14));
		btnClear.setBounds(468, 422, 72, 29);
		contentPane.add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel("Stays");
		lblNewLabel_1.setForeground(new Color(0, 78, 152));
		lblNewLabel_1.setFont(new Font("Neue Haas Grotesk Display Pro", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(305, 24, 124, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SectionE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1.setFont(new Font("Neue Haas Grotesk Display Pro", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(118, 24, 204, 46);
		contentPane.add(lblNewLabel_1_1);
	}
}
