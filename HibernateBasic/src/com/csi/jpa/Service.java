package com.csi.jpa;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {
	public static SessionFactory factory;

	public static void main(String[] args) {
		int ch = 0;
		while ((ch <= 5)) {
			System.out.println("1.Insert 2.Update 3.Delete 4.Display \nEnter your choice : ");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				insertData();
				break;
			case 2:
				updateData(1);
				break;
			case 3:
				deleteData(101);
				break;
			case 4:
				getData();
				break;
			default:
				System.exit(0);
				break;
			}
		}
		// insertData();
		// getData();
		// updateData(1);
		// getData();
		// deleteData(101);
		// factory.close();
	}

	public static void insertData() {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Sam");
		e1.setEmpSal(12000.50);
		session.save(e1);
		transaction.commit();
		session.close();
	}

	public static void getData() {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		List employeeList = session.createQuery("from Employee").list();
		employeeList.forEach(System.out::println);
		session.close();
	}

	public static void updateData(int empId) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		for (Employee emp : employeeList) {
			if (emp.getEmpId() == empId) {
				emp.setEmpName("Rupali");
				emp.setEmpSal(545545);
				session.update(emp);
				transaction.commit();
			}
		}
		session.close();
	}

	private static void deleteData(int empId) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		for (Employee emp : employeeList) {
			if (emp.getEmpId() == empId) {
				session.delete(emp);
				transaction.commit();
			}
		}
		session.close();
	}
}
