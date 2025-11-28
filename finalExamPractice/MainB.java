package b;

import java.util.*;
import java.lang.*;
import java.io.*;

class MainB{
	public static boolean statementValidator(ArrayList<Integer> statement){
		int runningTotal = 0;
		for (int i = 0; i < statement.size() - 1; i++){
			runningTotal += statement.get(i);
		}
		if (runningTotal == statement.get(statement.size() - 1)){
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner scn = new Scanner(System.in);
		String statementName;
		File statementFile;

		System.out.print("[Balance Statement Validator]\nEnter the name of the statement file: ");
		statementName = scn.nextLine();
		try {
			statementFile = new File(statementName);
			Scanner scanner = new Scanner(statementFile);
			int temp;
			while(scanner.hasNextLine()){
				temp = scanner.nextInt();
				scanner.nextLine();
				al.add(temp);
			}
			if (statementValidator(al)){
				System.out.println("Statement is valid");
			} else {
				System.out.println("Statement is not valid");
			}
		} catch (FileNotFoundException e){
			System.out.println("Could not find a file with that name.");
		} catch (NoSuchElementException e){
			System.out.println("Statement file is corrupted");
		} catch (NumberFormatException e){
			System.out.println("Statement file is corrupted.");
		}
	}
}
