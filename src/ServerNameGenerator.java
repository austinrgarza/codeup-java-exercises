import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args) {
    String [] adj= {"dead", "hairless", "sadistic", "cocky", "medicated", "violent", "naked", "angry", "slimy","insanely creepy"};
    String [] noun = {"idiot","kitty","friendly grandma","tank","legal warrant","hairy legs", "pocket flask", "police squad","dragon","multi-billionaire"};
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adj,noun));
    }

    public static String randomElement(String[] array1, String[] array2){
        String name = nameSelect(array1)+" "+ nameSelect(array2);
        return name;
    }
    public static String nameSelect(String[] array){
        int max = array.length;
        int choice = (int) (Math.random() * max);
        return array[choice];
    }

//end of class
}
