package sec01.exam00;

public class AppWithoutJDBC {
	public static void main(String[] args) {
//		MySQLDatabase mysql = new MySQLDatabase();
//		mysql.connectToMySQL();
//		mysql.runMySQL("SELECT * FROM member;");
		
//		OracleDatabase oracle = new OracleDatabase();
//		oracle.openOracleConnection();
//		oracle.excuteOracleQuery("SELECT * FROM member;");
	}
}

//// MYSQL 데이터베이스에 연결한다고 가정
//
//class MySQLDatabase {
//	public void connectToMySQL() {
//		System.out.println("MySQL에 연결합니다.");
//	}
//	
//	public void runMySQL(String sql) {
//		System.out.println("MySQL 쿼리 실행: " + sql);
//	}
//}
//
//// Oracle DB
//class OracleDatabase {
//	public void openOracleConnection() {
//		System.out.println("Oracle에 연결합니다.");
//	}
//	
//	public void excuteOracleQuery(String sql) {
//		System.out.println("Oracle 쿼리 실행: " + sql);
//	}
//}

// 문제점
// DB마다 메소드명이 다르고, 클래스도 달라서 하나의 코드로 통일 불가
// 만약 DB를 바꾸면 전체 코드 재작성 필요
// 유지보수 매우 어려운 문제