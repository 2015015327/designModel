package adapterModel;



//�ⲿ��Ҫ�����������
public class Adaptee {
	String name;
	String code;
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
	public String show(){
		return "name:"+name+"  code:"+code;
	}
	
}
