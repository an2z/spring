package hello.jdbc.exception;


import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UncheckedAppTest {
    @Test
    void unchecked() {
        Controller controller = new Controller();
        assertThatThrownBy(controller::request)
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void printEx() {
        Controller controller = new Controller();
        try {
            controller.request();
        } catch (Exception e) {
            log.info("ex", e);
        }
    }

    static class Controller {
        Service service = new Service();

        void request() {
            service.logic();
        }
    }

    static class Service {
        Repository repository = new Repository();
        NetworkClient networkClient = new NetworkClient();

        void logic() {
            repository.call();
            networkClient.call();
        }
    }

    static class NetworkClient {
        void call() {
            throw new RuntimeConnectException("연결 실패");
        }
    }

    static class Repository {
        void call() {
            try {
                runSQL();
            } catch (SQLException e) {
                throw new RuntimeSQLException(e); // 런타임 예외로 전환
            }
        }

        void runSQL() throws SQLException {
            throw new SQLException("ex");
        }
    }

    static class RuntimeConnectException extends RuntimeException {
        public RuntimeConnectException(String message) {
            super(message);
        }
    }

    static class RuntimeSQLException extends RuntimeException {
        public RuntimeSQLException(Throwable cause) {
            super(cause);
        }
    }
}
