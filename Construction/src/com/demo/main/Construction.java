package com.demo.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.execption.EquipmentException;
import com.demo.execption.EquipmentNotFoundException;
import com.demo.response.EquipmentResponseObject;
import com.demo.service.EquipmentSevice;
import com.demo.vo.EquipmentVO;

public class Construction{
	
				public static void main(String[] args) throws EquipmentNotFoundException, EquipmentException, SQLException {

						System.out.println("Please select one of the below options");
						System.out.println("1. Add Equipment");
						System.out.println("2. Fetch Equipment by Equipment_id");
						System.out.println("3. Fetch Equipment by Name");
						System.out.println("4. Update Equipment Details");
						System.out.println("5. Exit");
						Scanner s = new Scanner(System.in);
						int menuSelected = s.nextInt();
						switch (menuSelected) {
						case 1:
							addEquipmentDetails();
							break;
						case 2:
						fetchEquipmentById();
							break;
						case 3:
							fetchEquipmentByName();
							break;
						case 4:
							updateEquipmentDetails();
							break;
						default:
							System.exit(0);
						}
					}

					
				

					private static void addEquipmentDetails() throws EquipmentException {
						EquipmentSevice equipmentService = new EquipmentSevice();

						Scanner s = new Scanner(System.in);
						boolean flag;
						System.out.println("Please Enter The Equipment _Id:");
						Integer Equipment_Id = Integer.parseInt(s.nextLine());
						System.out.println("Please Enter The Equipment_Name:");
						String Equipment_Name = s.nextLine();
						EquipmentVO vo = new EquipmentVO();
						vo.setEquipment_Id(Equipment_Id);
						vo.setEquipment_Name(Equipment_Name);
						EquipmentResponseObject obj=null;
						obj=equipmentService.addEquipmentDetails(vo);
						if (obj.getSuccessMessage() != null) {
							System.out.println(obj.getSuccessMessage());
						} else {
							System.out.println(obj.getFailureMessage());
						}

					}

					

					private static void updateEquipmentDetails() throws EquipmentException {
						EquipmentSevice equipmentservice = new EquipmentSevice();
						Scanner s = new Scanner(System.in);
						boolean flag;
						System.out.println("Please Enter The Equipment_Id:");
						Integer Equipment_Id = Integer.parseInt(s.nextLine());
						System.out.println("Please Enter The Equipment_Name:");
						String Equipment_Name = s.nextLine();
						EquipmentVO vo = new EquipmentVO();

						vo.setEquipment_Id(Equipment_Id);
						vo.setEquipment_Name(Equipment_Name);
					
						EquipmentResponseObject obj =null;
						obj=equipmentservice.updateEquipmentDetails(vo);
						if (obj.getSuccessMessage() != null) {
							System.out.println(obj.getSuccessMessage());
						} else {
							System.out.println(obj.getFailureMessage());
						}

					}
					
					
				private static void fetchEquipmentById() throws EquipmentNotFoundException {
					
					Scanner s = new Scanner(System.in);
					System.out.println("Please Enter The Equipment_Id:");
					Integer Equipment_Id = Integer.parseInt(s.nextLine());
					EquipmentSevice equipmentService = new EquipmentSevice();
					EquipmentResponseObject obj = equipmentService.fetchEquipmentById(Equipment_Id);
				
			         EquipmentVO vo;
					
						vo = obj.getEquipmentVo();
						if (vo != null) {
							System.out.println(
									"================================================================================================");
							System.out.println("Equipment_Id" + '\t' + "Equipment_Name" );
							System.out.println(
									"================================================================================================");
							System.out.println( vo.getEquipment_Id()+"\t\t"+vo.getEquipment_Name()+"" );
						} else {
							System.out.println(obj.getFailureMessage());
						}
				            
				}



				
		 private static void fetchEquipmentByName() throws  EquipmentNotFoundException{
				Scanner s = new Scanner(System.in);
				System.out.println("Please Enter The Equipment_Name:");
				String Equipment_Name = s.nextLine();
				EquipmentSevice equipmentService = new EquipmentSevice();
				EquipmentResponseObject obj = equipmentService.fetchEquipmentByName(Equipment_Name);
				List<EquipmentVO> list ;
				list=obj.getEquipmentVO();
				if (list!=null) 
				{ 
					System.out.println(
							"================================================================================================");
					System.out.println("Equipment_Id" + '\t' + "Equipment_Name" );
					System.out.println(
							"================================================================================================");
					System.out.println(list);
				} else {
					System.out.println(obj.getFailureMessage());
				}
				
				
		 }
}
				
				
				
				
				
				
				


				