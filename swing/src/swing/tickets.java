package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tickets {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTable table;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
protected Calendar timer;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
tickets window = new tickets();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public tickets() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 803, 491);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(180, 11, 386, 53);
panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblT = new JLabel("Ticket Booking");
lblT.setFont(new Font("Tahoma", Font.BOLD, 25));
lblT.setBounds(93, 11, 260, 31);
panel.add(lblT);

JPanel panel_1 = new JPanel();
panel_1.setBounds(377, 75, 400, 263);
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblTicketDetail = new JLabel("Ticket Detail");
lblTicketDetail.setBounds(171, 0, 89, 14);
panel_1.add(lblTicketDetail);

JLabel lblName = new JLabel("Name");
lblName.setBounds(32, 50, 46, 14);
panel_1.add(lblName);

textField = new JTextField();
textField.setBounds(94, 47, 86, 20);
panel_1.add(textField);
textField.setColumns(10);

JLabel lblFrom = new JLabel("From");
lblFrom.setBounds(32, 91, 46, 14);
panel_1.add(lblFrom);

textField_1 = new JTextField();
textField_1.setBounds(94, 85, 86, 20);
panel_1.add(textField_1);
textField_1.setColumns(10);

JLabel lblTo = new JLabel("To");
lblTo.setBounds(32, 127, 46, 14);
panel_1.add(lblTo);

textField_2 = new JTextField();
textField_2.setBounds(94, 124, 86, 20);
panel_1.add(textField_2);
textField_2.setColumns(10);

JLabel lblDate = new JLabel("Date");
lblDate.setBounds(32, 162, 46, 14);
panel_1.add(lblDate);

textField_3 = new JTextField();
textField_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
        textField_3.setText(tdate.format(timer.getTime()));
	}
});
textField_3.setBounds(94, 159, 86, 20);
panel_1.add(textField_3);
textField_3.setColumns(10);

JLabel lblTime = new JLabel("Time");
lblTime.setBounds(32, 204, 46, 14);
panel_1.add(lblTime);

JLabel lblNewLabel = new JLabel("Ticket No");
lblNewLabel.setBounds(271, 91, 54, 14);
panel_1.add(lblNewLabel);

textField_5 = new JTextField();
textField_5.setBounds(271, 105, 86, 20);
panel_1.add(textField_5);
textField_5.setColumns(10);

JLabel lblPrice = new JLabel("Price");
lblPrice.setBounds(271, 127, 46, 14);
panel_1.add(lblPrice);

textField_6 = new JTextField();
textField_6.setBounds(271, 142, 86, 20);
panel_1.add(textField_6);
textField_6.setColumns(10);
JComboBox comboBox_2 = new JComboBox();
comboBox_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
comboBox_2.setBounds(221, 177, 83, 20);
comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-No. of Tik-", "1", "2", "3", "4", "5", "6", "7"}));
frame.getContentPane().add(comboBox_2);

JLabel lblRoute = new JLabel("Route");
lblRoute.setBounds(271, 165, 46, 14);
panel_1.add(lblRoute);

textField_7 = new JTextField();
textField_7.setBounds(271, 180, 86, 20);
panel_1.add(textField_7);
textField_7.setColumns(10);

JButton btnNewButton = new JButton("Confirm");
btnNewButton.addActionListener(new ActionListener() {
	

	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new String[]
		{
		textField.getText(),
		textField_5.getText(),
		textField_1.getText(),
		textField_2.getText(),
		(String)comboBox_2.getSelectedItem(),
		textField_4.getText(),
		textField_3.getText(),
		textField_.getText(),
		textField_7.getText(),
		});
		
		
	}
});
btnNewButton.setBounds(171, 232, 89, 23);
panel_1.add(btnNewButton);

textField_4 = new JTextField();
textField_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
	}
});
textField_4.setBounds(94, 201, 86, 20);
panel_1.add(textField_4);
textField_4.setColumns(10);

JLabel lblName_1 = new JLabel("Name");
lblName_1.setBounds(20, 78, 46, 14);
frame.getContentPane().add(lblName_1);

textField_8 = new JTextField();
textField_8.setBounds(84, 79, 101, 20);
frame.getContentPane().add(textField_8);
textField_8.setColumns(10);

JSeparator separator = new JSeparator();
separator.setBackground(SystemColor.desktop);
separator.setBounds(20, 110, 347, 2);
frame.getContentPane().add(separator);

JRadioButton std = new JRadioButton("Standard");
std.setBounds(0, 119, 82, 23);
frame.getContentPane().add(std);

JRadioButton st = new JRadioButton("Single Ticket");
st.setBounds(76, 119, 109, 23);
frame.getContentPane().add(st);

JRadioButton adu = new JRadioButton("Adult");
adu.setBounds(187, 119, 109, 23);
frame.getContentPane().add(adu);

JRadioButton fc = new JRadioButton("First Class");
fc.setBounds(0, 147, 82, 23);
frame.getContentPane().add(fc);

JRadioButton ac = new JRadioButton("AC");
ac.setBounds(84, 147, 51, 23);
frame.getContentPane().add(ac);

JRadioButton Sleeper = new JRadioButton("Sleeper");
Sleeper.setBounds(137, 147, 82, 23);
frame.getContentPane().add(Sleeper);

