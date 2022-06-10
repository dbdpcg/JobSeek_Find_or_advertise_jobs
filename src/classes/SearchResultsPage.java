package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchResultsPage {
    private final int NO_OF_RESULTS = 3;
    private JScrollBar scrollBar1;
    private JLabel job1Title;
    private JLabel job1Score;
    private JLabel job1Company;
    private JLabel job2Title;
    private JLabel job2Score;
    private JLabel job2Company;
    private JLabel job3Title;
    private JLabel job3Company;
    private JLabel job3Score;
    private JPanel searchResultsPanel;
    private JButton prevButton;
    private JButton nextButton;
    private JPanel job1Panel;
    private JPanel job2Panel;
    private JPanel job3Panel;
    private int pageNumber = 0;
    ArrayList<ScoredJob> jobList;

    public SearchResultsPage(Search search) {
        jobList = search.getScoredJobs();
        createPage(pageNumber);
        addButtonListeners(nextButton, prevButton);
        addPanelListeners();
    }

    public void createPage(int pageNumber) {
        JLabel[] jobTitles = {job1Title, job2Title, job3Title};
        JLabel[] jobCompanies = {job1Company, job2Company, job3Company};
        JLabel[] jobScores = {job1Score, job2Score, job3Score};
        for (JLabel label : jobTitles) {
            label.getParent().setVisible(false);
        }
        if (jobList.isEmpty()) {
            jobTitles[0].setText("No jobs could be found!");
            jobTitles[0].getParent().setVisible(true);
        } else {
            for (int i = 0; i < NO_OF_RESULTS; i++) {
                if (pageNumber * NO_OF_RESULTS + i < jobList.size()) {
                    jobTitles[i].setText(jobList.get(pageNumber * NO_OF_RESULTS + i).getJob().getJobTitle());
                    jobCompanies[i].setText(jobList.get(pageNumber * NO_OF_RESULTS + i).getJob().getRecruiter().getOrg());
                    jobScores[i].setText(String.valueOf(jobList.get(pageNumber * NO_OF_RESULTS + i).getScore()));
                    jobScores[i].getParent().setVisible(true);
                }
            }
        }
    }

    public void addButtonListeners(JButton nextButton, JButton prevButton) {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pageNumber + 1 < Math.ceil(jobList.size() / (double) NO_OF_RESULTS)) {
                    pageNumber += 1;
                    createPage(pageNumber);
                }
            }
        });
        this.prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pageNumber > 0) {
                    pageNumber -= 1;
                }
                createPage(pageNumber);
            }
        });
    }

    public void addPanelListeners() {
        if (jobList.isEmpty()) {
            return;
        }
        Map<JPanel, Integer> panels = Map.of(job1Panel, 0, job2Panel, 1, job3Panel, 2);

        for (JPanel panel : panels.keySet()) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    if (Runtime.accountManager().getCurrentUser() == null) {
                        Runtime.showLoginPage(new JFrame());
                    } else {
                        JPanel clickedPanel = (JPanel) e.getSource();
                        int indexOfClick = panels.get(clickedPanel);
                        JFrame desFrame = new JFrame("Description Page");
                        desFrame.setContentPane(new DescriptionPage(jobList, pageNumber, indexOfClick).getDescriptionPanel());
                        desFrame.pack();
                        desFrame.setVisible(true);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    panel.setBackground(Color.CYAN);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    panel.setBackground(Color.lightGray);
                }
            });
        }
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
        searchResultsPanel = new JPanel();
        searchResultsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 4, new Insets(0, 0, 0, 0), -1, -1));
        scrollBar1 = new JScrollBar();
        searchResultsPanel.add(scrollBar1, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 8, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        prevButton = new JButton();
        prevButton.setText("Previous");
        searchResultsPanel.add(prevButton, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nextButton = new JButton();
        nextButton.setText("Next");
        searchResultsPanel.add(nextButton, new com.intellij.uiDesigner.core.GridConstraints(8, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job1Panel = new JPanel();
        job1Panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        job1Panel.setBackground(new Color(-4144960));
        searchResultsPanel.add(job1Panel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job1Title = new JLabel();
        job1Title.setText("");
        job1Panel.add(job1Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job1Company = new JLabel();
        job1Company.setText("");
        job1Panel.add(job1Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job1Score = new JLabel();
        job1Score.setText("");
        job1Panel.add(job1Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        searchResultsPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        job2Panel = new JPanel();
        job2Panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        job2Panel.setBackground(new Color(-4144960));
        searchResultsPanel.add(job2Panel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job2Title = new JLabel();
        job2Title.setText("");
        job2Panel.add(job2Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job2Company = new JLabel();
        job2Company.setText("");
        job2Panel.add(job2Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job2Score = new JLabel();
        job2Score.setText("");
        job2Panel.add(job2Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        searchResultsPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        job3Panel = new JPanel();
        job3Panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        job3Panel.setBackground(new Color(-4144960));
        searchResultsPanel.add(job3Panel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job3Title = new JLabel();
        job3Title.setText("");
        job3Panel.add(job3Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job3Company = new JLabel();
        job3Company.setText("");
        job3Panel.add(job3Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job3Score = new JLabel();
        job3Score.setText("");
        job3Panel.add(job3Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return searchResultsPanel;
    }

    public JPanel getSearchResultsPanel() {
        return searchResultsPanel;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
