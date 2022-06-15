package classes;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Locale;

public class LoginPage implements Page {

    private JPanel mainPanel;
    private ClearingTextField emailClearingTextField;
    private ClearingPasswordField passwordClearingPasswordField;
    private JButton loginButton;
    private JButton createNewAccountButton;
    private boolean passClicked = false;

    public LoginPage(AccountManagement accMan) {

        /**
         * @param email is String that is a User's email
         * @param password is a String that is a User's password
         * @return true if the email and password parameters match a key:value pair in the registeredUsers HashMap
         * else false
         */

        /**
         * if the user clicks the Login button, the method gets the user input for email and password
         * the method invokes the actionUserLogin method of Runtime, which invokes the userLogin method of the Application class
         * email and password are passed as arguments to actionUserLogin and then to userLogin
         * actionUserLogin and userLogin both return true if the user is logged-in, which is used in the method to notify the user
         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userLogin(accMan)) {
                    JOptionPane.showMessageDialog(null, "You have successfully logged in!");
                } else {
                    JOptionPane.showMessageDialog(null, "The username of password is incorrect.");
                }
            }
        });
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime.showCreateAccountPage();
            }
        });
        passwordClearingPasswordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (!passClicked) {
                    passwordClearingPasswordField.setText("");
                    passClicked = true;
                }
            }
        });
    }

    public boolean userLogin(AccountManagement accMan) {
        if (validateUser(accMan.getJobSeekers())) {
            accMan.setCurrentUser(accMan.getJobSeekers().get(emailClearingTextField.getText()));
            Runtime.showPreviousPage();
            return true;
        } else if (validateUser(accMan.getRecruiters())) {
            accMan.setCurrentUser(accMan.getRecruiters().get(emailClearingTextField.getText()));
            Runtime.showRecruiterHome();
            return true;
        } else if (validateUser(accMan.getAdmins())) {
            accMan.setCurrentUser(accMan.getAdmins().get(emailClearingTextField.getText()));
            Runtime.showAdminHomePage();
            return true;
        } else return false;
    }

    private boolean validateUser(HashMap<String, ? extends User> users) {
        if (users.containsKey(emailClearingTextField.getText())) {
            return users.get(emailClearingTextField.getText()).getPassword().equals(String.valueOf(passwordClearingPasswordField.getPassword()));
        } else return false;
    }

    public JPanel getLoginPagePanel() {
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
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 1, new Insets(20, 20, 20, 20), -1, -1));
        mainPanel.setBackground(new Color(-13224648));
        emailClearingTextField = new ClearingTextField();
        emailClearingTextField.setBackground(new Color(-1973791));
        emailClearingTextField.setText("Email");
        emailClearingTextField.setToolTipText("user@example.com");
        mainPanel.add(emailClearingTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(150, -1), 0, false));
        passwordClearingPasswordField = new ClearingPasswordField();
        passwordClearingPasswordField.setBackground(new Color(-1973791));
        passwordClearingPasswordField.setText("Password");
        mainPanel.add(passwordClearingPasswordField, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(150, -1), 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Calibri Light", -1, 22, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-592138));
        label1.setText("Sign in");
        mainPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loginButton = new JButton();
        loginButton.setText("Login");
        mainPanel.add(loginButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-592138));
        label2.setText("Don't have an account?");
        mainPanel.add(label2, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        createNewAccountButton = new JButton();
        createNewAccountButton.setText("Create New Account");
        mainPanel.add(createNewAccountButton, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        mainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        mainPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    @Override
    public void update() {
        // Do nothing
    }

    @Override
    public String pageName() {
        return "Login";
    }

    @Override
    public JPanel getPanel() {
        return mainPanel;
    }
}