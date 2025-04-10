package garbagecollection;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class FinalizeDemo {
	public static void main(String[] args) {
		Student student = new Student(1,"Abc");
		System.out.println(student);
		Student student1=student;
		student1=null;
		
		System.out.println();
		
		List<GarbageCollectorMXBean> gcs= ManagementFactory.getGarbageCollectorMXBeans();
		
		for(GarbageCollectorMXBean bean:gcs) {
			System.out.println(bean.getName());
			System.out.println(bean.getClass());
		}
	}
}
