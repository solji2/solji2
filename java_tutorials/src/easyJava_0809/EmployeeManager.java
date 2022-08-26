package easyJava_0809;

import java.util.ArrayList;
import java.util.List;

interface Employee {
	public void showName();
	public int getPay();
	public void showSalaryInfo();
}

abstract class Worker implements Employee {
	protected String name;

	public Worker(String name) {
		this.name = name;
	}
	public void showName() {
		
	}
}

class PermanentWorker extends Worker {
	public int salary;

	public PermanentWorker(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	@Override
	public void showSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("�씠由� : %s -->> 湲됱뿬 : %d\n", super.name, getPay());
	}
}
//�꽭�씪利� �썙而ㅻ뒗 蹂대꼫�뒪 鍮꾩쑉�뿉 鍮꾨��빐 異붽�湲덈룄 諛쏆�留�, �뙋留ㅻ웾怨� 愿�怨꾧��엳�쓬

class SalesWorker extends PermanentWorker {
	public int salesAmount;
	public double bonusRatio;
	public SalesWorker(String name, int salary, int salesAmount, double bonusRatio) {
		super(name, salary);
		this.salesAmount = salesAmount;
		this.bonusRatio = bonusRatio;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return super.salary + (int)(salesAmount * bonusRatio);
	}
	@Override
	public void showSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("�씠由� : %s -->> 湲됱뿬 : %d\n", super.name, getPay());
	}	
}
//�뀥�띁由ъ썙而ㅻ뒗 �떆媛� * �떆媛꾨떦 湲됱뿬
class TemporaryWorker extends Worker {
	public int payPerHour;
	public int workTime;
	public TemporaryWorker(String name, int payPerHour, int workTime) {
		super(name);
		this.payPerHour = payPerHour;
		this.workTime = workTime;
	}
	
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return workTime * payPerHour;
	}
	
	@Override
	public void showSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("�씠由� : %s -->> 湲됱뿬 : %d\n", super.name, getPay());
	}
}

class ManagerService {
	private List<Worker> workers;
	
	public ManagerService() { // 由ъ뒪�듃 �깮�꽦
		workers = new ArrayList<Worker>();
	}
	
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	
	public void showAllSalaryInfo() {
		for(Worker w : workers) {
			w.showSalaryInfo();
		}
	}
	
	public void showSalaryInfo(String name) {
		
	}
	
	public void showTotalSalary() {
		int totalMoney = 0;
		for(Worker w : workers) {
			totalMoney += w.getPay();
		}
		System.out.println("紐⑤뱺 �궗�썝�뱾�쓽 湲됱뿬 珥앹븸�� : " + totalMoney + "�썝");
	}
}

public class EmployeeManager {
	public static void main(String[] args) {
		ManagerService manager = new ManagerService();
		manager.addWorker(new PermanentWorker("肄붾궃", 3000));
		manager.addWorker(new PermanentWorker("�옣誘�", 3500));
		manager.addWorker(new TemporaryWorker("�븣諛�1", 9, 100));
		manager.addWorker(new TemporaryWorker("�븣諛�2", 8, 70));
		manager.addWorker(new SalesWorker("�뙋留ㅼ솗", 1000, 200000, 0.01));
		manager.addWorker(new SalesWorker("�뙋留ㅼ떊�엯", 1000, 50000, 0.01));
		manager.showAllSalaryInfo();
		manager.showTotalSalary();
		
	}
}
