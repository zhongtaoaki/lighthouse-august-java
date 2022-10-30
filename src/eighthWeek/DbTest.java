package eighthWeek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import eighthWeek.Grade.Subject;

public class DbTest {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		String url = "jdbc:postgresql://localhost:5432/hello";
		String user = "postgres";
		String password = "123456";

		List<Grade> grades = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("数据库链接成功");

			statement = connection.createStatement();
			String sql = "SELECT name, subject, score FROM grade LEFT JOIN name ON grade.number = name.number;";
			result = statement.executeQuery(sql);
			System.out.println("数据库查询成功");

			while (result.next()) {
				grades.add(new Grade(result.getString(1), result.getString(2), result.getInt(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (statement != null)
					statement.close();
				if (result != null)
					result.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		grades.stream()
				.filter(e -> e.getSubject() == Subject.JAVA)
				.sorted((e1, e2) -> e2.getScore() - e1.getScore())
				.forEach(t -> System.out.println(t));

	}

}
