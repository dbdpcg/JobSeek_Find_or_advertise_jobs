package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CreateAccountPage {
    private final JFrame frame;
    private JComboBox userTypeComboBox;
    private ClearingTextField fullNameTextField;
    private ClearingTextField emailTextField;
    private ClearingPasswordField passwordPasswordField;
    private ClearingPasswordField confirmPasswordPasswordField;
    private JButton createAccountButton;
    private JPanel mainPanel;
    private JLabel orgLabel;
    private JTextField orgTextField;

    public CreateAccountPage(JFrame frame) {
        this.frame = frame;

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createJobSeeker();
            }
        });
        userTypeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (userTypeComboBox.getSelectedItem().equals("JobSeeker")) {
                    orgLabel.setVisible(false);
                    orgTextField.setVisible(false);
                } else if (userTypeComboBox.getSelectedItem().equals("Recruiter")) {
                    orgLabel.setVisible(true);
                    orgTextField.setVisible(true);
                }
            }
        });
    }

    /**
     * creates a new JobSeeker after validating that the email is new and that the passwords match
     * writes the email, firstName and lastName to the JobSeekers file
     * writes the email and password to the registeredUsers file
     *
     * @param fullName        of the JobSeeker
     * @param email           of the JobSeeker
     * @param password        of the JobSeeker
     * @param confirmPassword of the JobSeeker
     */
    public String createJobSeeker() {
        final String email = emailTextField.getText();
        final String name = fullNameTextField.getText();
        final String pass = String.valueOf(passwordPasswordField.getPassword());
        final String passConfirm = String.valueOf(confirmPasswordPasswordField.getPassword());
        final String org = orgTextField.getText();
        //check if email is registered to an existing account - if so, notify that email is not new
        if (!AccountManagement.isRegisteredUser(email)) {
            //check if password and confirm password match - if not, return that passwords don't match
            if (pass.equals(passConfirm)) {
                User newUser;
                if (userTypeComboBox.getSelectedItem().toString().equals(JobSeeker.class.getSimpleName())) {
                    //create new JobSeeker object and add new JobSeeker to database
                    newUser = new JobSeeker(email, name, pass);
                } else {
                    //create new JobSeeker object and add new JobSeeker to database
                    newUser = new Recruiter(email, name, pass, org);
                }

                IO writer = new IO();
                writer.writeUser(newUser);
                AccountManagement.addUser(newUser);
                System.out.printf("New account successfully created for %s!%n", email);
                return String.format("New account successfully created for %s!", email);
            } else {
                System.out.println("Passwords do not match. Account not created. Please try again.");
                return "Passwords do not match. Account not created. Please try again.";
            }
        } else {
            System.out.println("That email address has already been registered to an account. Please login with your email address and password.");
            return "That email address has already been registered to an account. Please login with your email address and password.";
        }
    }

    /**
     * creates a new JobSeeker after validating that the email is new and that the passwords match
     * writes the email, firstName and lastName to the JobSeekers file
     * writes the email and password to the registeredUsers file
     * writes the resumeFile to the resumes file
     *
     * @param firstName       of the JobSeeker
     * @param lastName        of the JobSeeker
     * @param email           of the JobSeeker
     * @param password        of the JobSeeker
     * @param confirmPassword of the JobSeeker
     * @param resumeFile      is the file path of the JobSeeker's resume
     */
 /*   public void createJobSeeker(String firstName, String lastName, String email, String password, String confirmPassword, String resumeFile) {
        //check if email is new (i.e., not in registered users) - if not, notify that email is not new
        //check if password and confirm password match - if not, return that passwords don't match
        //create new JobSeeker object and add new JobSeeker to database
        User newJobSeeker = new JobSeeker(email, firstName, lastName);
        IO writer = new IO();
        String newJobSeekerDetails = newJobSeeker.toString();
        writer.newLine(AccountManagement.dt_jobSeekers, newJobSeekerDetails);
        //add new email and password to registered users file
        String newRegisteredUserDetails = newJobSeeker.getEmail().concat(",").concat(newJobSeeker.getPassword());
        writer.newLine(AccountManagement.dt_registeredUsers, newRegisteredUserDetails);
        //add new resume to resumes file
        writer.newLine(AccountManagement.dt_resumes, resumeFile);
    }*/
    public JPanel getCreateAccountPanel() {
        return mainPanel;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 2, new Insets(20, 20, 20, 20), -1, -1));
        mainPanel.setMinimumSize(new Dimension(299, 304));
        userTypeComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("JobSeeker");
        defaultComboBoxModel1.addElement("Recruiter");
        userTypeComboBox.setModel(defaultComboBoxModel1);
        mainPanel.add(userTypeComboBox, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fullNameTextField = new ClearingTextField();
        fullNameTextField.setText("Full Name");
        mainPanel.add(fullNameTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        emailTextField = new ClearingTextField();
        emailTextField.setText("E-Mail");
        mainPanel.add(emailTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        passwordPasswordField = new ClearingPasswordField();
        passwordPasswordField.setText("Password");
        mainPanel.add(passwordPasswordField, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        createAccountButton = new JButton();
        createAccountButton.setText("Create Account");
        mainPanel.add(createAccountButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        mainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        confirmPasswordPasswordField = new ClearingPasswordField();
        confirmPasswordPasswordField.setText("Confirm Password");
        mainPanel.add(confirmPasswordPasswordField, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        orgTextField = new JTextField();
        orgTextField.setVisible(false);
        mainPanel.add(orgTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        orgLabel = new JLabel();
        orgLabel.setText("Organisation");
        orgLabel.setVisible(false);
        mainPanel.add(orgLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}