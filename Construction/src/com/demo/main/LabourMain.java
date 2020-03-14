package com.demo.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.demo.vo.EngineerVO;
import com.demo.vo.LabourVO;
import com.demo.execption.EngineerException;
import com.demo.execption.EngineerNotFoundException;
import com.demo.execption.LabourException;
import com.demo.execption.LabourNotFoundException;
import com.demo.response.EngineerResponseObject;
import com.demo.service.EngineerService;
import com.demo.service.LabourService;

public class LabourMain{
			public static void main(String[] args) throws LabourNotFoundException, LabourException, SQLException, EngineerException{

					System.out.println("Please select one of the below options");
					System.out.println("1. Add Labour");
					System.out.println("2. Fetch Labour by Labour_id");
					System.out.println("3. Fetch Labour by Labour_name");
					System.out.println("4. Update Labour Details");
					System.out.println("5. Exit");
					Scanner s = new Scanner(System.in);
					int menuSelected = s.nextInt();
					switch (menuSelected) {
					case 1:
						addLabourDetails();
						break;
					case 2:
						fetchLabourById();
						break;
					case 3:
						fetchLabourByname();
						break;
					case 4:
						updateLabourDetails();
						break;
					default:
						System.exit(0);
					}
				}

				private static void updateLabourDetails() {
				// TODO Auto-generated method stub
				
			}

				private static void fetchLabourByname() {
				// TODO Auto-generated method stub
				
			}

				private static void fetchLabourById() {
				// TODO Auto-generated method stub
				
			}

				

				private static void addLabourDetails() throws LabourException {
					LabourService labourService = new LabourService();
					Scanner s = new Scanner(System.in);
					boolean flag;
					System.out.println("Please Enter The Labour _id:");
					Integer  Labour_id = Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Labour_name:");
					String  Labour_name = s.nextLine();
					System.out.println("Please Enter The  Labour_age:");
					Integer  Labour_age= Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The  Labour_address:");
					String  Labour_address = s.nextLine();
					System.out.println("Please Enter The  Labour_mobile:");
					Long  Labour_mobile =s.nextLong();
					 LabourVO vo = new LabourVO();

					vo.setLabourId(Labour_id);
					vo.setEngineerName( Engineer_name);
					vo.setEngineerAge(Engineer_age);
					vo.setEngineerAddress(Engineer_address);
					vo.setEngineerMobile(Engineer_mobile);
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

					vo.setEngineerId( Engineer_id);
					vo.setEngineerName( Engineer_name);
					vo.setEngineerAge(Engineer_age);
					vo.setEngineerAddress(Engineer_address);
					vo.setEngineerMobile(Engineer_mobile);
					EngineerResponseObject obj = null;
					obj = engineerService.updateEngineer(vo);
					if (obj.getSuccessMessage() != null) {
						System.out.println(obj.getSuccessMessage());
					} else {
						System.out.println(obj.getFailureMessage());
					}
				}
}


