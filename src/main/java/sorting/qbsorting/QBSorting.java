package sorting.qbsorting;
import Common.Algorithm;
import Controller.Sorting;
import Model.Element;

public class QBSorting {

    public static void main(String[] args) {
        Element element = new Element();
	Algorithm algorithm = new Algorithm();
	element.setSizeArray(algorithm.getInt("Enter number of array", 1, 100));
	element.setArray(algorithm.createArray(element.sizeArray));
	new Sorting(element).run();
    }
}
