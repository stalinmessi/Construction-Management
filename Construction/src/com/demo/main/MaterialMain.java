package com.demo.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.demo.execption.MaterialException;
import com.demo.execption.MaterialNotFoundException;
import com.demo.response.MaterialResponseObject;
import com.demo.service.MaterialService;
import com.demo.vo.MaterialVO;

public class MaterialMain {
	
				public static void main(String[] args) throws MaterialNotFoundException, MaterialException, SQLException {

						System.out.println("Please select one of the below options");
						System.out.println("1. Add Material");
						System.out.println("2. Fetch Material by Material_id");
						System.out.println("3. Fetch Material by Material_name");
						System.out.println("4. Update Material Details");
						System.out.println("5. Exit");
						Scanner s = new Scanner(System.in);
						int menuSelected = s.nextInt();
						switch (menuSelected) {
						case 1:
							addMaterialDetails();
							break;
						case 2:
							fetchMaterialById();
							break;
						case 3:
							fetchMaterialByName();
							break;
						case 4:
							updateMaterialDetails();
							break;
						default:
							System.exit(0);
						}
					}

}


				
					private static void addMaterialDetails() throws MaterialException {
						MaterialService materialservice = new MaterialService();
						Scanner s = new Scanner(System.in);
						boolean flag;
						System.out.println("Please Enter The Material _id:");
						Integer Material_id = Integer.parseInt(s.nextLine());
						System.out.println("Please Enter The Material_name:");
						String Material_name = s.nextLine();
						MaterialVO vo = new MaterialVO();

						vo.setMaterial_id(Material_id);
						vo.setMaterial_name(Material_name);
						MaterialResponseObject obj =null;
						obj=materialservice.addMaterial(vo);
						if (obj.getSuccessMessage() != null) {
							System.out.println(obj.getSuccessMessage());
						} else {
							System.out.println(obj.getFailureMessage());
						}

					}
						
						// TODO Auto-generated method stub
						private static void fetchMaterialById() throws MaterialNotFoundException {
							Scanner s = new Scanner(System.in);
							System.out.println("Please Enter The Material_id:");
							Integer Material_id = Integer.parseInt(s.nextLine());

							MaterialService materialService = new MaterialService();
							MaterialResponseObject obj= materialService.fetchMaterialById(Material_id);
							MaterialVO vo;
							vo = obj.getMaterialVO();
							if (vo != null) {
								System.out.println(
										"========================================================================================================================================================");
								System.out.println("Material_id" + '\t' + "Material_name");
								System.out.println(
										"=========================================================================================================================================================");
								System.out.println(vo.getMaterial_id() + "\t\t" + vo.getMaterial_name());
							} else {
								System.out.println(obj.getFailureMessage());
							}
						}


					

					

					

					private static void updateMaterialDetails() throws MaterialException {
						MaterialService materialservice = new MaterialService();
						Scanner s = new Scanner(System.in);
						boolean flag;
						System.out.println("Please Enter The Material _id:");
						Integer Material_id = Integer.parseInt(s.nextLine());
						System.out.println("Please Enter The Material_name:");
						String Material_name = s.nextLine();
						System.out.println("Please Enter The Material_quality:");
						String Material_quality = s.nextLine();
						System.out.println("Please Enter The Material_price:");
						Double Material_price = s.nextDouble();
						 MaterialVO vo = new  MaterialVO();
						vo.setMaterial_id(Material_id);
						vo.setMaterial_name(Material_name);
						vo.setMaterial_quality(Material_quality);
						vo.setMaterial_price(Material_price);
					 
						 MaterialResponseObject obj =  materialservice.updateMaterialDetails(vo);
						if (obj.getSuccessMessage() != null) {
							System.out.println(obj.getSuccessMessage());
						} else {
							System.out.println(obj.getFailureMessage());
						}
					}
				
	}




