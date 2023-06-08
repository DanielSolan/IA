public class Database {
    private String filename;
    private int rowWidth;
    private int recordCount;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
        recordCount = FileHandler.countLines(filename);
    }

    public void appendRecord(String data) {
        // add a new record to the end of the database
        int difference = rowWidth - data.length();
        while (difference>0){
            data = data + "";
            difference = rowWidth - data.length();
        }
        if(difference<0){
            System.out.println("The data is too long to add it.");
            return;
        }
        FileHandler.appendLine(filename, data);
        recordCount++;
    }

    public void deleteRecord(int rowNumber) {
        // delete the record at the specified row
        FileHandler.deleteLineAt(filename, rowNumber);
        recordCount--;
    }

    public String getRecord(int rowNumber) {
        // return the record at the specified row
        return FileHandler.readLineAt(filename , rowNumber);
    }

    public int getRecordCount(String fileName) {
        // return the number of records in the database
        return FileHandler.countLines(fileName);
    }

    public boolean findRecord(String data, String fileName) {
        // search for a record matching data
        // return true if found
        if(FileHandler.containsElement(fileName, data) == true){
            return true;
        } else{
            return false;
        }
    }
}