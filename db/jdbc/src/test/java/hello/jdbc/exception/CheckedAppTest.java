package hello.jdbc.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.ConnectException;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class CheckedAppTest {
    @Test
    void checked() {
        Controller controller = new Controller();
        assertThatThrownBy(controller::request)
                .isInstanceOf(SQLException.class);
    }

    static class Controller {
        Service service = new Service();

        void request() throws SQLException, ConnectException {
            service.logic();
        }
    }

    static class Service {
        Repository repository = new Repository();
        NetworkClient networkClient = new NetworkClient();

        void logic() throws ConnectException, SQLException {
            repository.call();
            networkClient.call();
        }
    }

    static class NetworkClient {
        void call() throws ConnectException {
            throw new ConnectException("연결 실패");
        }
    }

    static class Repository {
        void call() throws SQLException {
            throw new SQLException("ex");
        }
    }
}
