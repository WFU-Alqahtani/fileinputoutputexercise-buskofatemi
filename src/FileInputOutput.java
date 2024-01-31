import java.io.*;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) throws IOException {
//       1) Open the given file inside src called moviesDataSet.csv
//        FileInputStream movies = null;
//        try {
//            movies = new FileInputStream("src/moviesDataset.csv");
//        }
//        catch(FileNotFoundException x){
//            System.out.println("File not found -ending program");
//            System.exit(1);
//        }
//        Scanner scnr = new Scanner(movies);
//        while(scnr.hasNextLine()){
//            String data = scnr.nextLine();
//            System.out.println(data);
//        }
//        movies.close();
//
//        FileInputStream movies2 = null;
//        try {
//            movies2 = new FileInputStream("src/moviesDataset.csv");
//        }
//        catch(FileNotFoundException x){
//            System.out.println("File not found -ending program");
//            System.exit(1);
//        }
//
//        Scanner scnr2 = new Scanner(movies2);
//        while(scnr2.hasNextLine()){
//            String[] line = scnr2.nextLine().split(",");
//            System.out.println(line[2]);
//        }
//        movies2.close();

        FileInputStream movies3 = null;
        try {
            movies3 = new FileInputStream("src/moviesDataset.csv");
        }
        catch(FileNotFoundException x){
            System.out.println("File not found -ending program");
            System.exit(1);
        }

        Scanner scnr3 = new Scanner(movies3);
        FileOutputStream outputYear  = new FileOutputStream("moviesDataset.csv");
        PrintWriter fileWriter = new PrintWriter(outputYear);
        if (scnr3.hasNextLine()){
            scnr3.nextLine();
        }
        while(scnr3.hasNextLine()){
            String[] line = scnr3.nextLine().split(",");

            try {
                Integer.parseInt(line[4]);
                fileWriter.println(line[4]);
            }
            catch (NumberFormatException x) {
                fileWriter.println("N/A");
            }
        }
        fileWriter.close();
        movies3.close();



//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }

}