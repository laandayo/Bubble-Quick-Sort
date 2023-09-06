package View;
import Common.Algorithm;
import java.util.ArrayList;

public abstract class Menu<T> {
	protected String title;
	protected ArrayList<T> mPick;
	Algorithm l = new Algorithm();
	
	public Menu() {
		mPick = new ArrayList<>();
	}
	
	public Menu(String td, String[] mc) {
		title = td;
		mPick = new ArrayList<>();
		for (String s: mc) {
			mPick.add((T) s);
		}
	}
	
	public void display() {
		System.out.println(title);
		for (int i = 0; i<mPick.size(); i++) {
			System.out.println((i+1) + "." + mPick.get(i));
		}
	}
	
	public int getSelected() {
		display();
		return l.getInt("Enter your selection", 1, mPick.size() + 1);
	}
	
	public abstract void execute (int n);
	
	public void run() {
		while (true) {
			int n = getSelected();
			execute (n);
			if (n > mPick.size()) {
				break;
			}
		}
	}
}
