//File Handling class for the login + preferences
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;


public class FileHandler {

    public static void appendLine(String fileName, String data) {
        // write text to end of the file
        boolean append = true;
        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(data);
        }
        catch (IOException e) {
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
    }

    public static String readLineAt(String fileName, int start) {
        // grab the line from position "start" in the file
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            return rf.readLine();
        }
        catch (IOException e) {
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
        return null;
    }

    public static void deleteLineAt(String fileName, int start) {
        // grab the line from position "start" in the file
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            writer.write("");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
    }
    public static boolean containsElement(String fileName,String element){
        //Checks each line of the file
        //If data equals desired value, returns true.
        //If not, it continues until there are no elements left to check and returns false.
        boolean hasFound = false;
        try(BufferedReader pw = new BufferedReader(new FileReader(fileName))){
            String ascii = pw.readLine();
            while (hasFound == false){
                ascii = pw.readLine();
                if(ascii.equals(element)){
                    hasFound = true;
                    return hasFound;
                }
            }
            return hasFound;
        }catch(IOException e){
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
        return false;
    }

    public void overWriteFile(String dataType, String newData)
    {

    }


    public static void writeLineAt(String fileName, String data, int start) {
        // overwrite a line from position "start" in the file
        // doesn't check that the start position is actually
        // the beginning of the file. This will not behave well
        // unless every line is the same length.
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            writer.write("");
            writer.write(data);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
    }

    public static int countLines(String fileName) {
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            while(br.readLine() != null){
                br.readLine();
                counter++;
            }
            return counter;

        }
        catch (IOException e) {
            System.out.println("There has been an error with the process.");
            e.printStackTrace();
        }
        return counter;
    }


}