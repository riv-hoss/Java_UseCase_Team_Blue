import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class VetHistory {
	int animalId;
	private final GregorianCalendar startDate;
	private GregorianCalendar endDate;
	private String reason, diagnosis;
	ArrayList<Medication> medication = new ArrayList<Medication>();
	ArrayList<String> treatment	= new ArrayList<>();


	public VetHistory(int animalId, String reason) {
		this.animalId = animalId;
		this.startDate = (GregorianCalendar) Calendar.getInstance();
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public ArrayList<Medication> getMedication() {
		return medication;
	}

	public void setMedication(ArrayList<Medication> medication) {
		this.medication = medication;
	}

	public ArrayList<String> getTreatment() {
		return treatment;
	}

	public void setTreatment(ArrayList<String> treatment) {
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "VetHistory{" +
				"animalId=" + animalId +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", reason='" + reason + '\'' +
				", diagnosis='" + diagnosis + '\'' +
				", medication=" + medication +
				", treatment=" + treatment +
				'}';
	}
}
