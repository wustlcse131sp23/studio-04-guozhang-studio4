package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(Color.BLUE);
	StdDraw.filledRectangle(.5, 0.5, 0.3, 0.1);
	StdDraw.setPenColor(Color.ORANGE);
	StdDraw.filledCircle(.5, 0.5, 0.05);
	}
}