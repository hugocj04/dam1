package Principal;

public class Casino {

	String[] ruleta = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
	        "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35",
	        "36" };
	int posicionActual = 0;

	public void imprimiRuleta() {
	    System.out.println("| " + ruleta[0] + "| " + ruleta[1] + "| " + ruleta[2] + "| " + ruleta[3] + "| " + ruleta[4] + "| "
	            + ruleta[5] + "| " + ruleta[6] + "| " + ruleta[7] + "| " + ruleta[8] + "|");
	    System.out.println("|" + ruleta[35] + "|\t\t\t|" + ruleta[9] + "|");
	    System.out.println("|" + ruleta[34] + "|\t\t\t|" + ruleta[10] + "|");
	    System.out.println("|" + ruleta[33] + "|\t\t\t|" + ruleta[11] + "|");
	    System.out.println("|" + ruleta[32] + "|\t\t\t|" + ruleta[12] + "|");
	    System.out.println("|" + ruleta[31] + "|\t\t\t|" + ruleta[13] + "|");
	    System.out.println("|" + ruleta[30] + "|\t\t\t|" + ruleta[14] + "|");
	    System.out.println("|" + ruleta[29] + "|\t\t\t|" + ruleta[15] + "|");
	    System.out.println("|" + ruleta[28] + "|\t\t\t|" + ruleta[16] + "|");
	    System.out.println("|" + ruleta[27] + "|\t\t\t|" + ruleta[17] + "|");
	    System.out.println("|" + ruleta[26] + "|" + ruleta[25] + "|" + ruleta[24] + "|" + ruleta[23] + "|" + ruleta[22] + "|"
	            + ruleta[21] + "|" + ruleta[20] + "|" + ruleta[19] + "|" + ruleta[18] + "|");
	}

}
