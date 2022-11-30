package com.kelp.kelpProject;

import java.io.*;
import java.util.*;

public class Menu {
	AccModel accModel = new AccModel();

	private HashMap<String, Integer> pair = new HashMap<String, Integer>();

	public void menu(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(args[0]);
			Scanner sc = new Scanner(fis);

			while (sc.hasNextLine()) {
				String input = sc.nextLine();
				String[] cmd = input.split(" ");
				String accNo = null;
				String accName = null;
				Integer accBal = 0;

				switch (cmd[0]) {
				case "CREATE":
					accNo = cmd[1];
					accName = cmd[2];
					accModel.setAccNo(accNo);
					accModel.setAccName(accName);

					break;

				case "DEPOSIT":
					accNo = cmd[1];

					switch (accNo) {
					case "ACC001":
						accModel.setAccBalTemp(Integer.parseInt(cmd[2]));
						accModel.setAccBal(accModel.getAccBalTemp()+accBal);
						break;
					case "ACC002":
						accModel.setAccBalTemp(Integer.parseInt(cmd[2]));
						accModel.setAccBal(accModel.getAccBalTemp()+accBal);
						break;

					default:
						break;
					}
					
					break;

				case "WITHDRAW":
					accNo = cmd[1];
					
					switch (accNo) {
					case "ACC001":
						accModel.setAccBalTemp(Integer.parseInt(cmd[2]));
						accModel.setAccBal(accModel.getAccBal()-accModel.getAccBalTemp());
						accModel.setAccNo1(accModel.getAccName());
						pair.put(accModel.getAccNo(), accModel.getAccBal());
						break;
					case "ACC002":
						accModel.setAccBalTemp(Integer.parseInt(cmd[2]));
						accModel.setAccBal(accModel.getAccBal()-accModel.getAccBalTemp());
						accModel.setAccNo2(accModel.getAccName());
						pair.put(accModel.getAccNo(), accModel.getAccBal());
						
						break;

					default:
						break;
					}
					break;

				case "BALANCE":
					accNo = cmd[1];
					switch (accNo) {
					case "ACC001":
						System.out.println(accModel.getAccNo1()+" "+pair.get(accNo));
						break;
					case "ACC002":
						System.out.println(accModel.getAccNo2()+" "+pair.get(accNo));
						break;

					default:
						break;
					}

					break;

				default:
					break;
				}
			}
			sc.close();
		} catch (IOException e) {
		}
	}

}
