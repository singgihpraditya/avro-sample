package com.singgih.avro.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import com.singgih.avro.generated.Person;

public class AvroUtils {
	public List<Person> getSampleData() {
		List<Person> personList = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person person = new Person();
			person.setId(i);
			person.setUsername("person" + i);
			person.setEmailAddress("email" + i + "@gmail.com");
			person.setPhoneNumber("081700000" + i);

			personList.add(person);

		}
		return personList;
	}

	public void writeAvroFile(String outputFileName, List<Person> personList) {
		File avroOutput = new File(outputFileName);
		try {
			System.out.println("Write avro file to : " + outputFileName);
			if (personList.size() > 0) {
				DatumWriter<Person> PersonDatumWriter = new SpecificDatumWriter<Person>(Person.class);
				DataFileWriter<Person> dataFileWriter = new DataFileWriter<Person>(PersonDatumWriter);
				dataFileWriter.create(personList.get(0).getSchema(), avroOutput);
				for (Person person : personList) {
					dataFileWriter.append(person);
				}
				dataFileWriter.close();
			}
			System.out.println("Write successful");

		} catch (IOException e) {
			System.err.println("Error writing Avro");
		}
	}

	public List<Person> readAvroFile(String avroInputFileName) {
		List<Person> personList = new ArrayList<Person>();
		try {
			System.out.println("Read avro file from : " + avroInputFileName);
			File avroInputFile = new File(avroInputFileName);
			DatumReader<Person> bdPersonDatumReader = new SpecificDatumReader(Person.class);
			DataFileReader<Person> dataFileReader = new DataFileReader<Person>(avroInputFile, bdPersonDatumReader);
			Person person = null;
			while (dataFileReader.hasNext()) {
				personList.add(dataFileReader.next(person));
			}
			dataFileReader.close();
		} catch (IOException e) {
			System.out.println("Error reading Avro");
		}
		return personList;
	}
}
