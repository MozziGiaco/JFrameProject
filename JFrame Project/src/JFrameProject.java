import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class JFrameProject
	{
		static JFrame frame = new JFrame();
		static String name;
		static ImageIcon icon1;
		static ImageIcon icon2;
		static ImageIcon icon3;
		static ImageIcon icon4;
		static String favoriteActivity;
		static String yearsPracticed;
		static String[] numberOfYears =
			{ "Less than One Year", "One Year", "Less than Five Years", "Over Five Years", "Your Whole Life" };
		static String[] natureSettings =
			{ "Mountains", "Desert", "Jungle", "Ocean" };

		public static void main(String[] args)
			{
				icon1 = new ImageIcon(("mountains.jpg"));
				icon2 = new ImageIcon(("desert.jpg"));
				icon3 = new ImageIcon(("jungle.jpg"));
				icon4 = new ImageIcon(("ocean.jpg"));

				name = JOptionPane.showInputDialog("What is your name?");
				JOptionPane.showMessageDialog(frame, "Hi, " + name);

				frame = new JFrame("JFrame Name");
				String favoriteNatureSetting = (String) JOptionPane.showInputDialog(frame,
						"What is your favorite nature setting?", "Favorite Setting", JOptionPane.QUESTION_MESSAGE, null,
						natureSettings, natureSettings[0]);

				switch (favoriteNatureSetting)
					{
					case "Mountains":
						{
							JOptionPane.showMessageDialog(frame,
									"Ah, a lover of the forest and high slopes. I like it!", "",
									JOptionPane.QUESTION_MESSAGE, icon1);
							favoriteActivity = JOptionPane
									.showInputDialog("What is your favorite activity to do in the mountains?");
							JOptionPane.showMessageDialog(frame, "Very Interesting!");

							yearsPracticed = (String) JOptionPane.showInputDialog(frame,
									"How long have you practiced " + favoriteActivity + "?", "Years Practiced",
									JOptionPane.QUESTION_MESSAGE, null, numberOfYears, numberOfYears[0]);
							switch (yearsPracticed)
								{
								case "Less than One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow you're brand new at this activity! I wish you luck on your journey to mastery, if you choose to master it.");
									}
								case "One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"I see you're still a beginner, but you seem to know what you're doing. Very cool!");
										break;
									}
								case "Less than Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"You've been doing this for a while, huh? You're almost a master! Very cool!");
										break;
									}
								case "Over Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow! You must be a master of your craft! Very cool!");
										break;
									}
								case "Your Whole Life":
									{
										JOptionPane.showMessageDialog(frame,
												"You're a natural! That's incredible that you've been dedicated for that long!");
									}
								}

							break;
						}
					case "Desert":
						{
							JOptionPane.showMessageDialog(frame, "Ah, a lover of the heat. I like it!", "",
									JOptionPane.QUESTION_MESSAGE, icon2);
							favoriteActivity = JOptionPane
									.showInputDialog("What is your favorite activity to do in the desert?");
							JOptionPane.showMessageDialog(frame, "Very Interesting!");

							yearsPracticed = (String) JOptionPane.showInputDialog(frame,
									"How long have you practiced " + favoriteActivity + "?", "Years Practiced",
									JOptionPane.QUESTION_MESSAGE, null, numberOfYears, numberOfYears[0]);
							switch (yearsPracticed)
								{
								case "Less than One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow you're brand new at this activity! I wish you luck on your journey to mastery, if you choose to master it.");
									}
								case "One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"I see you're a beginner, but you seem to know what you're doing. Very cool!");
										break;
									}
								case "Less than Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"You've been doing this for a while, huh? You're almost a master! Very cool!");
										break;
									}
								case "Over Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow! You must be a master of your craft! Very cool!");
										break;
									}
								case "Your Whole Life":
									{
										JOptionPane.showMessageDialog(frame,
												"You're a natural! That's incredible that you've been dedicated for that long!");
									}
								}
							break;
						}
					case "Jungle":
						{
							JOptionPane.showMessageDialog(frame,
									"Ah, a lover of the most mysterious of biomes. My favorite!", "",
									JOptionPane.QUESTION_MESSAGE, icon3);
							favoriteActivity = JOptionPane
									.showInputDialog("What is your favorite activity to do in the jungle?");
							JOptionPane.showMessageDialog(frame, "Very Interesting!");
							yearsPracticed = (String) JOptionPane.showInputDialog(frame,
									"How long have you practiced " + favoriteActivity + "?", "Years Practiced",
									JOptionPane.QUESTION_MESSAGE, null, numberOfYears, numberOfYears[0]);
							switch (yearsPracticed)
								{
								case "Less than One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow you're brand new at this activity! I wish you luck on your journey to mastery, if you choose to master it.");
									}
								case "One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"I see you're a beginner, but you seem to know what you're doing. Very cool!");
										break;
									}
								case "Less than Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"You've been doing this for a while, huh? You're almost a master! Very cool!");
										break;
									}
								case "Over Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow! You must be a master of your craft! Very cool!");
										break;
									}
								case "Your Whole Life":
									{
										JOptionPane.showMessageDialog(frame,
												"You're a natural! That's incredible that you've been dedicated for that long!");
									}
								}
							break;
						}
					case "Ocean":
						{
							JOptionPane.showMessageDialog(frame, "Ah, a lover of the open sea. I like it!", "",
									JOptionPane.QUESTION_MESSAGE, icon4);
							favoriteActivity = JOptionPane
									.showInputDialog("What is your favorite activity to do in the ocean?");
							JOptionPane.showMessageDialog(frame, "Very Interesting!");
							yearsPracticed = (String) JOptionPane.showInputDialog(frame,
									"How long have you practiced " + favoriteActivity + "?", "Years Practiced",
									JOptionPane.QUESTION_MESSAGE, null, numberOfYears, numberOfYears[0]);
							switch (yearsPracticed)
								{
								case "Less than One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow you're brand new at this activity! I wish you luck on your journey to mastery, if you choose to master it.");
									}
								case "One Year":
									{
										JOptionPane.showMessageDialog(frame,
												"I see you're a beginner, but you seem to know what you're doing. Very cool!");
										break;
									}
								case "Less than Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"You've been doing this for a while, huh? You're almost a master! Very cool!");
										break;
									}
								case "Over Five Years":
									{
										JOptionPane.showMessageDialog(frame,
												"Wow! You must be a master of your craft! Very cool!");
										break;
									}
								case "Your Whole Life":
									{
										JOptionPane.showMessageDialog(frame,
												"You're a natural! That's incredible that you've been dedicated for that long!");
									}
								}
						}
					}

			}

	}
