package Neighbors;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NeighborsWrapper extends JFrame {

	public final int FRAMESIZE = 600;
	public final int BTNSPACE = 63;
	public final int HRZSPACE = 8;
	public final int NUMCOLORS = 2;
	
	public NeighborsWrapper() {
        setSize(3*FRAMESIZE/2+HRZSPACE, FRAMESIZE+BTNSPACE);
        add(new Neighbors(FRAMESIZE, FRAMESIZE, NUMCOLORS));
//        add(new Neighbors(FRAMESIZE, FRAMESIZE, NUMCOLORS));
        setResizable(false);
        setTitle("Sociology");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                NeighborsWrapper go = new NeighborsWrapper();
                go.setVisible(true);
            }
        });
	}
}
