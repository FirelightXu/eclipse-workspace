package action;
import model.goddess;

import java.sql.Date;
import java.util.List;

import dao.GoddessDao;

public class goddessaction {
	public static void main(String[] args) throws Exception {
		GoddessDao g = new GoddessDao();
		
		//���Բ�ѯ���
		List<goddess> gs = g.query();
		
		for (goddess god:gs) {
			System.out.println(god.getUser_name()+","+god.getAge());
		}
//		
//		//�������Ӳ���
		goddess g1 = new goddess();
		g1.setUser_name("husband");
		g1.setId(1);
		
		
//		g.delGoddness(4);
//		
		goddess g2= g.get(6);
		System.out.println(g2.toString());
		
	}
}
