package com.demo.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.demo.vo.EngineerVO;

import com.demo.execption.EngineerException;
import com.demo.execption.EngineerNotFoundException;
import com.demo.response.EngineerResponseObject;
import com.demo.service.EngineerService;

public class EngineerMain{
			public static void main(String[] args) throws EngineerNotFoundException, EngineerException, SQLException {

					System.out.println("Please select one of the below options");
					System.out.println("1. Add Engineer");
					System.out.println("2. Fetch Engineer by Engineer_id");
					System.out.println("3. Fetch Engineer by Engineer_name");
					System.out.println("4. Update Engineer Details");
					System.out.println("5. Exit");
					Scanner s = new Scanner(System.in);
					int menuSelected = s.nextInt();
					switch (menuSelected) {
					case 1:
						addEngineerDetails();
						break;
					case 2:
						fetchEngineerById();
						break;
					case 3:
						fetchEngineerByname();
						break;
					case 4:
						updateEngineerDetails();
						break;
					default:
						System.exit(0);
					}
				}

				private static void updateEngineerDetails() {
				// TODO Auto-generated method stub
				
			}

				private static void fetchEngineerByname() {
				// TODO Auto-generated method stub
				
			}

				private static void fetchEngineerById() {
				// TODO Auto-generated method stub
				
			}

				private static void addEngineerDetails() throws EngineerException {
					EngineerService engineerService = new EngineerService();
					Scanner s = new Scanner(System.in);
					boolean flag;
					System.out.println("Please Enter The Engineer _id:");
					Integer  Engineer_id = Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Engineer_name:");
					String  Engineer_name = s.nextLine();
					System.out.println("Please Enter The  Engineer_age:");
					Integer  Engineer_age= Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Engineer_address:");
					String  Engineer_address = s.nextLine();
					System.out.println("Please Enter The  Engineer_mobile:");
					Long  Engineer_mobile =s.nextLong();
					 EngineerVO vo = new EngineerVO();

					vo.setEngineer_Id( Engineer_id);
					vo.setEngineer_Name( Engineer_name);
					vo.setEngineer_Age(Engineer_age);
					vo.setEngineer_Address(Engineer_address);
					vo.setEngineer_Mobile(Engineer_mobile);
					EngineerResponseObject obj = null;
					obj = EngineerService.addEngineerDetails(vo);
					if (obj.getSuccessMessage() != null) {
						System.out.println(obj.getSuccessMessage());
					} else {
						System.out.println(obj.getFailureMessage());
					}

				}

				private static void fetchEngineerById1() {
					// TODO Auto-generated method stub

				}

				private static void fetchEngineerByName() {
					// TODO Auto-generated method stub

				}

				private static void updateEngineerDetails1() throws EngineerException {
					
					EngineerService engineerService = new EngineerService();
					Scanner s = new Scanner(System.in);
					boolean flag;
					System.out.println("Please Enter The Engineer _id:");
					Integer  Engineer_id = Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Engineer_name:");
					String  Engineer_name = s.nextLine();
					System.out.println("Please Enter The  Engineer_age:");
					Integer  Engineer_age= Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Engineer_address:");
					String  Engineer_address = s.nextLine();
					System.out.println("Please Enter The  Engineer_mobile:");
					Long  Engineer_mobile =s.nextLong();
					 EngineerVO vo = new EngineerVO();

					vo.setEngineer_Id( Engineer_id);
					vo.setEngineer_Name( Engineer_name);
					vo.setEngineer_Age(Engineer_age);
					vo.setEngineer_Address(Engineer_address);
					vo.setEngineer_Mobile(Engineer_mobile);
					EngineerResponseObject obj = null;
					obj = engineerService.updateEngineer(vo);
					if (obj.getSuccessMessage() != null) {
						System.out.println(obj.getSuccessMessage());
					} else {
						System.out.println(obj.getFailureMessage());
					}
				}
}


