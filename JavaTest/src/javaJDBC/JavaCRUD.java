package javaJDBC;

import java.io.*;
import java.sql.*;

public class JavaCRUD {

	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String DB_URL = "jdbc:mariadb://localhost/example";
	static final String USER = "root";
	static final String PASS = "ajeng123";

	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader input = new BufferedReader(inputStreamReader);

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

			while (!conn.isClosed()) {
				showMenu();
			}
			conn.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static void showMenu() {
		System.out.println("\n=========== MENU UTAMA =============");
		System.out.println("1. Insert Data");
		System.out.println("2. Show Data");
		System.out.println("3. Update Data");
		System.out.println("4. Delete Data");
		System.out.println("0. Keluar");
		System.out.println("");
		System.out.print("PILIHAN >> ");

		try {
			int pilihan = Integer.parseInt(input.readLine());

			switch (pilihan) {
			case 0:
				System.exit(0);
				break;
			case 1:
				insertData();
				break;
			case 2:
				showData();
				break;
			case 3:
				updateData();
				break;
			case 4:
				deleteData();
				break;
			default:
				System.out.println("Pilihan salah!");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void showData() {
		String sql = "SELECT * FROM biodata";
		try {
			
			rs = stmt.executeQuery(sql);

			System.out.println("+--------------------------------+");
			System.out.println("|    DATA MAHASISWA   |");
			System.out.println("+--------------------------------+");

			while (rs.next()) {
				int id = rs.getInt("ID");
				int age = rs.getInt("AGE");
				String first = rs.getString("FIRST_NAME");
				String last = rs.getString("LAST_NAME");

				System.out.println(String.format("%d, %d, %s, %s", id, age, first, last));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void insertData() {

		try {

			System.out.print("ID: ");
			int id = Integer.parseInt(input.readLine());
			System.out.print("AGE: ");
			int age = Integer.parseInt(input.readLine());
			System.out.print("FIRST_NAME: ");
			String first = input.readLine().trim();
			System.out.print("LAST_NAME: ");
			String last = input.readLine().trim();

			String sql = "INSERT INTO biodata (ID, AGE, FIRST_NAME, LAST_NAME) VALUE(%d, %d, '%s', '%s')";
			sql = String.format(sql, id, age, first, last);

			stmt.execute(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void updateData() {

		try {

			System.out.print("ID yang mau diedit: ");
			int id = Integer.parseInt(input.readLine());
			System.out.print("AGE: ");
			int age = Integer.parseInt(input.readLine());
			System.out.print("FIRST_NAME: ");
			String first = input.readLine().trim();
			System.out.print("LAST_NAME: ");
			String last = input.readLine().trim();

			String sql = "UPDATE biodata SET AGE=%d, FIRST_NAME='%s', LAST_NAME='%s' WHERE id=%d";
			sql = String.format(sql, age, first, last, id);

			stmt.execute(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteData() {

		try {

			System.out.print("ID yang mau dihapus: ");
			int id = Integer.parseInt(input.readLine());

			String sql = String.format("DELETE FROM biodata WHERE id=%d", id);
			stmt.execute(sql);

			System.out.println("Data telah terhapus...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
