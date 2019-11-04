package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		String path = "/home/moab/Downloads/in.cvs";
		int i = 1;
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCvs = br.readLine();
			while (employeeCvs != null) {
				String[] fields = employeeCvs.split(",");
				list.add(new Employee(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2])));
				employeeCvs = br.readLine();

			}
		
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.print("[" + i + "] ");
				System.out.println("|" + emp.getIndex() + "" + emp.getName() + ", " + emp.getSalary());
				i++;
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
