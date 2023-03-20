public class Database {
    private String filename;
    private int rowWidth;
    private int recordCount;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
        recordCount = FileHandler.countLines(filename);
    }

    // add a new record to the end of the database
    public void appendRecord(String data) {
        int difference = rowWidth - data.length();
        while (difference>0){
            data = data + "";
            difference = rowWidth - data.length();
        }
        // TODO: Report an error if the data is too long for the record
        if(difference<0){
            System.out.println("The data is too long to add it.");
            return;
        }
        FileHandler.appendLine(filename, data);
        recordCount++;
    }

    // delete the record at the specified row
    public void deleteRecord(int rowNumber) {
        FileHandler.deleteLineAt(filename, rowNumber);
        recordCount--;
    }

    // return the record at the specified row
    public String getRecord(int rowNumber) {
        return FileHandler.readLineAt(filename , rowNumber);
    }

    // return the number of records in the database
    public int getRecordCount(String fileName) {
        return FileHandler.countLines(fileName);
    }

    // search for a record matching data
    // return true if found
    public boolean findRecord(String data, String fileName) {

        return false; // TODO: replace this placeholder code
    }
}
