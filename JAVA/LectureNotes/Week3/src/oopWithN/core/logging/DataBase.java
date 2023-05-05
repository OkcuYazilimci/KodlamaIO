package oopWithN.core.logging;

public class DataBase implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Databaseye loglandi" + data);
    }
}
