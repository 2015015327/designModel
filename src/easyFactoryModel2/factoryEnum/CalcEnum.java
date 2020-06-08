package easyFactoryModel2.factoryEnum;

import java.lang.String;

public enum CalcEnum {
	ADD("¼Ó","+"),SUB("¼õ","-"),MUL("³Ë","*"),DIV("³ý","/"),OTHER("ÆäËû","");
	String name;
	String code;
	 CalcEnum(String name, String code) {
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public static CalcEnum getEnum(String b){
		CalcEnum[] calctype = CalcEnum.values();
		for(CalcEnum enumtype : calctype){
			if(enumtype.getCode().equals(b) || enumtype.getName().equals(b)){
				return enumtype;
			}
		}
		return CalcEnum.OTHER;
	}
}
