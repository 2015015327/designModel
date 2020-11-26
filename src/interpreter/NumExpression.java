package interpreter;

import javaDataStruct.queen.JavaQueen;
import javaDataStruct.stack.JavaStack;

public class NumExpression extends Expression {
	private String arabic[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	private String digit[] = { "分", "角", "元", "拾", "佰", "仟", "万", "拾万", "佰万",
			"仟万", "亿" };
	private String chinese[] = { "零", "壹", "贰", "叄", "肆", "伍", "陆", "柒", "捌",
			"玖" };

	@Override
	public String Interept(Context context) {
		// TODO Auto-generated method stub

		return null;
	}

	public String transArabicToChinese(String arabic) throws Exception {
		if (arabic == null || arabic.length() == 0) {
			return "";
		}
		StringBuffer result = new StringBuffer("");
		// 整数队列
		JavaQueen<String> queen1 = new JavaQueen<String>();
		// 小数队列
		JavaQueen<String> queen2 = new JavaQueen<String>();
		//正则校验是否规范
		Boolean strResult = arabic.matches("?[0-9]+.？[0-9]*");
		if (strResult == true) {
			String str[] = arabic.split(".");
			//判断是否有小数情况存在
			if(str.length==1){
				this.transValueToChi(str);
				result.append("整");
			}else{
				for(int i = 0 ; i < str[0].length() ; i++){
					queen1.in(str[0].substring(i, i+1));
				}
				for(int i = 0 ; i < str[1].length() ; i++){
					queen2.in(str[1].substring(i, i+1));
				}
			}
		} else {
			throw new Exception("输入表达式不规范");
		}
		return arabic;
	}
	public String GetChineseNumByArabic(String value){
		int num = Integer.valueOf(value);
		return chinese[num];
	}
	//将数字整数部分转换为财务字符串
	public String transValueToChi(String str[]){
		JavaQueen<String> queen1 = new JavaQueen<String>();
		StringBuffer result = new StringBuffer("");
		for(int i = 0 ; i < str[0].length() ; i++){
			queen1.in(str[0].substring(i, i+1));
		}
		//判断中间多个0使用
		String num0="";
		while(queen1.size()>0){
			int num = queen1.size();
			//取单个位数
			String res = queen1.out();
			//判断汉字
			String value = this.GetChineseNumByArabic(res);
			if("零".equals(value)){
				num0="零";
				continue;
			}
			//最后一位填入元
			//判断位数
			String digitnum = digit[num+2];
			if("零".equals(num)){
				result.append("零");
				result.append(digitnum);
				num0="";
				if(queen1.size()==0){
					result.append("元");
				}
			}else{
				result.append(value);
				result.append(digitnum);
			}
		}
		return result.toString();
	}
	//将小数部分转换为字符串
}
