package getQQ_QunInfo;

import java.util.ArrayList;
import java.util.List;

import common.toolUtils;

import dataStructsUtils.QQResult;
import dataStructsUtils.QunResult;
import dataStructsUtils.semaName;
import entity.Results;
import entity.RowEntity;

public class getQQ_QunInfo {
	
	/**
	 * get a qq's info
	 * @param results
	 * @return
	 */
	public static QQResult getLeftQQResult(RowEntity results) {
		
		QQResult qqResult = new QQResult();

		String qqAccount = results.getByName(semaName.qqAccount).getValue();
		qqResult.setQqAccount(qqAccount);
		
		String qqNickName = results.getByName(semaName.qqNickName) == null ? "" : results.getByName(semaName.qqNickName).getValue();
//		System.out.println(qqNickName);
		qqResult.setQqNickName(qqNickName);
		
		String qqName = results.getByName(semaName.qqName) == null ? "" : results.getByName(semaName.qqName).getValue();
		qqResult.setQqName(qqName);
		
		String qqSex = results.getByName(semaName.qqSex) == null ? "" : results.getByName(semaName.qqSex).getValue();
//		System.out.println(qqSex);
		String qqSex1 = toolUtils.getSexString(qqSex);
		qqResult.setQqSex(qqSex1);
		
		String qqAge = results.getByName(semaName.qqAge) == null ? "" : results.getByName(semaName.qqAge).getValue();
		qqResult.setQqAge(qqAge);
		
		String qunNumber = results.getByName(semaName.qunNumber) == null ? "" : results.getByName(semaName.qunNumber).getValue();
		qqResult.setQunNumber(qunNumber);
		
		String qunNickName = results.getByName(semaName.qunNickName) == null ? "" : results.getByName(semaName.qunNickName).getValue();
		qqResult.setQunNickName(qunNickName);
//		qqResult.setQunNickName("假数据喔");
		
		String qunDescription = results.getByName(semaName.qunDescription) == null ? "" : results.getByName(semaName.qunDescription).getValue();
		qqResult.setQunDescription(qunDescription);
//		qqResult.setQunDescription("由于qun_info数据没有入完，所以这里是测试数据");
		
		return qqResult;
		
	}
	

	
	public static QQResult getFakeQQResult() {
		
		QQResult qqResult = new QQResult();
		
		qqResult.setQqAccount("432536");
		
		qqResult.setQqName("我就是齐天大圣娃哈哈");
		
		qqResult.setQqNickName("我就是齐天大圣娃哈哈dasheng");
		
		qqResult.setQqSex("男");
		
		qqResult.setQqAge("34");
		
		qqResult.setQunNumber("323647");
		
		qqResult.setQunNickName("天宫群");
		
		qqResult.setQunDescription("天上神仙在此汇聚，治理人三界安稳，望各位神仙踊跃出谋划策!");
		
		return qqResult;
		
	}
	
	
	public static QunResult getFakeQunResult() {
		
		QunResult qunResult = new QunResult();
		
		qunResult.setQunNumber("2746294");
		
		qunResult.setQunNickName("七仙女之家");
		
		qunResult.setQunCreateTime("2010-12-21");
		
		qunResult.setQunTotalMember("703");
		
		qunResult.setQunDescription("这里是我们仙女之家，牛郎们快来玩耍吧~这里是我们仙女之家，牛郎们快来玩耍吧~这里是我们仙女之家，牛郎们快来玩耍吧~这里是我们仙女之家，牛郎们快来玩耍吧~这里是我们仙女之家，牛郎们快来玩耍吧~");
		
		return qunResult;
	}
	
	
	
	
	/**
	 * fake qq data just to test function
	 * @return
	 */
	public static List<QQResult> getQQResult() {
		
		List<QQResult> qqResultsList =  new ArrayList<QQResult>();
		
		for (int i = 0; i < 20; i++) {
			
			QQResult qqResult = new QQResult();
			
			qqResult = getFakeQQResult();
			
			qqResultsList.add(qqResult);
			
		}
		
		return qqResultsList;
		
	}
	
	
	
	/**
	 * fake qun data 
	 * @return
	 */
	public static List<QunResult> getQunResults() {
		
		List<QunResult> qunResultsList = new ArrayList<QunResult>();
		
		for (int i = 0; i < 20; i++) {
			
			QunResult qunResult = new QunResult();
			
			qunResult = getFakeQunResult();
			
			qunResultsList.add(qunResult);
			
		}
		
		return qunResultsList;
	}
	
	
	
	
	/**
	 * fake QQ detail, right part, all qun info that this qq is a member of it.
	 * @param results
	 * @return
	 */
	public static List<QunResult> getQQDetailResults() {
		
		List<QunResult> qunResultsList = new ArrayList<QunResult>();
		
		for(int i = 0; i < 10; i++) {
			
			QunResult qunResult = new QunResult();
			
			qunResult = getFakeQunResult();
			
			qunResultsList.add(qunResult);
			
		}
		
		return qunResultsList;
	}
	
	
	
	
	/**
	 * fake Qun detail, right part, this qun's members' qq info
	 * @param results
	 * @return
	 */
	public static List<QQResult> getQunDetailResults() {
		
		List<QQResult> qunResultsList = new ArrayList<QQResult>();
		
		for(int i = 0; i < 23; i++) {
			
			QQResult qqResult = new QQResult();
			
			qqResult = getFakeQQResult();
			
			qunResultsList.add(qqResult);
			
		}
		
		return qunResultsList;
	}
	

}
