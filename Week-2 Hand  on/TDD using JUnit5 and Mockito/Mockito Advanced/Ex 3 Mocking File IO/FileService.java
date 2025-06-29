import com.example.FileReader;
import com.example.FleWriter;

public class FileService {
    private final FileReader fileReader;
    private final FleWriter fileWriter;

    public FileService(FileReader fileReader, FleWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public String processFile() {
        String content = fileReader.read();
        String processedContent = "Processed " + content;
        fileWriter.write(processedContent);
        return processedContent;
    }
}
