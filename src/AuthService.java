import java.sql.SQLException;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
    public String getNickByLoginPassDB(String login, String pass) throws SQLException, ClassNotFoundException;
}
