package co.edu.emp;

/*
 * 사원정보 : 복합적인 데이터 유형.
 * 사원번호, 이름, 부서번호, 부서명, 급여, 이메일
 */
public class Employee {
	private int employeeId; // 사번
	private String name; // 이름
	private int departmentId; // 부서번호 10:인사 20:개발 30:영업(기본값)
	private String departmentName; // 부서명
	private int salary; // 급여
	private String email; // 이메일

	// 생성자.
	public Employee() {
	}

	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else {/* if (departmentId == 30) */
			departmentName = "영업";
		}
	}

	// 사번, 이름 초기화.
	public Employee(int employeeId, String name) {
		this(employeeId, name, 100, 30); // this 다른 생성자를 호출할 떄 사용 가능.
	}

	// 사번, 이름, 급여
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	
	//상세정보를 반환기능.
	public String getDetailInfo() {
		//사원번호, 이름, 급여, 부서정보
		
		String info = "사원번호 : " +  employeeId  + " 이름: " +   name  +" 급여: " + salary + " 부서정보: " + departmentName;
		return info;
	}
	
	
	
	// get
	public int getEmployeeId() {
		return employeeId;
	}

	// set
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getdepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
