package com.ioreadwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	public void empPayrollRead() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(
				"C:\\Users\\Dipal\\Desktop\\bridglabz.txt"));
		for (String line : lines) {
			System.out.println(line);
		}
	}

	public void writeDataEmployeePayRoll() throws IOException {
		ArrayList<String> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		data.add(sc.next());
		System.out.println("Enter Name");
		data.add(sc.next());
		System.out.println("Enter Salary");
		data.add(sc.next());
		Files.write(Paths.get(
				"C:\\\\Users\\\\Dipal\\\\Desktop\\\\bridglabz.txt"),
				data, StandardOpenOption.CREATE);
	}

	public static void main(String[] args) throws IOException {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.writeDataEmployeePayRoll();
		emp.empPayrollRead();
	}
}


