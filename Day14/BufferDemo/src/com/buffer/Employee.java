package com.buffer;

import java.io.*;

public class Employee {
    public static void main(String[] args) throws IOException {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\e019851\\OneDrive - Telstra\\Documents\\myiofiles\\employee.txt"))) {
                String employeename="Peter Sam Joes";
                String department="Sales";
                String designation="Manager";
                String salary="35000";
                bw.write(employeename);
                bw.write(department);
                bw.write(designation);
                bw.write(salary);
            }
            try 
            {
            	FileReader reader = new FileReader("C:\\Users\\e019851\\OneDrive - Telstra\\Documents\\myiofiles\\employee.txt");
            	char[] cstr=new char[300];
            	reader.read(cstr);
            	System.out.println(cstr);
            }
            catch (IOException e) 
            {
            	System.out.println(e);
            }
}}