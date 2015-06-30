package getQQ_QunInfo;

import java.util.ArrayList;
import java.util.List;
import dataStructsUtils.QQResult;
import dataStructsUtils.QunResult;

public class getQQ_QunInfo {

	
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
