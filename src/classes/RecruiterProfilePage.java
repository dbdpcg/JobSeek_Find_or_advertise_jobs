package classes;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

/*
 * Recruiter profile is what the job seeker can see of the recruiter.
 */
public class RecruiterProfilePage {
    private JPanel recruiterProfile;
    private JButton backButton;
    private JScrollPane recruiterProfileDescription;
    private JLabel whoWeAreLabel;
    private JLabel recruiterOrg;
    private JScrollPane jobDescription;
    private JLabel contactLabel;
    private JLabel recruiterEmail;
    private JLabel recruiterWebsite;
    private JLabel recruiterSocial;
    private JLabel recruiterPhoneNo;
    private JLabel jobListingsLabel;
    private JPanel jobListingsPanel;
    private JPanel job1ListingPanel;
    private JLabel job1Title;
    private JLabel job1Score;
    private JLabel job1Company;
    private JPanel job2ListingPanel;
    private JLabel job2Title;
    private JLabel job2Score;
    private JLabel job2Company;
    private JPanel job3ListingPanel;
    private JLabel job3Title;
    private JLabel job3Score;
    private JLabel job3Company;
    private JPanel jobDescriptionPanel;
    private JLabel selectedJobLocation;
    private JLabel selectedJobCompensation;
    private JLabel selectJobCategory;
    private JButton applyButton;
    private JLabel selectedJobDescription;
    private JLabel recruiterProfileDescriptionText;
    private JButton viewButton;
    private JButton viewButton1;
    private JButton viewButton2;
    private JTextArea textArea1;


