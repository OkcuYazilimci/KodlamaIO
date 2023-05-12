package Business.Logging;

public class FileLogger implements Ilogger{
    @Override
    public void log(String course, String byTeacher, String Category) {
        System.out.println("Dosyaya eklendi: " + course + " by " + byTeacher +
                " in " + Category);
    }
}
