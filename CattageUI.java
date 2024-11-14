
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CattageUI extends JFrame {

    private JLabel lblTitle;
    private JLabel lblDescription;
    private JTextField txtDescription;
    private JButton btnSubmit;
    private JButton btnCancel;

    public CattageUI() {
        initComponents();
    }

    private void initComponents() {
        // Set up the frame
        setTitle("Cattage Booking");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        lblTitle = new JLabel("Cattage Booking");
        lblTitle.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        lblDescription = new JLabel("Enter Description:");
        txtDescription = new JTextField(15);

        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");

        // Add action listeners to buttons
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submit action
                String description = txtDescription.getText();
                JOptionPane.showMessageDialog(null, "Description submitted: " + description);
                // You can add more functionality here (e.g., save to database)
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the Cattage UI
            }
        });

        // Set up layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(lblTitle);
        panel.add(lblDescription);
        panel.add(txtDescription);
        panel.add(btnSubmit);
        panel.add(btnCancel);

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CattageUI().setVisible(true);
        });
    }
}
