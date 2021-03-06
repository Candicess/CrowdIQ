package vos;

import java.util.ArrayList;

public class WorkerTaskVos{
	
			//sql语句中select目标可能不止一个，这个目标存取还是用sql解析中的原始数据。 select columns[2],headers[2]
			private ArrayList<String> sqlTargets;
			
			//该问题的描述
			private String questionDescribe;
			
			//sql语句中showing rows[2],rows[3],columns 所以String内容可能是多维数组，这里都以字符串存储
			private ArrayList<String> showing_contents;
			
			//sql语句中根据算法提供的top-k， using headercover on columns[2],columns[3]
			//每一个ArrayList<String>都是一维数组[county:0.12, nation:0.1] 
			private ArrayList<ArrayList<String>> candidateItems;
			
			//工人提交的答案
			private ArrayList<String> submitAnswer;

			public ArrayList<String> getSubmitAnswer() {
				return submitAnswer;
			}

			public void setSubmitAnswer(ArrayList<String> submitAnswer) {
				this.submitAnswer = submitAnswer;
			}

			public ArrayList<String> getSqlTargets() {
				return sqlTargets;
			}

			public void setSqlTargets(ArrayList<String> sqlTargets) {
				this.sqlTargets = sqlTargets;
			}

			public String getQuestionDescribe() {
				return questionDescribe;
			}

			public void setQuestionDescribe(String questionDescribe) {
				this.questionDescribe = questionDescribe;
			}

			public ArrayList<String> getShowing_contents() {
				return showing_contents;
			}

			public void setShowing_contents(ArrayList<String> showing_contents) {
				this.showing_contents = showing_contents;
			}

			public ArrayList<ArrayList<String>> getCandidateItems() {
				return candidateItems;
			}

			public void setCandidateItems(ArrayList<ArrayList<String>> candidateItems) {
				this.candidateItems = candidateItems;
			}

			public WorkerTaskVos(ArrayList<String> sqlTargets, String questionDescribe,
					ArrayList<String> showing_contents, ArrayList<ArrayList<String>> candidateItems,
					ArrayList<String> submitAnswer) {
				super();
				this.sqlTargets = sqlTargets;
				this.questionDescribe = questionDescribe;
				this.showing_contents = showing_contents;
				this.candidateItems = candidateItems;
				this.submitAnswer = submitAnswer;
			}
		
}
