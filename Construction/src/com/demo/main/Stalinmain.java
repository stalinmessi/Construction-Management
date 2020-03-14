
		private static void addSource() throws SourceManagementException {
		SourceService sourceService = new SourceService();
			Scanner s = new Scanner(System.in);
			boolean flag;
			System.out.println("Please Enter The Source _id:");
			Integer Source_id = Integer.parseInt(s.nextLine());
			System.out.println("Please Enter The Source_name:");
			String Source_name = s.nextLine();
			SourceVO vo = new SourceVO();

			vo.setSource_id(Source_id);
			vo.setSource_name(Source_name);
			SourceResponseObject obj = null;
			obj = sourceService.addSource(vo);
			if (obj.getSuccessmessage() != null) {
				System.out.println(obj.getSuccessmessage());
			} else {
				System.out.println(obj.getFailuremessage());
			}
		}

				private static void fetchSourceById() throws SourceNotFoundException {
					// TODO Auto-generated method stub
					  Scanner s = new Scanner(System.in);
						System.out.println("Please Enter The Source_id:");
						Integer Source_id = Integer.parseInt(s.nextLine());

						SourceService sourceService = new SourceService();
						SourceResponseObject obj = sourceService.fetchSourceById(Source_id);
						SourceVO vo;
						vo = obj.getSourceVO();
						if (vo != null) {
							System.out.println(
									"====================================================");
							System.out.println("Source_id" + '\t' + "Source_name");
							System.out.println(
									"===========================================================");
							System.out.println( vo.getSource_id()+"\t\t"+vo.getSource_name());
						
						} else {
							System.out.println(obj.getFailuremessage());
						}
				          
							}


				private static void fetchSourceByName() throws SourceNotFoundException {
					// TODO Auto-generated method stub
					 Scanner s = new Scanner(System.in);
						System.out.println("Please Enter The Source_name:");
						String Source_name=s.nextLine();
						SourceService sourceService = new SourceService();
						SourceResponseObject obj = sourceService.fetchSourceByName(Source_name);
						List<SourceVO> list = new ArrayList<SourceVO>();
						list = obj.getSourceVOList();
						if (list != null) 
						{
							System.out.println(
									"===================================================");
							System.out.println("Source_id" + '\t' + "Source_name");
							System.out.println(
									"============================================================");
						System.out.println(list);
						} else {
							System.out.println(obj.getFailuremessage());
						}
			          
							}

				private static void updateSource() throws SourceManagementException {
					SourceService sourceService = new SourceService();
					Scanner s = new Scanner(System.in);
					boolean flag;
					System.out.println("Please Enter The Source _id:");
					Integer Source_id = Integer.parseInt(s.nextLine());
					System.out.println("Please Enter The Source_name:");
					String Source_name = s.nextLine();
					SourceVO vo = new SourceVO();

					vo.setSource_id(Source_id);
					vo.setSource_name(Source_name);
					SourceResponseObject obj = null;
					obj = sourceService.updateSource(vo);
					if (obj.getSuccessmessage() != null) {
						System.out.println(obj.getSuccessmessage());
					} else {
						System.out.println(obj.getFailuremessage());
					}
				}
		}
*/