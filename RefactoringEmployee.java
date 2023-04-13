public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private LocalDate dateJoined;
	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, LocalDate dateJoined, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.dateJoined = dateJoined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public boolean getIsForeigner() {
		return isForeigner;
	}

	public boolean getGender() {
		return gender;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int grade) {
		// implementation
	}

	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}

	public void setOtherMonthlyIncome(int income) {
		this.otherMonthlyIncome = income;
	}

	public int getAnnualDeductible() {
		return annualDeductible;
	}

	public void setAnnualDeductible(int deductible) {
		this.annualDeductible = deductible;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseIdNumber() {
		return spouseIdNumber;
	}

	public void setSpouseIdNumber(String spouseIdNumber) {
		this.spouseIdNumber = spouseIdNumber;
	}

	public List<String> getChildNames() {
		return childNames;
	}

	public void addChildName(String childName) {
		childNames.add(childName);
	}

	public List<String> getChildIdNumbers() {
		return childIdNumbers;
	}

	public void addChildIdNumber(String childIdNumber) {
		childIdNumbers.add(childIdNumber);
	}

	public int getAnnualIncomeTax() {
		// implementation
	}
}
