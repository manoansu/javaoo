package javaoo.exercicios.applications.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javaoo.exercicios.entities.LogUserAccess;

/**
 * 
 * @author manoansu
 * 
 * Um site de internet registra um log de acessos dos usu�rios. Um
registro de log consiste no nome de usu�rio (apenas uma palavra) e o
instante em que o usu�rio acessou o site no padr�o ISO 8601,
separados por espa�o, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e da� informe quantos usu�rios
distintos acessaram o site.
 *
 *Input file
 *
 *amanda 2018-08-26T20:45:08Z
alex86 2018-08-26T21:49:37Z
bobbrown 2018-08-27T03:19:13Z
amanda 2018-08-27T08:11:00Z
jeniffer3 2018-08-27T09:19:24Z
alex86 2018-08-27T22:39:52Z
amanda 2018-08-28T07:42:19Z
 */
public class MainLogUserAccess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogUserAccess> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
			
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogUserAccess(username, moment));
				
				line = br.readLine();
			}
			
			for(LogUserAccess log : set) {
				System.out.println(log);
			}
			System.out.println("\nTotal users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
