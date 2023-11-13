package overloading;

class Report {

	public String generateReport() {
		return "CSV";
	}

	public Object generateReport(String x) {
		return "XLSX";
	}
}

public class ChallengeOne {
	public static void main(String[] args) {
		Report rep = new Report();
		String csv = rep.generateReport();
		Object xlsx = rep.generateReport("ricardo");
		System.out.println(csv + ":" + (String) xlsx);
	}

}
