import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class JFrameProject
	{
		static JFrame frame = new JFrame();
		static String name;
		static String[] natureSettings = new String[4];
		static ImageIcon icon;

		public static void main(String[] args)
			{
				icon = new ImageIcon(("mountains.jpg"));

				name = JOptionPane.showInputDialog("What is your name?");
				JOptionPane.showMessageDialog(frame, "Hi, " + name);

				String[] natureSettings =
					{ "Mountains", "Desert", "Jungle", "Ocean" };

				frame = new JFrame("JFrame Name");
				String favoriteNatureSetting = (String) JOptionPane.showInputDialog(frame,
						"What is your favorite nature setting?", "Favorite Setting", JOptionPane.QUESTION_MESSAGE, null,
						natureSettings, natureSettings[0]);

				switch (favoriteNatureSetting)
					{
					case "Mountains":
						{
							JOptionPane.showMessageDialog(frame,
									"Ah, a lover of the forest and high slopes. I like it!");
							break;
						}
					case "Desert":
						{
							JOptionPane.showMessageDialog(frame, "Ah, a lover of the heat. I like it!");
							break;
						}
					case "Jungle":
						{
							JOptionPane.showMessageDialog(frame,
									"Ah, a lover of the most mysterious of biomes. My favorite!");
							break;
						}
					case "Ocean":
						{
							JOptionPane.showMessageDialog(frame, "Ah, a lover of the open sea. I like it!");
						}
					}

			}

	}
