package com.singgih.avro;

import java.util.List;

import com.singgih.avro.generated.Person;
import com.singgih.avro.util.AvroUtils;


public class RunAvro {

	public static void main(String[] args) {
		AvroUtils avroUtils = new AvroUtils();
		List<Person> personList = avroUtils.getSampleData();
	
		String outputAvroFile = "D:/temp/person.avro";
		//Write avro file
		avroUtils.writeAvroFile(outputAvroFile, personList);
		
		//Read avro file
		List<Person> personListFromFile = avroUtils.readAvroFile(outputAvroFile);
		for (Person person : personListFromFile) {
			System.out.println(person);
		}
	}

}
