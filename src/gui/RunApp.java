package gui;

import java.awt.*;

public class RunApp {
   public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmManHinhChinh frame = new frmManHinhChinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
