import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("FORM");
        frame.setSize(600, 510);
        frame.setLocation(350,120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel for the form and set layout
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Adding all the components with specific positions to match the image

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 20, 100, 25);
        panel.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 350, 25);
        panel.add(nameField);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(30, 60, 100, 25);
        panel.add(lastNameLabel);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 60, 350, 25);
        panel.add(lastNameField);

        // Father's Name
        JLabel fathersNameLabel = new JLabel("Fathers Name:");
        fathersNameLabel.setBounds(30, 100, 100, 25);
        panel.add(fathersNameLabel);
        JTextField fathersNameField = new JTextField();
        fathersNameField.setBounds(150, 100, 350, 25);
        panel.add(fathersNameField);

        // Mother's Name
        JLabel mothersNameLabel = new JLabel("Mothers Name:");
        mothersNameLabel.setBounds(30, 140, 100, 25);
        panel.add(mothersNameLabel);
        JTextField mothersNameField = new JTextField();
        mothersNameField.setBounds(150, 140, 350, 25);
        panel.add(mothersNameField);

        // Mobile No
        JLabel mobileNoLabel = new JLabel("Mobile No:");
        mobileNoLabel.setBounds(30, 180, 100, 25);
        panel.add(mobileNoLabel);
        JTextField mobileNoField = new JTextField();
        mobileNoField.setBounds(150, 180, 350, 25);
        panel.add(mobileNoField);

        // College
        JLabel collegeLabel = new JLabel("College:");
        collegeLabel.setBounds(30, 220, 100, 25);
        panel.add(collegeLabel);
        JTextField collegeField = new JTextField();
        collegeField.setBounds(150, 220, 350, 25);
        panel.add(collegeField);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 260, 100, 25);
        panel.add(addressLabel);
        JTextField addressField = new JTextField();
        addressField.setBounds(150, 260, 350, 25);
        panel.add(addressField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 300, 100, 25);
        panel.add(emailLabel);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 300, 150, 25);
        panel.add(emailField);

        JLabel atLabel = new JLabel("@");
        atLabel.setBounds(310, 300, 20, 25);
        panel.add(atLabel);

        // Dropdown for email domain
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com"};
        JComboBox<String> domainBox = new JComboBox<>(domains);
        domainBox.setBounds(330, 300, 100, 25);
        panel.add(domainBox);

        // Languages checkboxes
        JLabel languagesLabel = new JLabel("Languages:");
        languagesLabel.setBounds(30, 340, 100, 25);
        panel.add(languagesLabel);

        JCheckBox hindiCheck = new JCheckBox("Hindi");
        hindiCheck.setBounds(150, 340, 70, 25);
        panel.add(hindiCheck);

        JCheckBox englishCheck = new JCheckBox("English");
        englishCheck.setBounds(230, 340, 80, 25);
        panel.add(englishCheck);

        JCheckBox punjabiCheck = new JCheckBox("Punjabi");
        punjabiCheck.setBounds(320, 340, 80, 25);
        panel.add(punjabiCheck);

        JCheckBox frenchCheck = new JCheckBox("French");
        frenchCheck.setBounds(400, 340, 80, 25);
        panel.add(frenchCheck);

        // Sex radio buttons
        JLabel sexLabel = new JLabel("SEX:");
        sexLabel.setBounds(30, 380, 100, 25);
        panel.add(sexLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 380, 70, 25);
        panel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(230, 380, 80, 25);
        panel.add(femaleButton);


        // Group the radio buttons
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(maleButton);
        sexGroup.add(femaleButton);
        JButton b1 = new JButton("Submit");
        b1.setBounds(30,430,100,30);
        JButton b2 = new JButton("Cancel");
        b2.setBounds(160,430,100,30);
       panel.add(b2);
       panel.add(b1);

        // Add the panel to the frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}