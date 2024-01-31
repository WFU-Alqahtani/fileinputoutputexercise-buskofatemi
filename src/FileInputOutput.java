import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileInputOutput {

    public static void main(String[] args) throws IOException {
//       1) Open the given file inside src called moviesDataSet.csv
        FileInputStream movies = null;
        try {
            movies = new FileInputStream("src/moviesDataset.csv");
        }
        catch(FileNotFoundException x){
            System.out.println("File not found -ending program");
            System.exit(1);
        }
        Scanner scnr = new Scanner(movies);
        while(scnr.hasNextLine()){
            String data = scnr.nextLine();
            System.out.println(data);
        }
        movies.close();

        FileInputStream movies2 = null;
        try {
            movies2 = new FileInputStream("src/moviesDataset.csv");
        }
        catch(FileNotFoundException x){
            System.out.println("File not found -ending program");
            System.exit(1);
        }

        Scanner scnr2 = new Scanner(movies2);
        while(scnr2.hasNextLine()){
            String[] line = scnr2.nextLine().split(",");
            System.out.println(line[2]);
        }

        movies2.close();

//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }

}