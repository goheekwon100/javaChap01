package sec01.exam00;

public class AppWithJDBC {
	public static void main(String[] args) {
		Connection conn = getConnection("MySQL"); //다형성
		
		conn.connect();
		conn.excute("SELECT * FROM member");
	}
	
	public static Connection getConnection(String dbType) {
		if ("MySQL".equals(dbType)) {
			return new MySQLConnection();
		}else if ("Oracle".equals(dbType)) {
			return new OracleConnection();
		}
		throw new RuntimeException("지원하지 않는 DB입니다.");
	}
}

class MySQLConnection implements Connection {

	@Override //추상 메소드 오버라이딩
	public void connect() {
		System.out.println("MySQL에 연결합니다.");
		
	}

	@Override
	public void excute(String sql) {
		System.out.println("MySQL 쿼리 실행: " + sql);
		
	}
	
}
class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Oracle에 연결합니다.");
		
	}

	@Override
	public void excute(String sql) {
		System.out.println("Oracle 쿼리 실행: " + sql);
		
	}
	
}

// 장점
// Connection 인터페이스 한개만 참고해서 프로그래밍 가능
// 어떤 DB를 사용하든 connect()와 excute()만 호출하면 사용 가능
// 코드의 유지보수성과 확장성 크게 향상