JRadioButton child = new JRadioButton("Child");
child.setBounds(238, 147, 109, 23);
frame.getContentPane().add(child);

JComboBox comboBox = new JComboBox();
comboBox.setBounds(10, 177, 72, 20);
comboBox.setModel(new DefaultComboBoxModel(new String[] {"-From-", "Arunachal Pradhesh", "Goa", "Jammu Kashmir"}));
frame.getContentPane().add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setBounds(97, 177, 96, 20);
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-To-", "Andra Pradhesh", "Kerala", "Uttar Pradhesh"}));
frame.getContentPane().add(comboBox_1);



JSeparator separator_1 = new JSeparator();
separator_1.setBackground(SystemColor.desktop);
separator_1.setBounds(10, 300, 357, 2);
frame.getContentPane().add(separator_1);

JButton btnTotal = new JButton("Total");
btnTotal.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Number=textField_8.getText();
		textField.setText(Number);
		//time
		Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        textField_4.setText(tTime.format(timer.getTime()));
        //day
        SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
        textField_3.setText(tdate.format(timer.getTime()));
        
		lblFrom.setText("From");
        textField_1.setText((String)comboBox.getSelectedItem());
        
        int num;
        String s="";
        num=1325;
        s=s+num+1325;
        textField_5.setText(s);
        textField_7.setText("Any");
        
        double t=0;
        String m="";
        if(st.isSelected()) {
        	t=t+500;
        }
        else
        {
        	t=t+300;
        }
        if(ac.isSelected())
        {
        	t=t+500;
        }
        else {
        	t=t+300;
        }
        if(Sleeper.isSelected())
        {
        	t=t+500;
        }
        else
        {
        	t=t+300;
        }
        m=m+t;
       textField_10.setText(m);
       String text=(String)comboBox_2.getSelectedItem();
       int b=Integer.parseInt(text);
       t=t+b;
       String ans=String.format("%.2f", t);
       textField_2.setText(ans);
       double tot;
	if(ac.isSelected())
       {
    	   textField_9.setText("200");
    	   tot=t+200;
    	   String an=String.format("%.2f", tot);
    	   textField_11.setText(an);
    	   //textField_9.setText(an);
        }
       else {
    	   textField_9.setText("100");
    	   tot=t+100;
    	   String an=String.format("%.2f",tot);
    	   textField_11.setText(an);
    	   
    	   //textField_9.setText(an);
    	   
    	   
       }
    	   
       
       
       
      // textField.setText(textField_1.getText());
       String a=(String)comboBox.getSelectedItem();
       textField_1.setText(a);
       String d=(String)comboBox_1.getSelectedItem();
       textField_2.setText(d);
       
        
	
        
	}
});
btnTotal.setBounds(5, 315, 89, 23);
frame.getContentPane().add(btnTotal);

JButton btnReset = new JButton("Reset");
btnReset.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		textField_4.setText(null);
		textField_5.setText(null);
		textField_6.setText(null);
		textField_7.setText(null);
		textField_8.setText(null);
		textField_9.setText(null);
		textField_10.setText(null);
		textField_11.setText(null);
		
	}
});
btnReset.setBounds(102, 315, 89, 23);
frame.getContentPane().add(btnReset);

JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		frame=new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
		System.exit(0);
	}}
});
btnExit.setBounds(203, 315, 89, 23);
frame.getContentPane().add(btnExit);

table = new JTable();
table.setModel(new DefaultTableModel(
		
new Object[][] {
{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"},

},
new String[] {
"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"
}
));
table.setBounds(10, 351, 767, 64);
frame.getContentPane().add(table);
JSeparator separator_2 = new JSeparator();
separator_2.setBackground(SystemColor.desktop);
separator_2.setBounds(10, 208, 357, 2);
frame.getContentPane().add(separator_2);
JLabel lblTax = new JLabel("Tax");
lblTax.setBounds(20, 221, 46, 14);
frame.getContentPane().add(lblTax);
JLabel lblSubTotal = new JLabel("Sub Total");
lblSubTotal.setBounds(10, 250, 46, 14);
frame.getContentPane().add(lblSubTotal);
JLabel lblTotal = new JLabel("Total");
lblTotal.setBounds(20, 275, 46, 14);
frame.getContentPane().add(lblTotal);
textField_9 = new JTextField();
textField_9.setBounds(84, 218, 101, 20);
frame.getContentPane().add(textField_9);
textField_9.setColumns(10);
textField_10 = new JTextField();
textField_10.setBounds(84, 247, 101, 20);
frame.getContentPane().add(textField_10);
textField_10.setColumns(10);
textField_11 = new JTextField();
textField_11.setBounds(84, 272, 101, 20);
frame.getContentPane().add(textField_11);
textField_11.setColumns(10);
JSeparator separator_3 = new JSeparator();
separator_3.setOrientation(SwingConstants.VERTICAL);
separator_3.setBackground(SystemColor.desktop);
separator_3.setBounds(365, 110, 2, 228);
frame.getContentPane().add(separator_3);
}

private void getTime() {
	// TODO Auto-generated method stub
	
}

private static tickets getInstance() {
	// TODO Auto-generated method stub
	return null;
}
}
