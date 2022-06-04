package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class SearchPage {
    private JTextField searchTBox;
    private JButton searchButton;
    private JComboBox<String> stateCBox;
    private JComboBox<Object> catCBox;
    private JComboBox jobTypeCBox;
    private JSlider salarySlider;
    private JTextField keywordsTBox;
    private JPanel searchPanel;
    private JLabel StateLabel;
    private JLabel catLabel;
    private JLabel jobTypeLabel;
    private JLabel lowSalLabel;
    private JLabel midSalLabel;
    private JLabel highSalLabel;

    public JPanel getSearchPanel() {
        return searchPanel;
    }

    public SearchPage(HashSet<Job> jobs) {
        /**test code to check categories' functionality
        should be removed when adding categories by recruiters is implemented
        */
        Categories categories = new Categories();
        categories.addCat("CompSci", "0001");
        categories.addCat("Networking", "0002");
        categories.addCat("AI", "0003");
        catCBox.setModel(new DefaultComboBoxModel<>(categories.getMap().keySet().toArray()));
        catCBox.addItem("Any");
        catCBox.setSelectedItem("Any");


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creates a new search object and adds the user's selected criteria to it
                Search search = new Search(jobs);
                search.setSearchText(searchTBox.getText());
                search.setState((String) stateCBox.getSelectedItem());
                search.setCat((String) catCBox.getSelectedItem());
                search.setJobType((String) jobTypeCBox.getSelectedItem());
                search.setSalary(salarySlider.getValue());
                search.setKeywords(keywordsTBox.getText());
                search.setScores();
                Runtime.showSearchResultsPage(Runtime.frame, search);
            }
        });
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
        searchPanel = new JPanel();
        searchPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 5, new Insets(0, 0, 0, 0), -1, -1));
        searchTBox = new JTextField();
        searchPanel.add(searchTBox, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        searchPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 8, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        searchButton = new JButton();
        searchButton.setText("Search");
        searchPanel.add(searchButton, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        stateCBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Any");
        defaultComboBoxModel1.addElement("QLD");
        defaultComboBoxModel1.addElement("NSW");
        defaultComboBoxModel1.addElement("VIC");
        defaultComboBoxModel1.addElement("ACT");
        defaultComboBoxModel1.addElement("WA");
        defaultComboBoxModel1.addElement("NT");
        defaultComboBoxModel1.addElement("SA");
        defaultComboBoxModel1.addElement("TAS");
        stateCBox.setModel(defaultComboBoxModel1);
        searchPanel.add(stateCBox, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 3, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        catCBox = new JComboBox();
        searchPanel.add(catCBox, new com.intellij.uiDesigner.core.GridConstraints(2, 4, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        jobTypeCBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Any");
        defaultComboBoxModel2.addElement("Full-Time");
        defaultComboBoxModel2.addElement("Part-Time");
        defaultComboBoxModel2.addElement("Casual");
        jobTypeCBox.setModel(defaultComboBoxModel2);
        searchPanel.add(jobTypeCBox, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        keywordsTBox = new JTextField();
        searchPanel.add(keywordsTBox, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        salarySlider = new JSlider();
        searchPanel.add(salarySlider, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        StateLabel = new JLabel();
        StateLabel.setText("State");
        searchPanel.add(StateLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 2, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        catLabel = new JLabel();
        catLabel.setText("Categories");
        searchPanel.add(catLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        jobTypeLabel = new JLabel();
        jobTypeLabel.setText("Job Type");
        searchPanel.add(jobTypeLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lowSalLabel = new JLabel();
        lowSalLabel.setText("$30K");
        searchPanel.add(lowSalLabel, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        midSalLabel = new JLabel();
        midSalLabel.setText("$130K");
        searchPanel.add(midSalLabel, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        highSalLabel = new JLabel();
        highSalLabel.setText("$230K");
        searchPanel.add(highSalLabel, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return searchPanel;
    }

}
