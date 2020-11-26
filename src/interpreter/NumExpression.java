package interpreter;

import javaDataStruct.queen.JavaQueen;
import javaDataStruct.stack.JavaStack;

public class NumExpression extends Expression {
	private String arabic[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	private String digit[] = { "��", "��", "Ԫ", "ʰ", "��", "Ǫ", "��", "ʰ��", "����",
			"Ǫ��", "��" };
	private String chinese[] = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��",
			"��" };

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
		// ��������
		JavaQueen<String> queen1 = new JavaQueen<String>();
		// С������
		JavaQueen<String> queen2 = new JavaQueen<String>();
		//����У���Ƿ�淶
		Boolean strResult = arabic.matches("?[0-9]+.��[0-9]*");
		if (strResult == true) {
			String str[] = arabic.split(".");
			//�ж��Ƿ���С���������
			if(str.length==1){
				this.transValueToChi(str);
				result.append("��");
			}else{
				for(int i = 0 ; i < str[0].length() ; i++){
					queen1.in(str[0].substring(i, i+1));
				}
				for(int i = 0 ; i < str[1].length() ; i++){
					queen2.in(str[1].substring(i, i+1));
				}
			}
		} else {
			throw new Exception("������ʽ���淶");
		}
		return arabic;
	}
	public String GetChineseNumByArabic(String value){
		int num = Integer.valueOf(value);
		return chinese[num];
	}
	//��������������ת��Ϊ�����ַ���
	public String transValueToChi(String str[]){
		JavaQueen<String> queen1 = new JavaQueen<String>();
		StringBuffer result = new StringBuffer("");
		for(int i = 0 ; i < str[0].length() ; i++){
			queen1.in(str[0].substring(i, i+1));
		}
		//�ж��м���0ʹ��
		String num0="";
		while(queen1.size()>0){
			int num = queen1.size();
			//ȡ����λ��
			String res = queen1.out();
			//�жϺ���
			String value = this.GetChineseNumByArabic(res);
			if("��".equals(value)){
				num0="��";
				continue;
			}
			//���һλ����Ԫ
			//�ж�λ��
			String digitnum = digit[num+2];
			if("��".equals(num)){
				result.append("��");
				result.append(digitnum);
				num0="";
				if(queen1.size()==0){
					result.append("Ԫ");
				}
			}else{
				result.append(value);
				result.append(digitnum);
			}
		}
		return result.toString();
	}
	//��С������ת��Ϊ�ַ���
}
