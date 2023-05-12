package Business.Logging;

public class DataBase implements Ilogger{
    @Override
    public void log(String course, String byTeacher, String Category) {
        System.out.println("Data baseye eklendi: " + course + " by " + byTeacher +
                " in " + Category);
    }
}

