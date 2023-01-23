package com.co.promon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getAllStudent(){
		return custo;
	}

	private static ArrayList<Student> custo = new ArrayList<>(Arrays.asList(
			
			new Student("RajniKanth Khan","cust123",6354778765l),
			new Student("AjithKumar","cust456",8767456754l),
			new Student("AlluArjun","cust789",9878904367l)
        ));
	
	public void addStudent(Student cust) {
		custo.add(cust);
	}

	public void updateStudent(String id, Student cust) {
		for(int i=0; i<custo.size(); i++) {
			Student c = custo.get(i);
			if(c.getId().equals(id)) {
				custo.set(i, cust);
				return;
			}
		}
		
	}

	public void deleteStudent(String id) {
		custo.removeIf(c->c.getId().equals(id));
		
	}

	public static Student getStudent(String id) {
		return custo.stream().filter(c->c.getId().equals(id)).findFirst().get();
	}

}
