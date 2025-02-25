package smartPrescriptionController;

import java.util.List;
import java.util.Scanner;

import smartPrescriptionModel.Cause;
import smartPrescriptionModel.Medicine;
import smartPrescriptionModel.Pharmacist;
import smartPrescriptionService.PrescriptionService;

public class PrescriptionController {

	PrescriptionService service = new PrescriptionService();

	public void start() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 Pharmacist");
			System.out.println("2 Patient");
			int auth = sc.nextInt();

			switch (auth) {
			case 1:
				while (true) {
					System.out.println("1 Register");
					System.out.println("2 Login");
					int decide = sc.nextInt();

					switch (decide) {
					case 1:
						System.out.println("Enter Your Name");
						String pName = sc.next();
						System.out.println("Enter Your Email");
						String pEmail = sc.next();
						System.out.println("Enter Your UserName");
						String pUserName = sc.next();
						System.out.println("Enter Your Password");
						String pPassword = sc.next();

						service.register(new Pharmacist(pName, pEmail, pUserName, pPassword));
						break;
					case 2:

						System.out.println("Enter UserName");
						String username = sc.next();
						System.out.println("Enter Password");
						String password = sc.next();
						Pharmacist p = service.login(username, password);
						if (p == null) {
							System.out.println("Invalid Credentials");
						} else {

							while (true) {
								System.out.println("1 Add Medicine");
								System.out.println("2 Exit");
								int choice = sc.nextInt();
								switch (choice) {
								case 1:

									System.out.println("Enter Medicine ID");
									int id = sc.nextInt();
									System.out.println("Enter Medicine Name");
									String medicine = sc.next();
									System.out.println("Enter Price Of Medicine");
									double price = sc.nextDouble();
									System.out.println("Enter Cause");
									String causeName = sc.next();
									Cause cause = new Cause(causeName);
									service.addMedicine(new Medicine(id, medicine, price, cause));
									break;
								case 2:
									System.exit(0);
									System.out.println("Exiting..");
								default:
									System.out.println("Invalid Choice Please Try Again..");
									break;
								}

							}
						}
						break;

					default:
						
						System.out.println("Invalid Choice");
						break;
					}

				}
		

			case 2:

				while (true) {
					System.out.println("1 Get Medicine");
					System.out.println("2 Exit");
					int pDecide = sc.nextInt();

					switch (pDecide) {
					case 1:
						System.out.println("Enter Cause");
						String causeName1 = sc.next();
						Cause c1 = new Cause(causeName1);
						service.addCause(c1);

						Cause existingCause = service.getCauseByName(causeName1);

						if (existingCause == null) {
							System.out.println("No Medicine Available for This Cause");
							break;
						}

						List<Medicine> medObj = service.getMedicine(existingCause);
						if (medObj.isEmpty()) {
							System.out.println("No Medicine Is Available..");
						} else {

							for (Medicine m : medObj) {
								System.out.println(m.getName());
							}
						}
						break;

					case 3:
						System.exit(0);
						System.out.println("Exiting..");
					default:
						System.out.println("Invalid Choice Please Try Again..");
						break;

					}
				}
			}
		}
	}
}