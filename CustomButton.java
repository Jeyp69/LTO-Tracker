import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String text) {
        super(text);
        setFont(new Font("Arial", Font.BOLD, 30)); // Larger, bold font
        setBackground(Color.WHITE); // White background as shown in the picture
        setForeground(Color.BLACK); // Black text
        setFocusPainted(false); // Remove focus border
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); // Black border
    }

    public static CustomButton createButton(String text, int x, int y, int width, int height) {
        CustomButton button = new CustomButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }
}
