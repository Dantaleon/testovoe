package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *  Имя|Возраст|Должность|Зарплата
	Кирилл|26|Middle java dev|150000 руб
	Виталий|28|Senior java automation QA|2000$
	Александр|31|junior functional tester|50000 руб
	Дементий|35|dev-ops|1500$

 */

public class task2 {

	public static void main(String[] args) {
		
		ArrayList<Map<String, String>> tableList = new ArrayList<Map<String, String>>();

		Map<String, String> tableRow1 = new HashMap<String, String>();
		tableRow1.put("Имя", "Кирилл");
		tableRow1.put("Возраст", "26");
		tableRow1.put("Должность", "Middle java dev");
		tableRow1.put("Зарплата", "150000 руб");
		tableList.add(tableRow1);
		
		Map<String, String> tableRow2 = new HashMap<String, String>();
		tableRow2.put("Имя", "Виталий");
		tableRow2.put("Возраст", "28");
		tableRow2.put("Должность", "Senior java automation QA");
		tableRow2.put("Зарплата", "2000$");
		tableList.add(tableRow2);
		
		Map<String, String> tableRow3 = new HashMap<String, String>();
		tableRow3.put("Имя", "Александр");
		tableRow3.put("Возраст", "31");
		tableRow3.put("Должность", "junior functional tester");
		tableRow3.put("Зарплата", "50000 руб");
		tableList.add(tableRow3);
		
		Map<String, String> tableRow4 = new HashMap<String, String>();
		tableRow4.put("Имя", "Дементий");
		tableRow4.put("Возраст", "35");
		tableRow4.put("Должность", "dev-ops");
		tableRow4.put("Зарплата", "1500$");
		tableList.add(tableRow4);
		
		// output Имя where Возвраст < 30
		for (int i = 0; i < tableList.size(); ++i) {
			if (Integer.parseInt(tableList.get(i).get("Возраст")) < 30) {
				System.out.println(tableList.get(i).get("Имя"));
			}
		}
		
		System.out.println("-------------------------------");
		// output Имя where Зарплата contains руб
		for (int i = 0; i < tableList.size(); ++i) {
			if (tableList.get(i).get("Зарплата").contains("руб")) {
				System.out.println(tableList.get(i).get("Имя"));
			}
		}
		
		System.out.println("-------------------------------");
		// output avg от Возраст
		int sum = 0;
		for (int i = 0; i < tableList.size(); ++i) {
			
			sum += Integer.parseInt(tableList.get(i).get("Возраст"));
		}
		double result = sum/tableList.size();
		System.out.printf("%.2f", result);
	}

}
