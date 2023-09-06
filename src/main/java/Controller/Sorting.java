package Controller;
import Common.Algorithm;
import Model.Element;
import View.Menu;

public class Sorting extends Menu<String> {
	static String[] mc = {"Sort", "Exit"};
	
	protected Algorithm algorithm;
        protected int[] array;
        protected int sizeArray;
	
	public Sorting(Element element) {
		super("LOADING", mc);
	        algorithm = new Algorithm();
                sizeArray = element.getSizeArray();
                array = element.getArray();
	}
	
	public void execute(int n) {
		switch (n) {
			case 1:
			sort();
			break;
			
			case 2:
			System.exit(0);
		}
	}
	
	public void sort() {
        final String[] mcSort = {"Bubble Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                algorithm.display(array);
                switch (n) {
                    case 1:
                        algorithm.bubbleSort(array);
                        System.out.println("Sorted array by Bubble Sort: ");
                        algorithm.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, sizeArray - 1);
                        System.out.println("Sorted array by Quick Sort: ");
                        algorithm.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