    /**
     * test recruiter profile
     */
    public RecruiterProfilePage() {
        Recruiter testRecruiter = new Recruiter();
        testRecruiter.setOrg("Not Seek");
        testRecruiter.setEmail("recruiter@notseek.com");
        testRecruiter.setRecruiterDescription("If you seek, you will find...");

        Job testJob = new Job();
        testJob.setJobTitle("Software Engineer");
        testJob.setRecruiter(testRecruiter);
        testJob.setCat("compSie");
        testJob.setJobDescription("This is a job. Please apply");
        testJob.setState("QLD");
        testJob.setSalary(125000);

        Job testJob1 = new Job();
        testJob1.setJobTitle("UI Designer");
        testJob1.setRecruiter(testRecruiter);
        testJob1.setCat("compSie");
        testJob1.setJobDescription("This is a job. Please apply");
        testJob1.setState("VIC");
        testJob1.setSalary(99000);

        Job testJob2 = new Job();
        testJob2.setJobTitle("Software Technician");
        testJob2.setRecruiter(testRecruiter);
        testJob2.setCat("AI");
        testJob2.setJobDescription("This is a job. Please apply");
        testJob2.setState("QLD");
        testJob2.setSalary(75000);


        recruiterOrg.setText(testRecruiter.getOrg());
        recruiterProfileDescriptionText.setText(testRecruiter.getRecruiterDescription());
        recruiterEmail.setText(testRecruiter.getEmail());
        recruiterWebsite.setText(testRecruiter.getOrg());
        job1Title.setText(testJob.jobTitle);
        job1Company.setText(testJob.getRecruiter().getOrg());
        job2Title.setText(testJob1.getJobTitle());
        job2Company.setText(testJob1.getRecruiter().getOrg());
        job3Title.setText(testJob2.jobTitle);
        job3Company.setText(testJob2.getRecruiter().getOrg());

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedJobDescription.setText(testJob.getJobDescription());
                selectedJobCompensation.setText(String.valueOf(testJob.getSalary()));
                selectedJobLocation.setText(testJob.getState());
                selectJobCategory.setText(testJob.cat);
            }
        });

        viewButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedJobDescription.setText(testJob1.getJobDescription());
                selectedJobCompensation.setText(String.valueOf(testJob1.getSalary()));
                selectedJobLocation.setText(testJob1.getState());
                selectJobCategory.setText(testJob1.cat);
            }
        });

        viewButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedJobDescription.setText(testJob2.getJobDescription());
                selectedJobCompensation.setText(String.valueOf(testJob2.getSalary()));
                selectedJobLocation.setText(testJob2.getState());
                selectJobCategory.setText(testJob2.cat);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public JPanel getRecruiterProfilePage() {
        return recruiterProfile;
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
        recruiterProfile = new JPanel();
        recruiterProfile.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(14, 5, new Insets(20, 20, 20, 20), -1, -1));
        recruiterProfile.setBackground(new Color(-13224648));
        recruiterProfile.setEnabled(false);
        recruiterProfile.setForeground(new Color(-5592406));
        backButton = new JButton();
        backButton.setText("Back");
        recruiterProfile.add(backButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, 30), null, 0, false));
        recruiterProfileDescription = new JScrollPane();
        recruiterProfileDescription.setHorizontalScrollBarPolicy(30);
        recruiterProfile.add(recruiterProfileDescription, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 8, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(249, 350), null, 0, false));
        recruiterProfileDescriptionText = new JLabel();
        recruiterProfileDescriptionText.setText("Label");
        recruiterProfileDescriptionText.setVerticalAlignment(1);
        recruiterProfileDescription.setViewportView(recruiterProfileDescriptionText);
        jobDescription = new JScrollPane();
        jobDescription.setBackground(new Color(-330497));
        recruiterProfile.add(jobDescription, new com.intellij.uiDesigner.core.GridConstraints(13, 3, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        jobDescriptionPanel = new JPanel();
        jobDescriptionPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        jobDescriptionPanel.setBackground(new Color(-1973791));
        jobDescriptionPanel.setForeground(new Color(-13224648));
        jobDescription.setViewportView(jobDescriptionPanel);
        selectJobCategory = new JLabel();
        selectJobCategory.setForeground(new Color(-13224648));
        selectJobCategory.setText("Category");
        jobDescriptionPanel.add(selectJobCategory, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        applyButton = new JButton();
        applyButton.setText("Apply");
        jobDescriptionPanel.add(applyButton, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        jobDescriptionPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        selectedJobDescription = new JLabel();
        selectedJobDescription.setEnabled(false);
        selectedJobDescription.setText("");
        panel1.add(selectedJobDescription, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Description");
        panel1.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectedJobLocation = new JLabel();
        selectedJobLocation.setForeground(new Color(-13224648));
        selectedJobLocation.setText("Location");
        jobDescriptionPanel.add(selectedJobLocation, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(106, 16), null, 0, false));
        selectedJobCompensation = new JLabel();
        selectedJobCompensation.setForeground(new Color(-13224648));
        selectedJobCompensation.setText("Compensation");
        jobDescriptionPanel.add(selectedJobCompensation, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(106, 16), null, 0, false));
        jobListingsPanel = new JPanel();
        jobListingsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        recruiterProfile.add(jobListingsPanel, new com.intellij.uiDesigner.core.GridConstraints(13, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job1ListingPanel = new JPanel();
        job1ListingPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        jobListingsPanel.add(job1ListingPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job1Title = new JLabel();
        job1Title.setText("Label");
        job1ListingPanel.add(job1Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(135, 16), null, 0, false));
        job1Company = new JLabel();
        job1Company.setText("Label");
        job1ListingPanel.add(job1Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(135, 16), null, 0, false));
        viewButton = new JButton();
        viewButton.setText("View");
        job1ListingPanel.add(viewButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(150, -1), 0, false));
        job1Score = new JLabel();
        job1Score.setText("Score");
        job1ListingPanel.add(job1Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job2ListingPanel = new JPanel();
        job2ListingPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        jobListingsPanel.add(job2ListingPanel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job2Title = new JLabel();
        job2Title.setText("Label");
        job2ListingPanel.add(job2Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(133, 16), null, 0, false));
        job2Score = new JLabel();
        job2Score.setText("Score");
        job2ListingPanel.add(job2Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job2Company = new JLabel();
        job2Company.setText("Label");
        job2ListingPanel.add(job2Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(133, 16), null, 0, false));
        viewButton1 = new JButton();
        viewButton1.setText("View");
        job2ListingPanel.add(viewButton1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(150, -1), 0, false));
        job3ListingPanel = new JPanel();
        job3ListingPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        jobListingsPanel.add(job3ListingPanel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        job3Title = new JLabel();
        job3Title.setText("Label");
        job3ListingPanel.add(job3Title, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(133, 16), null, 0, false));
        job3Score = new JLabel();
        job3Score.setText("Score");
        job3ListingPanel.add(job3Score, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        job3Company = new JLabel();
        job3Company.setText("Label");
        job3ListingPanel.add(job3Company, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(133, 16), null, 0, false));
        viewButton2 = new JButton();
        viewButton2.setText("View");
        job3ListingPanel.add(viewButton2, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        jobListingsPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        jobListingsPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        whoWeAreLabel = new JLabel();
        Font whoWeAreLabelFont = this.$$$getFont$$$(null, Font.BOLD, 16, whoWeAreLabel.getFont());
        if (whoWeAreLabelFont != null) whoWeAreLabel.setFont(whoWeAreLabelFont);
        whoWeAreLabel.setForeground(new Color(-592138));
        whoWeAreLabel.setText("Who We Are:");
        recruiterProfile.add(whoWeAreLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, 1, null, new Dimension(249, 16), null, 0, false));
        jobListingsLabel = new JLabel();
        Font jobListingsLabelFont = this.$$$getFont$$$(null, Font.BOLD, 16, jobListingsLabel.getFont());
        if (jobListingsLabelFont != null) jobListingsLabel.setFont(jobListingsLabelFont);
        jobListingsLabel.setForeground(new Color(-592138));
        jobListingsLabel.setText("Job Listings");
        recruiterProfile.add(jobListingsLabel, new com.intellij.uiDesigner.core.GridConstraints(12, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textArea1 = new JTextArea();
        textArea1.setBackground(new Color(-11348236));
        recruiterProfile.add(textArea1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(150, 50), new Dimension(-1, 1), 0, false));
        recruiterOrg = new JLabel();
        Font recruiterOrgFont = this.$$$getFont$$$("Calibri Light", -1, 22, recruiterOrg.getFont());
        if (recruiterOrgFont != null) recruiterOrg.setFont(recruiterOrgFont);
        recruiterOrg.setForeground(new Color(-592138));
        recruiterOrg.setText("Label");
        recruiterProfile.add(recruiterOrg, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(54, 16), null, 0, false));
        contactLabel = new JLabel();
        Font contactLabelFont = this.$$$getFont$$$(null, Font.BOLD, 16, contactLabel.getFont());
        if (contactLabelFont != null) contactLabel.setFont(contactLabelFont);
        contactLabel.setForeground(new Color(-592138));
        contactLabel.setText("Contact");
        recruiterProfile.add(contactLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, -1, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-592138));
        label2.setText("Email:");
        recruiterProfile.add(label2, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        recruiterEmail = new JLabel();
        recruiterEmail.setForeground(new Color(-592138));
        recruiterEmail.setText("Email");
        recruiterProfile.add(recruiterEmail, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        recruiterWebsite = new JLabel();
        recruiterWebsite.setForeground(new Color(-592138));
        recruiterWebsite.setText("Website");
        recruiterProfile.add(recruiterWebsite, new com.intellij.uiDesigner.core.GridConstraints(7, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.BOLD, -1, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-592138));
        label3.setText("Website:");
        recruiterProfile.add(label3, new com.intellij.uiDesigner.core.GridConstraints(6, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.BOLD, -1, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-592138));
        label4.setText("Socials:");
        recruiterProfile.add(label4, new com.intellij.uiDesigner.core.GridConstraints(8, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        recruiterSocial = new JLabel();
        recruiterSocial.setForeground(new Color(-592138));
        recruiterSocial.setText("Socials");
        recruiterProfile.add(recruiterSocial, new com.intellij.uiDesigner.core.GridConstraints(9, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.BOLD, -1, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-592138));
        label5.setText("Phone:");
        recruiterProfile.add(label5, new com.intellij.uiDesigner.core.GridConstraints(10, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        recruiterPhoneNo = new JLabel();
        recruiterPhoneNo.setForeground(new Color(-592138));
        recruiterPhoneNo.setText("Phone");
        recruiterProfile.add(recruiterPhoneNo, new com.intellij.uiDesigner.core.GridConstraints(11, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        return recruiterProfile;
    }

}


